package com.test.poly;

public class InterfaceImplmentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySQLDBLogic mysql = new MySQLDBLogic();
		MongoDBLogic mongo = new MongoDBLogic();
		mysql.save();
		mysql.delete();
		mysql.find();
		mysql.update();
		mongo.save();
		mongo.delete();
		mongo.find();
		mongo.update();
	}

}
