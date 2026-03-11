package com.assignment;

public class ElectronicProduct  extends Product implements Taxable{

	public ElectronicProduct(int productId, String productName, double price) {
		super(productId, productName, price);
		
	}

	@Override
	public double calculateDiscount() {
		return getPrice()*0.25;
	}
	
	@Override
	public double calculateTax(double priceAfterDiscount) {
		return priceAfterDiscount*0.18;
	}

	@Override
	public double calculateFinalPrice() {
		double discount = calculateDiscount();
		double priceAfterDiscount = getPrice()-discount;
		double tax=calculateTax(priceAfterDiscount);
		return priceAfterDiscount + tax;
	}
	
}
