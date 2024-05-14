package Java8Features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee(101, "Soumya", "CSE", 1000f, "Hyd"), new Employee(102, "Chomi", "BBA" , 2000f, "L B N"), 
								new Employee(103, "Jumbu", "IIT", 3000f, "Bglr"), new Employee(104, "D-joo", "Civil", 1000f, "nglr"),
								new Employee(105, "Ram", "ECE", 6000f, "Hyd"));
		
		//Sort emp according to Salary
		emp = emp.stream().sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary())).collect(Collectors.toList());
		
		System.out.println(emp.toString());
		
		//Runnable Interface Implementation
		
//		Runnable r = () ->{
//			for(int i=0;i<10;i++)	System.out.println(i);
//		};
		Thread th = new Thread(() -> {
			//for(int i=0;i<10;i++)	System.out.print(i+" ");
		});		
		
		th.start();
		
		//Find Employee with Name "Soumya"
		
		Optional<Employee> emp1 = emp.stream().reduce((ans, e) -> e.getName().equals("")? ans = e : ans);
		
		//System.out.println(emp1.toString());
		
		//OR
		
		Employee emp2 = emp.stream().filter(e -> e.getName().equals("Soumya")).findFirst().orElse(null);
		
		System.out.println(emp2.toString());
		
		//Find names of Employees with Salary > 2000
		List<String> emp3 = emp.stream().filter(e -> e.getSalary() > 2000).map(e -> e.getName()).collect(Collectors.toList());
		
		System.out.println(emp3.toString());
		System.out.println("============================================================");
		
		//Count the occurrences of each character in a String
		
		String str = "sjdhsdhfghjsvfsahsdbhvgsfjsa";
		
		
		Map<Character, Long> hm =new HashMap<>();
		
		str.chars().mapToObj(c -> (char) c).forEach((ch)->{
			hm.put(ch, hm.getOrDefault(ch, (long) 0)+1);
		});
		
		System.out.println(hm.toString());
		
		// OR
		
		Map<Character, Long> map = str.chars().mapToObj(c -> (char)c).
				collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
	}

}
