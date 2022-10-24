package onlineshopping1;

import java.util.*;

public interface IProductDao {

	public void addProduct(Product p);
	
	public void addBulkProduct(List<Product> p);
	
	public void removeProduct(int productID);
	
	
	public Optional<Product> getProductDetails(int productID) throws ProductNotFoundException;
	
	
	public void getAllProduct();
	
	

}
