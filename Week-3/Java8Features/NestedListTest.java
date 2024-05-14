package Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import MethodReferencesExamples.CustomerDB;

public class NestedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<String>> nums = new CustomerDB().getAllCustomer().stream().map(c -> c.getMobileNo())
				.collect(Collectors.toList());
		System.out.println(nums);
		
		//Converting into 1-D List using flatMap
		List<String> numbers = new CustomerDB().getAllCustomer().stream().flatMap(c -> c.getMobileNo().stream())
				.collect(Collectors.toList());
		
		System.out.println(numbers);
		
		List<Integer> ls = Arrays.asList(1,4, 5, 4,73, 6,3,4);
		
		int scnd_largest = ls.stream().sorted((n1, n2) -> n2.compareTo(n1)).distinct().skip(1)
				.findFirst().orElse(null);
		
		System.out.println(scnd_largest);
		
		//Find the List of Strings occuring more than once
		
		List<String> fruits = Arrays.asList("apple", "banana", "orange", "banana", "orange", "orange", "banana");
		
		Map<String, Long> mp = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			
		List<String> sortedFruits = mp.keySet().stream().filter(fruit -> mp.get(fruit) > 1).collect(Collectors.toList());
		
		System.out.println(sortedFruits);
		
		//OR
		
		fruits = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
		
		System.out.println(fruits);
	}

}
