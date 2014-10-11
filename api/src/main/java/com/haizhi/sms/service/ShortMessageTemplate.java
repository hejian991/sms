package com.haizhi.sms.service;

/**
 * Created by txfan on 10/9/14.
 */
public class ShortMessageTemplate {

    // 注意事项：
    // 1. 所有模板后面都加上 (微办公)；
    // 2. 短信数字不能超过70字，多了会切成多条发送。接收端iOS有合成功能，某些Android手机不支持该功能。文字内容要确保不会在URL链接中被截断。


    // 邀请企业客户试用，参数{0}为手机号
    public static final String INVITE_ORGANIZATION = "欢迎您试用移动互联网时代最好用的办公平台-海智微办公，成为我们精心选择邀请的前100名用户。" +
            "请点http://t.cn/RhfSaCC 下载安装后用{0}注册。即可用微办公轻松掌控工作，提升办公效率！" +
            "期待您的使用反馈！客服电话4000659966。【微办公】";

    // 企业客户自行注册，参数{0}为手机号
    public static final String REGISTER_ORGANIZATION = "感谢你注册移动互联网时代最好用的办公平台-海智微办公！" +
            "即刻启用，将你的公司装进手机里，对公司进行随时随地的管理，从而提升办公效率！" +
            "请点击http://t.cn/RhfSaCC 下载安装后用{0}注册。客服电话4000659966。【微办公】";

    // 企业管理员邀请同事，参数{0}为管理员姓名，{1}为手机号
    public static final String INVITE_PERSON = "{0}邀请您加入移动互联网时代最好用的办公平台-海智微办公。" +
            "请点击http://t.cn/RhfSaCC 下载安装后用{1}注册。注：pc登录网址http://oa.haizhi.com 。【微办公】";

    // 新同事注册、激活帐号，参数{0}为验证码
    public static final String ACTIVATTE_ACCOUNT = "{0}为您的海智微办公注册验证码，请在15分钟内完成输入。如非本人操作，请忽略。详询客服 4000659966。【微办公】";

    // 忘记密码，通过手机验证码重置，参数{0}为验证码
    public static final String RESET_PASSWORD = "{0}为您的海智微办公密码找回验证码，请在15分钟内完成输入。如非本人操作，请忽略。【微办公】";

}
