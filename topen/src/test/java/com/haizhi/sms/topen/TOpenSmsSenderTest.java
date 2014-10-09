package com.haizhi.sms.topen;

import java.io.FileInputStream;
import java.util.Properties;

import static org.junit.Assert.assertNotNull;

public class TOpenSmsSenderTest {

    // TODO check with 刘润
    // 1. 所有模板后面都加上   【微办公】，还是 【海智】?
    // 2. 文字内容是否恰当
    // 3. 短信数字不能超过70字，多了会切成多条发送。接收端iOS有合成功能，某些Android手机不支持该功能。文字内容要确保不会在URL链接中被截断。
    // 4. 是否还需要其它短信模板
    private String[] templates = {
            "欢迎您试用移动互联网时代最好用的办公平台-海智微办公，成为我们精心选择邀请的前100名用户。请点击 http://t.cn/RhfSaCC 下载安装后用{phoneNumber}注册，即可用微办公轻松掌控工作，提升办公效率！期待您的使用反馈！", // phoneNumber 为11位的手机号
            "{userFullName}邀请您一同使用微办公：http://t.cn/RhfSaCC ，下载后用{phoneNumber}注册，尽快与他打招呼。", // userFullname 为用户真实姓名
            "海智微办公新用户注册验证码为{verificationCode}。注册码两分钟内有效。", // verificationCode 为6位数字
            "海智微办公验证码：{verificationCode}"
    };


    @org.junit.Test
    public void testSendMessage() throws Exception {
        Properties properties = new Properties();
        String userHome = System.getProperty("user.home");
        properties.load(new FileInputStream(userHome + "/haizhi.properties"));
        TOpenSmsSender smsSender = new TOpenSmsSender();
        smsSender.init(properties);
        // TODO generate a random verification code
        String randomCode = produceCode();
        //String result = smsSender.sendMessage("18610741478", "您的验证码是：12345【微办公】");
        String result = smsSender.sendMessage("18518026478", "您的验证码是："+randomCode+"【微办公】");
        assertNotNull(result);

    }

    //生成六位验证码
    public String produceCode() {
        String result;
        int temp = 0;
        double code = Math.random();
        temp = (int) (code * 1000000);
        result = Integer.toString(temp);
        if (temp < 100000) {
            result += Integer.toString((int) (Math.random() * 10));
        }
        return result;
    }
}