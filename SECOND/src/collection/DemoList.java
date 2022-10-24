package collection;

import java.util.*;


public class DemoList {
	
	
	List<String> list=new Vector<String>();
	List list1=new Vector();
	List list2=new Vector();
	
	public void add()
	{
		list.add("INDIA");
		list.add("US");
		list.add("IRAQ");
		list.add("IRAN");
		
		list.remove(1);
		
		list1.add(1);
		list1.add("first");
		list1.add(2);
		list1.add("Second");
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		
		
		
		
		
		
		}
	
	public void print()
	{
		System.out.println();
		System.out.println(list);
	}

}
