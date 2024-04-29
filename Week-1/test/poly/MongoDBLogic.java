package com.test.poly;

public class MongoDBLogic implements DBLogic{
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Mongo item saved");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Mongo item deleted");
		
	}
	
	public void update() {
		System.out.println("Mongo item Updated");
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("Mongo item Found");
		
	}
}
