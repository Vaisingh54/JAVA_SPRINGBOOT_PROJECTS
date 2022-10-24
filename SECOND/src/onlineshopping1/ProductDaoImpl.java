package onlineshopping1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class ProductDaoImpl implements IProductDao{
	static Connection con;
	PreparedStatement psmt;
	ResultSet rs;
	static {
		
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("Got class");					
					 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","941581");
					System.out.println("Got connection");
					
				}
				catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
	}

	@Override
	public void addProduct(Product p) {
		try {
			psmt=con.prepareStatement("Insert into Product values(?,?,?,?,?)");
			psmt.setInt(1,p.getProductId());
			psmt.setInt(2,p.getPrice());
			psmt.setInt(3,p.getStarRating());
			psmt.setString(4,p.getDescription());
			psmt.setString(5,p.getProductName());
			if(psmt.executeUpdate()==1)
			{
				System.out.println("Product added successfully");
			}
			else
				System.out.println("Failed to add product");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addBulkProduct(List<Product> p) {
		String sql="Insert into Product values(?,?,?,?,?)";
		try {
			psmt=con.prepareStatement(sql);
			Iterator<Product>it=p.iterator();
			while(it.hasNext())
			{
				Product ptemp=it.next();
				psmt.setInt(1,ptemp.getProductId());
				psmt.setInt(2,ptemp.getPrice());
				psmt.setInt(3,ptemp.getStarRating());
				psmt.setString(4,ptemp.getDescription());
				psmt.setString(5,ptemp.getProductName());
				psmt.addBatch();
			}
			
			int[] affectedRecords = psmt.executeBatch();
			if(affectedRecords.length>0)
			{
				System.out.println("records added sucessfully");
			}
			else
				System.out.println("failed to add record");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void removeProduct(int productID) {
		try {
			psmt=con.prepareStatement("Delete from Product where productid=?");
			psmt.setInt(1, productID);
			int result=psmt.executeUpdate();
			if(result==1)
			{
				System.out.println("Product removed successfully");
			}
			else
				System.out.println("Failed to add product");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public Optional<Product> getProductDetails(int productID) throws ProductNotFoundException {
		try {
			psmt=con.prepareStatement("Select * from product where productid=?");
			psmt.setInt(1, productID);
			rs=psmt.executeQuery();
			if(rs.getFetchSize()>0) {
				Product p=null;
			while(rs.next())
			{
				p=new Product();
				p.setProductId(rs.getInt(1));
				p.setPrice(rs.getInt(2));
				p.setStarRating(rs.getInt(3));
				p.setDescription(rs.getString(4));
				p.setProductName(rs.getString(5));
			}
			return Optional.of(p);
			}
			else
				throw new ProductNotFoundException("Product not found!!");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}

	@Override
	public void getAllProduct() {
		try {
			psmt=con.prepareStatement("Select * from product");
			rs=psmt.executeQuery();
			Product p;
			while(rs.next())
			{
				p=new Product();
				p.setProductId(rs.getInt(1));
				p.setPrice(rs.getInt(2));
				p.setStarRating(rs.getInt(3));
				p.setDescription(rs.getString(4));
				p.setProductName(rs.getString(5));
				System.out.println(p);
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	

}
