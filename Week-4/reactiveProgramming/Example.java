package reactiveProgramming;

import reactor.core.publisher.Operators.MonoSubscriber;

import java.io.IOException;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;

public class Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReactiveSources.intNumbersFlux().subscribe(new MySubscriber());
		System.in.read(); //Holds the program's termination
		
		
		

	}

}

class MySubscriber<T> extends BaseSubscriber<T>{
	
	@Override
	public void hookOnSubscribe(Subscription subscripiton) {
		System.out.println("Subscribe Happen");
		request(5);
	}
	@Override
	public void hookOnNext(T value) {
		System.out.println(value.toString()+": received");
	}
}
