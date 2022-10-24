package mapAss1;
import java.util.*;


public class MapAssi1 {

	
	Map<Integer,Float> map;
	
	int a;
	float b=0f;
	
	int count=0;

	public MapAssi1(LinkedHashMap<Integer,Float> map) {
		super();
		this.map = map;
	}
	
	public void add()
	{
		
		map.put(1,1.55f);
		map.put(2,2.45f);
		map.put(3,4.12f);
		map.put(4,5.13f);
		map.put(5,2.78f);
		map.put(6,6.95f);
		map.put(0,7.33f);
		
	}
	
	public void print()
	{
	
		for(int i:map.keySet())
		{
			if(i%2==0)
			{
			    b=map.get(i)+b;
			    
			    count++;
			}
		}
		
		float avg=b/count;
		
		
		
		System.out.println(avg);
	}
}
