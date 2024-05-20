package reactiveProgramming;

import java.io.IOException;

public class Excercise2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 1. Print All the Numbers in ReactiveSource.intnumberFlux Stream
		 * 2. Print All the Users From Userflux Stream
		 */
		System.out.println("1.");
		ReactiveSources.intNumbersFlux().subscribe(System.out::println);
		//System.in.read();
		
		System.out.println("\n2.");
		ReactiveSources.userFlux().subscribe(user -> 
			System.out.println(user.getFirstName()+" "+user.getLastName()));
		

		System.in.read();

	}

}
