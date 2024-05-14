package Java8Features.OptionalClass;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> str = Optional.of("SOumya");
		
		Optional empty = Optional.empty();
		
		Optional<String> nullabel = Optional.ofNullable("Soumya");
		Optional<String> value1 = Optional.ofNullable(null);
		
		System.out.println(str+" "+empty+" "+nullabel);
		
		String y = nullabel.filter(x -> x.equals("Soumya")).orElse("Name is not Matching or Name is not Null");
		
		String z = nullabel.map(String::toUpperCase).orElse("Value is Null");
		
		//String p = nullabel.filter(x -> x.equals("dkjf")).orElseThrow(() -> new IllegalArgumentException("Name is not Matching"));
		
		System.out.println(y);
		
		System.out.println(z);
		
		if(value1.isPresent()) {
			System.out.println(value1);
		}
		else{
			System.out.println("Value is Empty");
		}
		
		value1.ifPresent(System.out::println);
		
		Optional<String> op = Optional.ofNullable("MALE");
		
		System.out.println(op.orElseGet(() -> "<N/A>"));
		
		System.out.println(op+":"+op.get());
		
	}

}
