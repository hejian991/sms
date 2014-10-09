package com.haizhi.sms.service;

import java.util.Properties;

/**
 * Created by txfan on 10/9/14.
 */
public abstract class SmsSender {

    public abstract String sendMessage(String phone, String message);

    public abstract void init(Properties props);

}
