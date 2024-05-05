package exception;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str= "Hi";
			System.out.println(str.length());
			
			int[] arr = {1,2,3,4};
			System.out.println(arr[10]);
			System.out.println("Cannot execute this statement");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
		System.out.println("After try-catch");
		try {
			System.out.println("try-without Catch");
		}
		finally {
			System.out.println("From Finally");
		}
	}

}
