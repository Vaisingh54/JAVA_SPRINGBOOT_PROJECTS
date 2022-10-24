package abstract1;

public class ExecuterEployee {

	public static void main(String[] args) {
	   Employee employee= new PermanentEmployee(1001,"bbb",15000);
	   employee.calSal();
	   employee.displayDetail();
	   Employee employee1= new ContractEmployee(1002,"aaa",10000);
	   employee1.calSal();
	   employee1.displayDetail();
	   
	  

	}

}
