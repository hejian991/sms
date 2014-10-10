package com.haizhi.sms.service;

import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.util.Properties;

import static org.junit.Assert.assertNotNull;


public abstract class ShortMessageServiceTest {

    protected ShortMessageService shortMessageService;

    @Before
    public void init() throws Exception {
        Properties properties = new Properties();
        String userHome = System.getProperty("user.home");
        properties.load(new FileInputStream(userHome + "/haizhi.properties"));
        shortMessageService.init(properties);
    }

    @Test
    public void testSendMessageToChinaMobile() throws Exception {
        // TODO generate a random verification code
        String result = shortMessageService.sendMessage("18518026478", "您的验证码是："+generateVcode()+"【微办公】");
        assertNotNull(result);
    }

    @Test
    public void testSendMessageToChinaUnicom() throws Exception {
        // TODO generate a random verification code
        String result = shortMessageService.sendMessage("18518026478", "您的验证码是："+generateVcode()+"【微办公】");
        assertNotNull(result);
    }

    @Test
    public void testSendParameterizedMessage() throws Exception {
        String name = "朱升华";
        String vcode = generateVcode();
        String mobile = "18518026478";


        assertNotNull(shortMessageService.sendMessage(mobile, ShortMessageTemplate.INVITE_ORGANIZATION, mobile));
        assertNotNull(shortMessageService.sendMessage(mobile, ShortMessageTemplate.REGISTER_ORGANIZATION, mobile));
        assertNotNull(shortMessageService.sendMessage(mobile, ShortMessageTemplate.INVITE_PERSON, name, mobile));
        assertNotNull(shortMessageService.sendMessage(mobile, ShortMessageTemplate.ACTIVATTE_ACCOUNT, vcode));
        assertNotNull(shortMessageService.sendMessage(mobile, ShortMessageTemplate.RESET_PASSWORD, vcode));
    }


    //生成六位验证码
    public String generateVcode() {
        String result;
        int temp = 0;
        double code = Math.random();
        temp = (int) (code * 1000000);
        result = Integer.toString(temp);

        for (int i=result.length(); i<6; i++) {
            result += Integer.toString((int) (Math.random() * 10));
        }
        return result;
    }
}