package marker;

public class ShapeDao {
	
	public static boolean delete(Object obj) {
		if(!(obj instanceof Deletable)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Entity1 e1 = new Entity1();
		Entity2 e2 = new Entity2();
		if(delete(e1))	System.out.println("e1 is not deletable");
		else	System.out.println("e2 is deletable");
		if(delete(e2))	System.out.println("e2 is not deletable");
		else System.out.println("e2 is deletable");
		

	}

}
