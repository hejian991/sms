package com.haizhi.sms.topen;

import com.haizhi.sms.service.ShortMessageService;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * Created by txfan on 10/9/14.
 */
@Slf4j
public class TOpenShortMessageService extends ShortMessageService {

    private String username;

    private String password;

    private String endpoint;

    private MsgSend server;

    private MsgSendSoap spt;

    @Override
    public void init(Properties props) {
        username = props.getProperty("topen.sms.username");
        password = props.getProperty("topen.sms.password");
        endpoint = props.getProperty("topen.sms.endpoint");
        if (endpoint == null) {
            log.error("TOpen Sms server's url is failed to load. The current url is null.");
            throw new RuntimeException("TOpen Sms server's url is failed to load. The current url is null.");
        }
        MsgSend.init(endpoint);
        try {
            server = new MsgSend();
            spt = server.getMsgSendSoap();
        } catch (Exception e) {
            log.error("cannot access to server. The server address or soap port has been changed.");
        }
    }

    @Override
    public String sendMessage(String phone, String message) {
        if (username == null)
            log.error("TOpenSms: the username was failed to load from property file. The current username is null.");
        if (password == null)
            log.error("TOpenSms: the password was failed to load from property file. The current password is null.");
        String result = spt.sendMsg(username, password, phone, message, "");
        if (result.charAt(0) == '-') {
            switch (result) {
                case "-1":
                    log.error("soap port was wrong.");
                    break;
                case "-3":
                    log.error("username or password was wrong.");
                    break;
                case "-4":
                    log.error("message content didn't match with backup pattern.");
                    break;
                case "-5":
                    log.error("signature at the end of message was wrong.");
                    break;
                case "-7":
                    log.error("balance of the account was not enough.");
                    break;
                case "-8":
                    log.error("channel number was wrong.");
                    break;
                case "-9":
                    log.error("receiver's phone number was illegal.");
                    break;
                case "-10":
                    log.error("signature length was illegal.");
                    break;
                case "-11":
                    log.error("short message service has been expired.");
                    break;
                default:
                    log.error("unknown error code.");
                    break;
            }
        }
        return result;
    }
}
