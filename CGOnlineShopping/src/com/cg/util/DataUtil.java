package com.cg.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cg.bean.Product;

public class DataUtil{
	
	ArrayList<Product> list=new ArrayList<>();
	
	
	public void addProduct(Product p)
	{
		list.add(p);
	}
	public void addBulkProduct(List<Product> p)
	{
		list.addAll(p);
	}
	public void removeProduct(int productID)
	{
		Iterator<Product> it=list.iterator();
		while(it.hasNext())
		{
			Product p=it.next();
			if(p.getProductId()==productID)
				it.remove();
				
		}
	}
	
	public Product getProductDetails(int productID)
	{
		Iterator<Product> it=list.iterator();
		while(it.hasNext())
		{
			Product p=it.next();
			if(p.getProductId()==productID)
				return p;
				
		}
		return null;
	}
	
	public void getAllProduct()
	{
		Iterator<Product> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
				
		}
	}

}
