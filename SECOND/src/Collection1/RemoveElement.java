package Collection1;

import java.util.*;

public class RemoveElement {
	
	List<Integer> list = new ArrayList<>();
	       // Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	
			
			public void add()
			{
				list.add(1);
				list.add(2);
				list.add(3);
				list.add(4);
				list.add(5);
				list.add(6);
				list.add(7);
				list.add(8);
				list.add(9);
				list.add(10);
				
				}
			
			
			public void print()
			{
				
				
				System.out.println("ArrayList is--->"+list);
				
				list.remove(2);
				list.remove(4);
				list.remove(6);
				
				
				System.out.println("Final ArrayList is--->"+list);
			}
	

	

}
