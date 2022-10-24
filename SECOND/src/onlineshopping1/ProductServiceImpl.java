package onlineshopping1;

import java.util.*;
import java.util.Optional;

public class ProductServiceImpl implements IProductService{

	
	
	IProductDao dl=new ProductDaoImpl();
	@Override
	public void getAllProductDetails() {		
		 dl.getAllProduct();
	}

	@Override
	public void acceptProductDetails(Product product) {
		dl.addProduct(product);
		
	}

	@Override
	public Optional<Product> getProductDetails(int productId) throws ProductNotFoundException {
		
		
			return dl.getProductDetails(productId);
		
	}

	@Override
	public void acceptBulkProductsDetails(List<Product> products) {
		dl.addBulkProduct(products);
		
	}

	@Override
	public void removeProdcutDetails(int productId) {
		dl.removeProduct(productId);
		
	}

}
