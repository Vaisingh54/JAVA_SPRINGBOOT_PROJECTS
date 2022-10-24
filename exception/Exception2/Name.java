package Exception2;

import javax.naming.NamingException;

public class Name {
	
	 public void printName(String name) throws NamingException{

	       String [] nameSplit = name.split(" ");
	       String first = nameSplit[0];
	       String last = nameSplit[1];
	       
	      
	    	    System.out.println("First name: "+first);
	       
	       System.out.println("Last name: "+last);      
	   }

}
