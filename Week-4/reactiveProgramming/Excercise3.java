package reactiveProgramming;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise3 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 1. Print All the Numbers in ReactiveSource.intnumberFlux Stream without log
		 * 2. Print All the Numbers in ReactiveSource.intnumberFlux Stream without log in list
		 * 3. Print All the Numbers in ReactiveSource.intnumberFlux Stream without log in list
		 * 
		 */
//		System.out.println("1.");
//		ReactiveSources.intNumbersFlux().subscribe(System.out::println);
		
		
		System.out.println("\n2.");
		List<Integer> res = ReactiveSources.intNumbersFlux().toStream().toList();
		System.out.println(res);
		
//		System.out.println("\n3.");
//		List<Integer> res1 = ReactiveSources.intNumbersFlux().log().toStream().toList();
//		System.out.println("Press any key to Continue");
//		System.out.println(res1);
		
		/*
		 *  4. Print numbers from intNumbersFlux >5
		 */
//		System.out.println("\n3.");
//		ReactiveSources.intNumbersFlux().subscribe(x -> {
//			if(x>5)	System.out.println(x);
//		});
//
//		
		//OR
//		System.out.println("OR\n");
		
//		ReactiveSources.intNumbersFlux().filter(x -> x>5).subscribe(System.out::println);
//		
		
		/*
		 * 5. Print the num*10 for first 3 numbers from intNumberFlux where num>5
		 */
		System.out.println("\n5.");
		ReactiveSources.intNumbersFlux().toStream()
			.filter(x -> x>5).limit(3).map(x -> x*10).forEach(System.out::println);
		System.out.println("OR");
		//OR
		//ReactiveSources.intNumbersFlux().filter(x -> x>5).map(x -> x*10).subscribe(System.out::println);
		
		/*
		 * Print values from intNumberFlux >20, if null print -1
		 */
		//System.out.println("\n6.");
		//ReactiveSources.intNumbersFlux().filter(x -> x>20).defaultIfEmpty(-1).subscribe(System.out::println);		
		
		/*
		 * Map numbers from the intNumberflux to the right number from the number flux
		 */
		
		ReactiveSources.intNumbersFlux().flatMap(num -> ReactiveSources.userFlux().filter(user -> user.getId() == num))
		.take(3).subscribe(System.out::println);
		System.in.read();
	}
}
