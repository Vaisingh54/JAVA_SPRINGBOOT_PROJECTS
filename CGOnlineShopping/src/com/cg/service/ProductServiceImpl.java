package com.cg.service;

import java.util.List;

import com.cg.bean.Product;
import com.cg.util.DataUtil;

public class ProductServiceImpl implements IProductService{

	DataUtil dl=new DataUtil();
	@Override
	public void getAllProductDetails() {		
		 dl.getAllProduct();
	}

	@Override
	public void acceptProductDetails(Product product) {
		dl.addProduct(product);
		
	}

	@Override
	public Product getProductDetails(int productId) {
		
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
