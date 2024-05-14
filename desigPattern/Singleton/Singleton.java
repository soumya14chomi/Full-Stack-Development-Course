package com.desigPattern.Singleton;

public class Singleton implements Cloneable{
	
	private volatile static Singleton singleton;
	private Singleton() {
		
	}
	
	/*
	 * 1st Version: will create multiple instances if two threads access getInstance() simultaneously
	 */
	public static Singleton getInstance() {
		if(singleton == null)	
			singleton = new Singleton();
		return singleton;
	}
	/*
	 * 2nd Version: This getInstance method will thread-safe and will create only one instance of Singleton
	 * class even in case of multi-threading access on concurrent environment. But, this approach is 
	 * unnecessarily expensive due to cost of synchronization
	 */
	public static synchronized Singleton getInstanceTS() {
		if(singleton == null)	
			singleton = new Singleton();
		return singleton;
	}
	
	/*
	 * 3rd Version: An implementation of double checked lock on Singleton.
	 * Here, the intension is to minimize the cost of synchronization and 
	 */
	
	
	
	public static Singleton getInstanceDC() {
		if(singleton == null) {
			synchronized (Singleton.class){
				if(singleton == null)	singleton = new Singleton();
				
			}
		}
		return singleton;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		throw new CloneNotSupportedException();
	}
	
	void test() {
		System.out.println("In Singleton Test:"+singleton.hashCode());
	}
}
