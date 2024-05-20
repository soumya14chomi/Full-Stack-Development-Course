package reactiveProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Print All the Numbers in intNumberStream
		 * 2. Print numbers from intNumbersStream >5
		 * 3. Print 2nd and 3rd greatest numbers in the intNumberStream >5
		 * 4. Print First Number in the intNumberStream >5
		 * 5. Print the First Names of all the Users
		 */
		System.out.println("1.");
		List<Integer> res1 = StreamSources.intNumbersStream().collect(Collectors.toList());
		System.out.println(res1);
		
		System.out.println("\n2.");
		List<Integer> res2 = StreamSources.intNumbersStream().filter(x -> x>5).collect(Collectors.toList());
		System.out.println(res2);
		
		System.out.println("\n3.");
		StreamSources.intNumbersStream().filter(x -> x>5).skip(1)
				.limit(2).forEach(System.out::println);
		System.out.println("\n4.");
		
		StreamSources.intNumbersStream().filter(x -> x>5).limit(1)
		.forEach(System.out::println);
		System.out.println("\n5.");
		
		StreamSources.userStream().map(x -> x.getFirstName()).forEach(System.out::println);
		
		/*
		 * 6. Print the first Names of all the Users that have IDs from Number Stream
		 * 
		 */
//		StreamSources.userStream().filter(x -> {
//			for (int i:: StreamSources.intNumbersStream().collect(Collectors.toList()))
//		})
		System.out.println("\n6.");
		StreamSources.intNumbersStream().flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))
		.map(user -> user.getFirstName()).forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
