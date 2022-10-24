package practiceColl;



	
	
	 import java.util.Iterator;
	 import java.util.*;
	
	 
	 public class DemoSet {
		 
		 
		 SortedSet<String> set;
	
	 
	 DemoSet(SortedSet<String> set) { 
		 this.set=set;
	 //set=new HashSet();
	 } 
	 
	 
	 public void addElement()
	 { System.out.println(set.add("India"));
	 set.add("Canada");
	 set.add("Egypt");
	 set.add("China"); 
	 set.add("Nepal");
	 set.add("Pakistan");
	 System.out.println(set.add("India")); 
	 set.add("Bangladesh");
	 }
	 public void print() 
	 { System.out.println(set.first());
	 System.out.println(set.last());
	 System.out.println(set.headSet("China"));
	 System.out.println(set.tailSet("China")); 
	 System.out.println("*************");
	 Iterator<String>it=set.iterator(); 
	 while(it.hasNext()) 
	 { System.out.println(it.next());
	} } 
	}

