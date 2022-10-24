package collection5;

import java.util.Iterator;
import java.util.Set;

public class DemoSet {
	
	Set set;

	public DemoSet(Set set) {
		
		this.set = set;
		
	}
	
	public void add()
	{
		set.add("INDIA");
		set.add("USA");
		set.add("IRAN");
		set.add("IRAQ");
		set.add("CHINA");
		set.add("JAPAN");
		set.add("INDIA");
	}
	
	public void print()
	{
		Iterator<String> it=set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	

}
