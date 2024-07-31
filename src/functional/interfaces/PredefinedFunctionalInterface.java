package functional.interfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterface {

	public static void main(String[] args) {
		
		System.out.println("---------------------------Function-------------------------------");
		
		Function<Integer, String> fun1 = new Function<Integer, String>() {			
			@Override
			public String apply(Integer val1) {				
				return "Hello";
			}
		};		
		System.out.println(fun1.apply(100));		
		Function<Integer, String> fun2 = (val1)-> "Java";
		System.out.println(fun2.apply(1000));
		
		Function<Integer, Integer> fun3 = (val1)-> val1 * 20;
		System.out.println(fun3.apply(10000));
		
		
		System.out.println("---------------------------BiFunction-------------------------------");
		BiFunction<Integer, Integer, String> biFun = new BiFunction<>() {
			@Override
			public String apply(Integer val1, Integer val2) {
				return "Welcome";
			}
		};
		System.out.println(biFun.apply(100, 200));
		BiFunction<Integer, Integer, String> biFun2 = (val1,val2)-> "World"; 
		System.out.println(biFun2.apply(1000, 2000));
		
		BiFunction<Integer, Integer, Integer> biFun3 = (val1,val2)-> val1+val2; 
		System.out.println(biFun3.apply(1000, 2000));
		
		
		System.out.println("---------------------------Predicate-------------------------------");
		Predicate<Integer> predicate1 = new Predicate<Integer>() {			
			@Override
			public boolean test(Integer val1) {				
				return val1%2==0;
			}
		};
		
		System.out.println(predicate1.test(10));
		System.out.println(predicate1.test(11));
		
		Predicate<Integer> predicate2 = (val1)-> val1%2==0;
		System.out.println(predicate2.test(10));
		System.out.println(predicate2.test(11));
		
		
		System.out.println("---------------------------Consumer-------------------------------");
		Consumer<Integer> consumer1 = new Consumer<Integer>() {			
			@Override
			public void accept(Integer val1) {
				System.out.println(val1);
			}
		};		
		consumer1.accept(100);
		
		Consumer<Integer> consumer12 = (val1)-> System.out.println(val1);
		consumer12.accept(10000);
		
		
		System.out.println("---------------------------Supplier-------------------------------");
		Supplier<Integer> supplier1 = new Supplier<Integer>() {			
			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return 10000000;
			}
		};
		
		System.out.println(supplier1.get());
		
		Supplier<Integer> supplier2 = () -> 5000000;
		System.out.println(supplier2.get());
		
		
		
		
	}

}
