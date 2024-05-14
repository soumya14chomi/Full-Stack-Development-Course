package com.desigPattern.FactoryDesignPattern;

public class FactoryTest {
	public static void main(String[] args) {
		FactoryClass fclass = new FactoryClass();
		Employee software = fclass.getEmployee("software");
		Employee permanent = fclass.getEmployee("permanent");
		Employee contractor = fclass.getEmployee("contractor");
		software.work();
		permanent.work();
		contractor.work();
	}
}
