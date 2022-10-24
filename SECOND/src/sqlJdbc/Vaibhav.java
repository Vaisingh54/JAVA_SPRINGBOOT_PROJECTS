package sqlJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Vaibhav {


	public void connect() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Got class");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","941581");
			System.out.println("Got Connected");
			
			Statement smt=con.createStatement();

			ResultSet rs=smt.executeQuery("select count(*) from clown");
			{
				rs.next();
				System.out.println(rs.getInt(1));
				
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
