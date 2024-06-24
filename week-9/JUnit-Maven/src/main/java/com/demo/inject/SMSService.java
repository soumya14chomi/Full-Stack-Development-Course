package com.demo.inject;

public class SMSService implements Service {

	public boolean send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("SMS Sent:" + msg);
		return false;
	}

}
