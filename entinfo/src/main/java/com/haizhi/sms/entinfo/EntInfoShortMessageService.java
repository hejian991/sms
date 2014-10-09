package com.haizhi.sms.entinfo;

import com.haizhi.sms.service.ShortMessageService;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Properties;

/**
 * Created by txfan on 10/9/14.
 */
@Slf4j
public class EntInfoShortMessageService extends ShortMessageService {

    private String url;

    private String userId;

    private String password;

    @Override
    public void init(Properties props) {
        url = props.getProperty("sms.url");
        userId = props.getProperty("sms.userId");
        password = props.getProperty("sms.password");
    }

    @Override
    public String sendMessage(String pszMobis, String pszMsg) {
        DataOutputStream out = null;
        BufferedReader in = null;
        try {
            //post请求参数
            String param = "userId=" + userId + "&password=" + password + "&pszMobis=" + pszMobis + "&pszMsg=" + URLEncoder.encode(pszMsg, "gb2312") + "&iMobiCount=1&pszSubPort=";
            int len = param.length();
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection();
            // 设置通用的请求属性
//          conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Content-Length", Integer.toString(len));
            conn.setRequestProperty("Connection", "Close");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);

            // 获取URLConnection对象对应的输出流
            out = new DataOutputStream(conn.getOutputStream());
            // 发送请求参数
            out.writeBytes(param);
            // flush输出流的缓冲
            out.flush();
            System.out.println(param);

            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            // TODO 解析返回的XML文档，提前序列号
            String line;
            StringBuffer buf = new StringBuffer();
            while ((line = in.readLine()) != null) {
                buf.append(line);
            }
            return buf.toString();
        } catch (Exception e) {
            log.error("发送 POST 请求出现异常！" + e);
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
}
