package assign29;

import java.util.ArrayList;
import java.util.List;

public class Executer29 {

	public static void main(String[] args) {
		List list=new ArrayList();
		
		
			list.add("Ram");
			list.add(213);
			list.add(20000);
			list.add("Ram1");
			list.add(215);
			list.add(20000);
			
			list.add("Ram2");
			list.add(214);
			list.add(20000);
			
			
			list.forEach((item)->System.out.println(item));
			
			System.out.println(list.stream().filter((item)->{return item>20000;}).count());
			
	
		

	}

}
