package com.demo.lspSolution;

public class Facebook implements PublishPost, ChatWithFriends{

	@Override
	public void post() {
		// TODO Auto-generated method stub
		System.out.println("Posted");
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Message Sent");
	}

}
