package exception;

public class Test3 {
	
	static void checkAge(int age)  throws UserDefinedExceptionTest{
		if(age<0) {
			throw new UserDefinedExceptionTest("Age cannot be zero");
		}	
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		checkAge(-1);
	}

}
