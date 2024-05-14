package marker;

class MyI implements Cloneable{
	private Integer i;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
		
	}
	public Integer getI() {
		return i;
	}
	public void setI(Integer i) {
		this.i = i;
	}
}

public class ClonableTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		MyI myI = new MyI();
		myI.setI(10);
		MyI myI2 = (MyI) myI.clone();
		
		System.out.println(myI.hashCode()+" "+myI2.hashCode());
		System.out.println(myI.getI()+" "+myI2.getI());
	}

}
