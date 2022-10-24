package com.cg.service;

import com.cg.bean.Product;
import java.util.*;
public interface IProductService {
	public void getAllProductDetails();
	public void acceptProductDetails(Product product);
	public Product getProductDetails(int productId);
	void acceptBulkProductsDetails(List<Product> products);
	void removeProdcutDetails(int productId);

}
