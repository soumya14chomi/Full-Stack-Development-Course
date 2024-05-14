package Java8Features;

interface myInterface{
	void test();
	default void test1() {
		System.out.println("Inside Default Method");
	}
	static void test2() {
		System.out.println("Inside Static Method");
	}
	
}

public class DefaultAndStaticTest implements myInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		System.out.println("Overriden Test");
		
	}
	
	@Override
	public void test1() {
		System.out.println("Overidden Test-2");
	}
	
	

}
