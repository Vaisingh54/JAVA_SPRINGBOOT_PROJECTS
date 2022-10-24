package june24;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsCheck {

      static ArrayList<Integer> list=new ArrayList<>();
     public static void add()
    {
        for(int i=0;i<=5;i++)
        list.add((int)(Math.random()*10000));
        System.out.println(list);
    }
     
     
    public static void main(String[] args) {
		
		add();
		allMatch();
		
		anyMatch(); 
	    count();
			 
		collect();
		sorted();
		reverseSorted(); 
		 }
    private static void reverseSorted() {
		list.stream().sorted((a,b)->{return a>b?-1:1;}).forEach((item)->{System.out.print(item+"\t");});}
    private static void sorted() {
	     list.stream().sorted().forEach((item)->System.out.print(item+"\t"));
		System.out.println("");}

    private static void collect() {
		
		List lis=list.stream().filter((item)->{return item%5==0;}).collect(Collectors.toList());
		
		lis.forEach((item)->System.out.print(item+"\t"));
		System.out.println("");}
     private static void count() {
		System.out.println(list.stream().filter((item)->{return item%5==0;}).count());
	}

    private static void anyMatch() {
		
		System.out.println(list.stream().anyMatch((item)->{return item%2==0;}));
	}

    private static void allMatch() {
		System.out.println(list.stream().allMatch((item)->{return item%2==0;}));
	}

}
