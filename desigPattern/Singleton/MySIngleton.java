package com.desigPattern.Singleton;

class Address{
	int addressId;
	String adressName;
	static Address address;
	
	private Address() {
		
	}
	
	public static Address getInstance() {
		if(address == null)	address =  new Address();
		return address;
	}


	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAdressName() {
		return adressName;
	}

	public void setAdressName(String adressName) {
		this.adressName = adressName;
	}



}

public class MySIngleton {
	
	public static void main(String[] args){

		Address add1 = Address.getInstance();
		Address add2 = Address.getInstance();
		System.out.println(add1.toString() + "\n" + add2.toString());
	}

}
