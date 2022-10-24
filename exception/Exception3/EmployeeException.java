package Exception3;

import javax.security.auth.login.AccountException;

public class EmployeeException {
	
	      private float sal;  
	      
	      
	      
	
          public EmployeeException(float sal) {
			super();
			this.sal = sal;
		}

       public float getSal() {
			return sal;
		}


		public void setSal(float sal) {
			this.sal = sal;
		}


		public void checkSal(float sal) throws  AccountException{
        	  
        	  if(sal<3000)
        	  {
        		  throw new AccountException("Salary is less than 3000");
        	  }
        	  else
        	  {
        		  System.out.println("Salary is "+sal);
        	  }
        	  
          }

}
