package functionalInterface;

import java.util.Optional;

import comparator.Employee;



public class OptionalCheck {
	
	public static void main(String[] args) {
		Employee emp=null;
		
		
		Optional<Employee>op=Optional.ofNullable(emp);
		
	    op.ifPresent(item->System.out.println(item));
	    
	    Employee emp1=op.orElse(new Employee(187, 87870,"pan"));
	    System.out.println(emp1);
		
		/*
		 * if(op.isPresent()) { System.out.println(op.get()); } else
		 * 
		 * System.out.println("kuch nahi");
		 */
		
	}

}
