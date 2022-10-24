package comparator1;

import java.util.*;



public interface IEmpService {
	
	public List <Employee> getAllEmployee();
	
	public Optional<Employee> getanEmployee(int empid) throws EmployeeNotFoundException;
	
	public void deleteEmployee(int empid);
	public void updateEmployee(int empid,float salary);
	public Map<Integer,Set> getEmployeeSkills();
	
	public void addEmployee(List<Employee>list);

}
