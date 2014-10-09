package com.haizhi.sms.service;

import java.text.MessageFormat;
import java.util.Properties;

/**
 * Created by txfan on 10/9/14.
 */
public abstract class ShortMessageService {

    public abstract String sendMessage(String phone, String message);

    public String sendMessage(String phone, String messageTemplate, Object... args) {
        String message = MessageFormat.format(messageTemplate, args);
        return sendMessage(phone, message);
    }

    public abstract void init(Properties props);

}
