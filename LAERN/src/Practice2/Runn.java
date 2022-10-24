package Practice2;

import java.nio.channels.IllegalBlockingModeException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Runn {
	
	
	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver.class");
			System.out.println("Got class");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","941581");
			System.out.println("Got Connected");
			
			Statement smt=con.createStatement();
			
//		
//			
			ResultSet rs=smt.executeQuery("select*from Test");
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
