package reactiveProgramming;

import java.util.stream.Stream;

public class StreamSources {
	public static Stream<String> stringNumbersStream(){
		return Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight");
	}
	
	public static Stream<Integer> intNumbersStream(){
		return Stream.iterate(0, i->i+2).limit(10);
	}
	
	public static Stream<User> userStream(){
		return Stream.of(
				new User(1, "Namani", "Soumya"),
				new User(2, "Malla", "Sravani"),
				new User(3, "Namani", "Shruthi"),
				new User(4, "Pasham", "Mouni"),
				new User(5, "Akanksha", "Pandey")
				);
	}
}
