package june24;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunInt {

	public static void main(String[] args) {
		biconsumerDemo();
		biPredicateDemo();
		biFunctionDemo();
		
	}

	private static void biFunctionDemo() {
		BiFunction<String,String,Integer>f=(item,item2)->{return item.length()+item2.length();};
		System.out.println("*********************************************************");

		System.out.println(f.apply("Vaibhav", "Singh"));
		
	}

	private static void biPredicateDemo() {
		
		BiPredicate<String,String> p=(item,item2)->item.contains(item2);
		System.out.println("*********************************************************");
		System.out.println(p.test("Vaibhav", "bh"));
		
	}

	private static void biconsumerDemo() {
		BiConsumer<String,String>c=(t,u)-> {System.out.println(t.length()+u.length());};
		c.accept("India", "Country");
		}

}
