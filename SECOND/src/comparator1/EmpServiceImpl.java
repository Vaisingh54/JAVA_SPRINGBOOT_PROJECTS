package comparator1;

import java.util.List;


import java.util.Map;
import java.util.Optional;
import java.util.Set;




public class EmpServiceImpl implements   IEmpService {
	
	EmpDataUtil emp=new EmpDataUtil();

	@Override
	public List<Employee> getAllEmployee() {
		
		return emp.getAllEmployees();
	}

	@Override
	public Optional<Employee> getanEmployee(int empid) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return emp.getanEmployee(empid);
	}

	@Override
	public void deleteEmployee(int empid) {
		emp.deleteEmployee(empid);
		
	}

	@Override
	public void updateEmployee(int empid, float salary) {
		emp.updateEmployee(empid, salary);
		
	}

	@Override
	public Map<Integer, Set> getEmployeeSkills() {
		return emp.getEmployeeSkills();
	}

	@Override
	public void addEmployee(List<Employee> list) {
		emp.addEmployee(list);
		
	}

	
}
