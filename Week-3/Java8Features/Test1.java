package Java8Features;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface FunctionalInterfaceTest{
	int test();
}
@FunctionalInterface
interface FunctionalInterfaceTest2{
	void test(String name);
}
@FunctionalInterface
interface FunctionalInterfaceTest3{
	String test(String name, int age);
}

public class Test1{
	
	public static void main(String[] args) {
		FunctionalInterfaceTest a = () -> {
			return 5;
		};
		
		a.test();
	
		FunctionalInterfaceTest b = () ->{
			System.out.println("Hello world");
			System.out.println("Hi");
			return 6;
		};
		
		System.out.println((b.test()));
		System.out.println("=========================================");
		
		
		FunctionalInterfaceTest2 c = str -> {
			System.out.println(str);
		};
		
		c.test("Soumya");
		System.out.println("===========================================");
		
		
		FunctionalInterfaceTest3 d = (str, num) ->{
			return str+" "+num;
		};
		
		FunctionalInterfaceTest3 e = (str, num) -> str+" "+num;
		
		System.out.println(d.test("Soumya", 10));
		
		System.out.println(e.test("shruthi", 20));
		
		System.out.println("=================================");
		
//		Predefined Function Fuctional Interface		
		Function<String, Integer> f1 = (str1) ->{
			System.out.println("in Predefined Functional Interface Implementation");
			return 0;
		};
		
		f1.apply("null");

		
//		Predefined BiFunction Interface
		
		BiFunction<String, Integer, String> biF = (str, num) -> {
			System.out.println("in Predefined BiFunctional Interface");
			return str+" "+num;
		};
		
		System.out.println(biF.apply("Soumya", 10));
		System.out.println("=============================================");
		
//		Predicate
		
		Predicate<String> pre = (str) -> {
			if(str.equals("Soumya"))	return true;
			else return false;
		};
		
		System.out.println(pre.test("Soumya"));
		
		System.out.println("===========CONSUMER===============");
		
		final int p=0;
		
		Consumer<Integer> con = (num) -> {
			num = p;
		};
		
		con.accept(10);
		
		Supplier<Integer> sup = ()-> {
			return p;
		};
		
		System.out.println("Value of p:"+ sup.get());
	}

}
