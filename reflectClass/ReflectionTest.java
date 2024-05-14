package reflectClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

	public ReflectionTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<SampleTest>pcc = SampleTest.class.getDeclaredConstructor();
		pcc.setAccessible(true);
		SampleTest constructor = pcc.newInstance();
		
		Method method = SampleTest.class.getDeclaredMethod("test", null);
		method.setAccessible(true);
		System.out.println(method.invoke(constructor));
		
		Method method2 = SampleTest.class.getDeclaredMethod("test2", String.class, int.class);
		method2.setAccessible(true);
		System.out.println(method2.invoke(constructor, "Hello", 2));
	}
}
