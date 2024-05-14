package reflectClass;

public class SampleTest {

	private SampleTest() {
		// TODO Auto-generated constructor stub]
		System.out.println("in Private Constructors");
	}
	
	private String test() {
		return "This is from private method";
	}
	
	private String test2(String str1, int  num1) {
		return "This is from private Method-2";
	}

}
