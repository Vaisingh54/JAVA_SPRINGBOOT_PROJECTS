package onlineshopping1;

import java.util.*;
import java.util.Scanner;

public class Executer {

	public static void main(String[] args) {
		
		IProductService pService=new ProductServiceImpl();
		
		  Product p[]=new Product[4]; p[0]=new Product(1001,50000,4,"LG 42' TV","TV");
		  p[1]=new Product(1002,20000,5,"Whirlpool 8KG WM","Washing Machine"); p[2]=new
		  Product(1003,1000,4,"BajajElectricIronBox","Iron"); p[3]=new
		  Product(1000,200,5,"MiltonwaterBottle","WaterBottle");
		 
		
		  System.out.println("Adding products In Bulk");
		  pService.acceptBulkProductsDetails(Arrays.asList(p));
		  System.out.println("Display All Products"); pService.getAllProductDetails();
		  System.out.println("Adding new Product"); Scanner sc=new Scanner(System.in);
		  System.out.println("Enter new Productid, cost, star rating, desc & name");
		  Product pnew=new Product(sc.nextInt(), sc.nextInt(), sc.nextInt(),sc.next(),
		  sc.next()); pService.acceptProductDetails(pnew);
		 
		System.out.println("Removing Product");
		pService.removeProdcutDetails(1004);
		
		System.out.println("***************************************************");
		
		  System.out.println("Get product details");
		  System.out.println("Enter id of product"); try {
		  System.out.println(pService.getProductDetails(sc.nextInt())); } catch
		  (ProductNotFoundException e) {
		  System.err.println("Product is not available, enter proper product ID"); }
		  System.out.println("**************************************");
		  pService.getAllProductDetails();
		 
		
	}

}
