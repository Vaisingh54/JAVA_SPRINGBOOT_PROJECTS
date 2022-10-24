package collection4;

import java.util.*;

public class CheckRemove {

	
	List<String> list=new ArrayList<String>();
	
	public void add() {
		
		list.add("INDIA");
		list.add("IRAN");
		list.add("IRAQ");
		list.add("BHUTAN");
		list.add("CHINA");
		list.add("JAPAN");
	}
	
	
	public void print()
	{
		
		ListIterator<String> it=list.listIterator();
		
		while(it.hasNext())
		{
			String country=it.next();
			
			if(country.equalsIgnoreCase("CHINA"))
			it.remove();
		}
		
		System.out.println(list);
		
		while(it.hasPrevious()) {
			
			String country=it.previous();
			if(country.equalsIgnoreCase("IRAQ"))
			it.remove();
		}
		
		System.out.println(list);
	}
}
