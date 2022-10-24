package sqlJdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	
	
	public void connect() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Got class");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","941581");
			System.out.println("Got Connected");
			
			Statement smt=con.createStatement();
			
//			int n=smt.executeUpdate("Insert into Employee_master values(113,'Raj',60000,3000,400,2010)");
//			System.out.println(n);
//			n=smt.executeUpdate("Update Employee_master set emp_pt=444 where emp_id=111");
//			System.out.println(n);
//			n=smt.executeUpdate("Delete from Employee_master where emp_id<107");
//			System.out.println(n);
//			
			ResultSet rs=smt.executeQuery("select*from clown");
					while(rs.next())
					{
						System.out.println(rs.getString(1));
					}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	            

}
