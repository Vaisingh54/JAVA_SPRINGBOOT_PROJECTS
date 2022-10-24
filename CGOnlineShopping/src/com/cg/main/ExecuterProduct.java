package com.cg.main;

import java.util.Arrays;
import java.util.Scanner;

import com.cg.bean.Product;
import com.cg.service.IProductService;
import com.cg.service.ProductServiceImpl;

public class ExecuterProduct {

	public static void main(String[] args) {
		IProductService pService=new ProductServiceImpl();
		Product p[]=new Product[4];
		p[0]=new Product(1001,50000,4,"LG 42' TV","TV");
		p[1]=new Product(1002,20000,5,"IFB 7KG WashingMachine","Washing Machine");
		p[2]=new Product(1003,1000,4,"Bajaj ElectricIron Box","Iron");
		p[3]=new Product(1004,200,5,"Milton Copper water Bottle","WaterBottle");
		System.out.println("Adding products In Bulk");
		pService.acceptBulkProductsDetails(Arrays.asList(p));
		System.out.println("Display All Products");
		pService.getAllProductDetails();
		System.out.println("Adding new Product");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new Productid, cost, star rating, desc & name");
		Product pnew=new Product(sc.nextInt(), sc.nextInt(), sc.nextInt(),sc.next(), sc.next());
		pService.acceptProductDetails(pnew);
		System.out.println("Removing Product");
		pService.removeProdcutDetails(1003);
		System.out.println("Get product details");
		System.out.println("Enter id of product");
		System.out.println(pService.getProductDetails(sc.nextInt()));
		System.out.println("**************************************");
		pService.getAllProductDetails();
		
		
	}

}
