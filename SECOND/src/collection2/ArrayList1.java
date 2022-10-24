package collection2;

import java.util.*;


public class ArrayList1 {
	
	
	List<Integer>list=new ArrayList<>();
	List<Integer>list1=new ArrayList<>();
    // Arrays.asList(1,2,3,4,5,6,7,8,9,10));

		
		public void add()
		{
			list.add(3);
			list.add(1);
			list.add(11);
			list.add(19);
			list.add(17);
			
			
			
			list1.add(5);
			list1.add(2);
			list1.add(6);
			list1.add(7);
			list1.add(20);
			
			
			list.addAll(list1);
			}
		
		public void print()
		{
			System.out.println(list);
			
		}
		
		
		
		public void sort()
		{
			Collections.sort(list);
			System.out.println(list);
		}
		
		
		
		public void fet()
		{
			List<Integer>list2=new ArrayList<>();
			
			list2.add(list.get(2));
			list2.add(list.get(6));
			list2.add(list.get(8));
			
			System.out.println(list2);
		}
		
	


}
