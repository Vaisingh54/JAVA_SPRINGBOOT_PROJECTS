package assign29;

import java.util.*;



public class EmployeeService extends Bean {
	
	List list=new ArrayList();
	
	
	public void  add()
	{
		list.add("Ram");
		list.add(213);
		list.add(20000);
		list.add("Ram1");
		list.add(215);
		list.add(20000);
		
		list.add("Ram2");
		list.add(214);
		list.add(20000);
		
		
	}
	
	
	
	
	
	public EmployeeService(long empId, float empSal, String empName) {
		super(empId, empSal, empName);
		// TODO Auto-generated constructor stub
	}

	
	public void sumSal()                                 
	{
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			if(it.next()==getEmpSal())
			{
				float sum=getEmpSal();
			}
		}
		
	 
	};
	
	
	
	

}
