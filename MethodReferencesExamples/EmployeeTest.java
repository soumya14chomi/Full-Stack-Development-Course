package MethodReferencesExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = Arrays.asList(new Employee("Soumya", 24, "CSE", 3981 ), new Employee("Ravi", 32, "ECE", 2093), 
				new Employee("Teena", 29, "CSE", 3922), new Employee("Ramesh", 22, "ECE", 2732), 
				new Employee("Bhabhi", 38, "ECE", 2392));
		
//		Find highest salary in each department
		
//		Map<Character, Long> map = str.chars().mapToObj(c -> (char)c).
//				collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		List<Employee> res = emp.stream().sorted((e1, e2) -> e2.getSalary().compareTo(e1.getSalary()))
				.collect(Collectors.groupingBy(Employee::getDept)).entrySet().stream()
				.map(eSet -> eSet.getValue().stream().findFirst().orElse(null)).collect(Collectors.toList());
		
//		OR
		
		List<Employee> res1 = emp.stream().collect(Collectors.groupingBy(Employee::getDept), 
				collectingAndThen(maxBy(Comparator.comparingInt(Employee::getSalary)), Optional ::get));
		
		System.out.println(res);
	}

}
