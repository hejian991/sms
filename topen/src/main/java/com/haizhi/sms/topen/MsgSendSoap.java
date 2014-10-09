
package com.haizhi.sms.topen;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MsgSendSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MsgSendSoap {


    /**
     * 
     * @param desNo
     * @param userCode
     * @param channel
     * @param msg
     * @param userPass
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SendMsg", action = "http://tempuri.org/SendMsg")
    @WebResult(name = "SendMsgResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SendMsg", targetNamespace = "http://tempuri.org/", className = "com.demo.client.SendMsg")
    @ResponseWrapper(localName = "SendMsgResponse", targetNamespace = "http://tempuri.org/", className = "com.demo.client.SendMsgResponse")
    public String sendMsg(
            @WebParam(name = "userCode", targetNamespace = "http://tempuri.org/")
            String userCode,
            @WebParam(name = "userPass", targetNamespace = "http://tempuri.org/")
            String userPass,
            @WebParam(name = "DesNo", targetNamespace = "http://tempuri.org/")
            String desNo,
            @WebParam(name = "Msg", targetNamespace = "http://tempuri.org/")
            String msg,
            @WebParam(name = "Channel", targetNamespace = "http://tempuri.org/")
            String channel);

    /**
     * 
     * @param userCode
     * @param userPass
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetBalance", action = "http://tempuri.org/GetBalance")
    @WebResult(name = "GetBalanceResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBalance", targetNamespace = "http://tempuri.org/", className = "com.demo.client.GetBalance")
    @ResponseWrapper(localName = "GetBalanceResponse", targetNamespace = "http://tempuri.org/", className = "com.demo.client.GetBalanceResponse")
    public String getBalance(
            @WebParam(name = "userCode", targetNamespace = "http://tempuri.org/")
            String userCode,
            @WebParam(name = "userPass", targetNamespace = "http://tempuri.org/")
            String userPass);

    /**
     * 
     * @param userCode
     * @param userPass
     * @param minId
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetMoExt", action = "http://tempuri.org/GetMoExt")
    @WebResult(name = "GetMoExtResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMoExt", targetNamespace = "http://tempuri.org/", className = "com.demo.client.GetMoExt")
    @ResponseWrapper(localName = "GetMoExtResponse", targetNamespace = "http://tempuri.org/", className = "com.demo.client.GetMoExtResponse")
    public String getMoExt(
            @WebParam(name = "userCode", targetNamespace = "http://tempuri.org/")
            String userCode,
            @WebParam(name = "userPass", targetNamespace = "http://tempuri.org/")
            String userPass,
            @WebParam(name = "minId", targetNamespace = "http://tempuri.org/")
            String minId);

    /**
     * 
     * @param userCode
     * @param userPass
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetMo", action = "http://tempuri.org/GetMo")
    @WebResult(name = "GetMoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMo", targetNamespace = "http://tempuri.org/", className = "com.demo.client.GetMo")
    @ResponseWrapper(localName = "GetMoResponse", targetNamespace = "http://tempuri.org/", className = "com.demo.client.GetMoResponse")
    public String getMo(
            @WebParam(name = "userCode", targetNamespace = "http://tempuri.org/")
            String userCode,
            @WebParam(name = "userPass", targetNamespace = "http://tempuri.org/")
            String userPass);

    /**
     * 
     * @param userCode
     * @param batchNumber
     * @param userPass
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetReport", action = "http://tempuri.org/GetReport")
    @WebResult(name = "GetReportResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetReport", targetNamespace = "http://tempuri.org/", className = "com.demo.client.GetReport")
    @ResponseWrapper(localName = "GetReportResponse", targetNamespace = "http://tempuri.org/", className = "com.demo.client.GetReportResponse")
    public String getReport(
            @WebParam(name = "userCode", targetNamespace = "http://tempuri.org/")
            String userCode,
            @WebParam(name = "userPass", targetNamespace = "http://tempuri.org/")
            String userPass,
            @WebParam(name = "batchNumber", targetNamespace = "http://tempuri.org/")
            String batchNumber);

}
