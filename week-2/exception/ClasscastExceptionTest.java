package exception;

public class ClasscastExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			ParentInterface i = new InterfaceChild();
			InterfaceChild c = new InterfaceChild();
			c= (InterfaceChild)i; //ask how?
			c.test();
			ChildClass ch = (ChildClass)new ParentClass();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
			try
			{
			int i;
			return ;
			}
			catch (Exception e)
			{
			System.out.println("inCatchBlock");
			}
			finally
			{
			System.out.println("inFinallyBlock");
			}
	}

}
