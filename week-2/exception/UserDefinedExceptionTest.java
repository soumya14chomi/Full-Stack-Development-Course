package exception;

public class UserDefinedExceptionTest extends RuntimeException{
	UserDefinedExceptionTest(String err) {
		//System.out.println(err);
		super(err);
	}
	public static int test()    {
		try  
		{
		return 0;
		}
		finally 
		{
		System.out.println("Inside Finally block");
		}
		}
		public static void main(String args[])  {
			try {
				long[] n =new long[1000000000];
			}
			finally {
				System.out.println("in finally");
			}
		}

}
