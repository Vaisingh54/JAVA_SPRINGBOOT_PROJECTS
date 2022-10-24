package onlineshopping1;

import java.util.*;

public interface IProductService {

	
	
	public void getAllProductDetails();
	public void acceptProductDetails(Product product);
	public Optional<Product> getProductDetails(int productId) throws ProductNotFoundException;
	void acceptBulkProductsDetails(List<Product> products);
	void removeProdcutDetails(int productId);
}
