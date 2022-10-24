package map1;
import java.util.*;

public class MapFirst {
	
	
	Map map;

	public MapFirst(Map map) {
		super();
		this.map = map;
	}

	
	public void add()
	{
		
		map.put("INDIA", 1);
		map.put("CHINA", 6);
		map.put("IRAN", 4);
		map.put("INDIA", 5);
		map.put("ID",null);
		map.put(null, null);		
		System.out.println(map.putIfAbsent("INDIA", 10));
		
		System.out.println(map.entrySet());
		
		System.out.println(map.containsValue(1));;
		System.out.println(map.containsKey("IRAN"));
		
		
		
		
		
	}
	
	public void print()
	{
		
		/*
		 * Iterator it=map.entrySet().iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */
		System.out.println(map);
	}
}
