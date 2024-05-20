package com.demo.dip;

public class ShoppingMall {
	public static void main() {
		
	}
	public static void main(String[] args) {
		BankCard bc = new ADebitCard();
		if(bc instanceof DebitCard) {
			System.out.println("Allow");
		}
	}
}


//Implementation of "D" in SOLID principles