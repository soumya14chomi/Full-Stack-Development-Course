package com.desigPattern.facade;

public class MyResturantFacade {
	private Resturant resturant = new Resturant();
	private DeliveryTeam deliveryTeam = new DeliveryTeam();
	private DeliveryBoy deliveryBoy = new DeliveryBoy();
	
	public void placeOrder() {
		resturant.prepareOrder();
		deliveryTeam.assignDeliveryBoy();
		deliveryBoy.pickUpOrder();
		deliveryBoy.deliverOrder();
	}
}
