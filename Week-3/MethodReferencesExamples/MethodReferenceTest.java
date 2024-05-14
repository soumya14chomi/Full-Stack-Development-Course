package MethodReferencesExamples;

public class MethodReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDB.getAllCustomer().stream().forEach(c -> System.out.println(c));
		System.out.println("===================");
//		OR
		//new CustomerDB().getAllCustomer().stream().forEach(c ->display(c));
		System.out.println();
//		OR
		CustomerDB.getAllCustomer().stream().forEach(System.out::println);
		System.out.println("===========================");
//		OR
		MethodReferenceTest mf =new MethodReferenceTest();
		CustomerDB.getAllCustomer().stream().forEach(mf :: display);
		System.out.println("===========================");
		
		CustomerDB.getAllCustomer().stream().map(CustomerMapper::convert).forEach(System.out::println);
		System.out.println("==========================");
		
//		Calling a non-static non-parameterized methods with directly class name
		CustomerDB.getAllCustomer().stream().map(Customer::getName).forEach(System.out::println);

	}
	
	public void display(Customer c) {
		System.out.println(c);
	}

}
