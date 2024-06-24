package com.demo.inject;

public class EmailService implements Service {

	public boolean send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Email Sent:" + msg);
		return false;
	}

}
