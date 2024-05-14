package java11Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Java11Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(101, "Soumya", 100f));
		emp.add(new Employee(102, "Shruthi", 200f));
		
		System.out.println(emp+"\n===============================\n");
			
		Employee[] empArray = emp.toArray(size -> new Employee[size]);
		
		Employee[] empArray1 = emp.toArray(Employee[] :: new);
		
		System.out.println(Arrays.toString(empArray));
		
		var num = 100.5;
		
		BiFunction<Integer, Integer, Integer> biFun = (var x, var y) -> x+y;
		
		System.out.println(biFun.apply(3, 7));
		
		
		
		

	}

}
