package Java8Features;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		List<String> ls = Arrays.asList("I", "hi", "", "hello", "p", "");
//		To return number of empty strings in ls
		int count = (int) ls.stream().filter(e -> e.length()>1).count();
		

		System.out.println("Count:"+count);
		
		Stream<String> s = ls.stream().filter(e -> e.length()>1);
		
		
		System.out.println("Elements in String:");
		
		Iterator itr =s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		Changing the values of the list
//		
//		ls = ls.stream().map(e-> {
//			if(e.length()<1)	return e;
//			else	return e+" Changed";
//		}).collect(Collectors.toList());
//		
//		System.out.println(ls.toString());
		
//		OR
		
		ls = ls.stream().map(e-> e.length()>2?e: e+" Changed").collect(Collectors.toList());
		
		System.out.println(ls.toString());
		
		
		List<Integer> p = Arrays.asList(1, 2, 3, 4, 7, 10, 7, 7);
		
		//Find the Square of each element of the p
		
		p = p.stream().map(x -> x*x).distinct().collect(Collectors.toList());
		
		System.out.println("Squared List:"+p.toString());
		
		//Find max element of the Array
		System.out.print("Using ForEach:");
		p.stream().forEach(e -> System.out.print(e+" "));
		
		//Get Statistics of The List
		IntSummaryStatistics stats = p.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println();
		System.out.println("Max:"+stats.getMax());
		System.out.println("Min:"+stats.getMin());
		System.out.println("Count:"+stats.getCount());
		System.out.println("Avg:"+stats.getAverage());
	}
}
