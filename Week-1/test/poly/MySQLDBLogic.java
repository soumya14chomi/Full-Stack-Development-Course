/**
 * 
 */
package com.test.poly;

/**
 * 
 */
public class MySQLDBLogic implements DBLogic{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("MySQL item saved");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySQL item deleted");
		
	}
	
	public void update() {
		System.out.println("MySQL item Updated");
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		System.out.println("MySQL item Found");
		
	}

	

}
