package onlineshopping1;

import java.util.*;

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
	
	public Optional<Product> getProductDetails(int productID) throws ProductNotFoundException
	{
		Iterator<Product> it=list.iterator();
		Optional<Product>op=null;
		while(it.hasNext())
		{
			Product p=it.next();
			if(p.getProductId()==productID) {
				op=Optional.of(p);
			}
				
		}
		
		if(op.isPresent())
		return Optional.ofNullable(op.get());
		else
		 throw new ProductNotFoundException("Product with Product ID "+productID+" not found!!" );
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
