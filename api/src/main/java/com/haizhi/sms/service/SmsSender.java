package com.haizhi.sms.service;

/**
 * Created by txfan on 10/9/14.
 */
public interface SmsSender {

    String sendMessage(String phone, String message);

}
