package com.haizhi.sms.topen;

public class testweb {

	public static void main(String[] args) {
		MsgSend server = new MsgSend();
		MsgSendSoap spt = server.getMsgSendSoap();
	    System.out.println(spt.sendMsg("??", "???", "18616300212","��ߵ��й�[123]", ""));

	}

}
