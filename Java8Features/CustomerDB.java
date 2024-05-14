package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDB {
	
	public List<Customer> getAllCustomer(){
		return Stream.of(new Customer(101, "Soumya", "sjn@gmail.com", Arrays.asList("2983923", "2738238")), new Customer(102, "Chomi", "chm@gmail.com" , Arrays.asList("289283", "2839283")), 
				new Customer(103, "Jumbu", "djhd@gmail.com", Arrays.asList("938493", "23983489")),new Customer(104, "D-joo", "sdj@gmail.com", Arrays.asList("2382938", "237232"))).collect(Collectors.toList());
		
	}

}
