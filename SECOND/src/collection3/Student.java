package collection3;

import java.util.*;

public class Student {

	
	List list=new ArrayList();
	
	Scanner sc=new Scanner(System.in);
	
	
	
	public void num() {
		
		System.out.println("Enter no of student");
		int noStu=sc.nextInt();
		
		for(int i=0;i<noStu;i++)
		{
			int m1=sc.nextInt();
			int m2=sc.nextInt();
			int m3=sc.nextInt();
			String name=sc.next();
			
			list.add(name+"-"+m1+"-"+m2+"-"+m3);
			
		}
	
		
	}
	
	

	
		
	    
	    
	    public void result()
	    {
	        int sum1=0,sum2=0,sum3=0;
	        String[] array1=((String) list.get(0)).split("-");
	        String[] array2=((String) list.get(1)).split("-");
	        String[] array3=((String) list.get(2)).split("-");
	        for(int i=1;i<=3;i++)
	        {
	            sum1=sum1+Integer.parseInt(array1[i]);
	            sum2=sum2+Integer.parseInt(array2[i]);
	            sum3=sum3+Integer.parseInt(array3[i]);
	            
	        }
	         if( sum1 >= sum2 && sum1 >= sum3)
	         {
	              System.out.println(array1[0]+" has the highest score");
	         }
	          else if (sum2 >= sum1 && sum2 >= sum3)
	          {
	              System.out.println(array2[0]+" has the highest score");
	          }
	          else
	          {
	              System.out.println(array3[0]+" has the highest score");
	          }
	        
	    }
	    

	    

		
		

}
		
		
		
	
	
