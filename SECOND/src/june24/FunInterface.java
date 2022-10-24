package june24;
import java.util.Scanner;
import java.util.function.*;

public class FunInterface {

	public static void main(String[] args) {
		consumerDemo();
		PredicateDemo();
		FunctionDemo();
		supplierDemo();
		
		}

	private static void supplierDemo() {
		System.out.println("*********************************************************");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter what do you want to print");
		Supplier<String>s=()->{return sc.next() ;};
		
		System.out.println(s.get());
		
	}

	private static void FunctionDemo() {
		Function<String,Integer>f=(item)->{return item.length();};
		System.out.println("*********************************************************");

		System.out.println(f.apply("Vaibhav"));
		
	}

	private static void PredicateDemo() {
		Predicate<String> p=(item)->item.contains("bh");
		System.out.println("*********************************************************");
		System.out.println(p.test("Vaibhav"));
	}

	private static void consumerDemo() {
		
		Consumer<String>c=(t)-> {System.out.println(t.length());};
		c.accept("India");
		
		
		
	}

}
