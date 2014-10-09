package com.haizhi.sms.topen;

import com.haizhi.sms.service.ShortMessageService;

import java.util.Properties;

/**
 * Created by txfan on 10/9/14.
 */
public class TOpenShortMessageService extends ShortMessageService {

    private String username;

    private String password;

    @Override
    public void init(Properties props) {
        username = props.getProperty("topen.sms.username");
        password = props.getProperty("topen.sms.password");
        MsgSend.init(props);
    }

    @Override
    public String sendMessage(String phone, String message) {
        MsgSend server = new MsgSend();
        MsgSendSoap spt = server.getMsgSendSoap();
        String result = spt.sendMsg(username, password, phone, message, "");
        return result;
    }
}