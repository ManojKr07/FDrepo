package com.assignment;

public abstract class Product {
	private  int productId;
	private String productName;
	private double price;
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public abstract double calculateDiscount();
	
	public abstract double calculateFinalPrice();
	
	public void displayDetails() {
		System.out.println("Product ID: "+ productId);
		System.out.println("ProductName: "+ productName);
		System.out.println("Product Price: "+ price);
	}
	
}
