package june24;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorClass {
	

	public static void main(String[] args) {
		toListDemo();
		toSetDemo();
	     toCollectionDemo();
	}


	private static void toCollectionDemo() {
ArrayList<String> array=new ArrayList();
		
	
		
		array.add("China");
		array.add("SriLanka");
		array.add("India");
		array.add("Nepal");
		array.add("Bangladesh");
		array.add("Cuba");
		array.add("India");
		System.out.println("*************************************************************************************************");
		SortedSet<String>set=array.stream().collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set);
		
	}


	private static void toSetDemo() {
ArrayList<String> array=new ArrayList();
		
		array.add("India");
		array.add("Bangladesh");
		array.add("China");
		array.add("SriLanka");
		array.add("Nepal");
		array.add("Cuba");
		array.add("India");
		System.out.println("*************************************************************************************************");
		Set<String>set=array.stream().collect(Collectors.toSet());
		System.out.println(set);
		
	}

	public static void toListDemo() {
ArrayList<String> array=new ArrayList();
		
		array.add("India");
		array.add("Bangladesh");
		array.add("China");
		array.add("SriLanka");
		array.add("Nepal");
		array.add("Cuba");
		array.add("India");
		System.out.println("*************************************************************************************************");
//		List<String>list=array.stream().collect(Collectors.toList());
		List<String>list=array.stream().filter((item)->{return item.startsWith("C");}).collect(Collectors.toList());
		System.out.println(list);
		
	}

}
