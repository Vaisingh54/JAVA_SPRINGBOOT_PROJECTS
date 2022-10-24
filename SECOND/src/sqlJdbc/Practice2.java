package sqlJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Practice2 {

	
	public void connect() {
		 
		
		PreparedStatement pmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Got class");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","941581");
			System.out.println("Got Connected");
			
			  System.out.println("************************************************************************************************************************");
			//Inserting
	          Scanner sc=new Scanner(System.in);
	          int result=0;
	          pmt  =con.prepareStatement("Insert into Employee_master values(?,?,?,?,?,?)");
	         for(int i=0;i<5;i++)
	         {
	        	 
	        	  System.out.println("Enter ID,name,sal,pf,pt,dep ID");
		          
		          pmt.setInt(1, sc.nextInt());
		          pmt.setString(2, sc.next());
		          pmt.setInt(3, sc.nextInt());
		          pmt.setInt(4, sc.nextInt());
		          pmt.setInt(5, sc.nextInt());
		          pmt.setInt(6, sc.nextInt());
		          
		          
		          result++;
	         }
	         
	         result= pmt.executeUpdate();
	         System.out.println(result);
	        
	         System.out.println("************************************************************************************************************************");
	         //Updating
	         
	         pmt=con.prepareStatement("Update Employee_master set emp_sal=? where emp_id=?");
	         
	         System.out.println("Enter Salary to update");
	         pmt.setInt(1, sc.nextInt());
	         
	         System.out.println("Enter Emp ID to UPDATE");
	         pmt.setInt(2, sc.nextInt());
	         
	         result=pmt.executeUpdate();
	         System.out.println(result);
	         
	         
	         System.out.println("************************************************************************************************************************");
	         //Operation
	         
	         pmt=con.prepareStatement("Select*from Employee_master where emp_id=?");
	         
	         System.out.println("Enter Emp ID to see details");
	         
	         pmt.setInt(1, sc.nextInt());
	         
	        ResultSet rs= pmt.executeQuery();
	        while(rs.next())
	        {
	        	
	        	System.out.println(rs.getObject(1)+"\t"+ rs.getObject(2)+"\t"+rs.getObject(3)+"\t"+rs.getObject(4)+"\t"+rs.getObject(5)+"\t"+rs.getObject(6));
	        }
	         
	         
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new PrepareStatement().connect();

	}

	

}
