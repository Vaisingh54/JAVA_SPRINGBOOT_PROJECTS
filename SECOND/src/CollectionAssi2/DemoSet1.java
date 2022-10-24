package CollectionAssi2;

import java.util.*;

public class DemoSet1 {
	

	Set<Character> set,set2;
	

	
	public DemoSet1(Set<Character> set,Set<Character> set2) {
		super();
		this.set = set;
		this.set2 = set2;
	}

  public int uniqueChar(String str)
	{
		
		for(int i=0;i<str.length();i++)
		{
			
			if(!set.add(str.charAt(i)))
			{
				set2.add(str.charAt(i));
				
			}
		}
		
		set.removeAll(set2);
		
		if(set.size()>0)
			return set.size();
		else
			return -1;
		
	}
}
	



