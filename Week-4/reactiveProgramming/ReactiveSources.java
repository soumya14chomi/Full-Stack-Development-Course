package reactiveProgramming;

import java.time.Duration;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveSources {
	public static Flux<String> stringNumbersFlux(){
		return Flux.just("one", "two", "three", "four", "five", "six", "seven", "eight")
				.delayElements(Duration.ofSeconds(1));
	}
	
	public static Flux<Integer> intNumbersFlux(){
		
		return Flux.range(1, 10)
				.delayElements(Duration.ofSeconds(1));
	}
	
	public static Flux<Integer> intNumbersFluxWithException(){
		return Flux.range(1, 10)
				.delayElements(Duration.ofSeconds(1))
				.map(e ->{
					if(e==5)	throw new RuntimeException("Error from Flux");
					return e;
				});
	}
	
	public static Mono<Integer> intNumberMono(){
		return Mono.just(1)
				.delayElement(Duration.ofSeconds(1));
	}
	
	
	public static Flux<User> userFlux(){
		return Flux.just(
				new User(101, "Namani", "Soumya"),
				new User(102, "Malla", "Sravani"),
				new User(103, "Namani", "Shruthi"),
				new User(104, "Pasham", "Mouni"),
				new User(105, "Akanksha", "Pandey")
				).delayElements(Duration.ofSeconds(1));
	}
	
	public static Mono<User> userMono(){
		return Mono.just(
				new User(101, "Namani", "Soumya")
				);
				
	}
	
	public static Flux<String> unresponsiveFlux(){
		return Flux.never();
	}
	 
	public static Mono<Integer> unresponsiveMono() {
		return Mono.never();
	}
	
	public static Flux<Integer> intNumbersFluxWithDups(){
		return Flux.just(1, 2, 3, 1, 3, 5, 2, 5)
				.delayElements(Duration.ofSeconds(1));
	}
}
