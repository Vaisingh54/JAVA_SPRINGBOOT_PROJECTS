package comparator1;

import java.util.*;

public class EmpDataUtil {
	
	
	ArrayList<Employee>list=new ArrayList();
	
	Map<Integer,Set>map=new HashMap<>();
	
	
public List<Employee> getAllEmployees() {
		
		return list;
	}



public Optional<Employee> getanEmployee(int empid) throws EmployeeNotFoundException {
	Iterator<Employee> it=list.iterator();
	Optional<Employee> op=null;
	while(it.hasNext())
	{
		Employee e=it.next();
		if(e.getEmpid()==empid)
			op=Optional.ofNullable(e);
	}
	if(op.isEmpty())
	throw new EmployeeNotFoundException("Employee with Employee ID "+empid+" Not found");
	else 
		return Optional.of(op.get());
	}


     public void deleteEmployee(int empid) {
	 Iterator<Employee>it=list.iterator();
	
	      while(it.hasNext()){
	Employee e=it.next();
	if(e.getEmpid()==empid)
		it.remove();
}}

     
     public void updateEmployee(int empid, float salary) {
 		Iterator<Employee>it=list.iterator();
 		while(it.hasNext())
 		{
 			Employee e=it.next();
 			if(e.getEmpid()==empid)
 				e.setBasicsal(salary);
 		}}
     
     
     public Map<Integer, Set> getEmployeeSkills() {
    	 
    	 Iterator<Employee>it=list.iterator();
    	 while(it.hasNext())
    	 {
    		 Employee e=it.next();
    		 map.putIfAbsent(e.getEmpid(), e.getSkillset());
    		 
    	 }
 		
 		return map;
 	}
     
     
     
     public void addEmployee(List<Employee> list) {
 		this.list.addAll(list);
 	}



	
	
	
	

}
