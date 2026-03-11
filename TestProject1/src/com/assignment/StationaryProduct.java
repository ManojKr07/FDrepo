package com.assignment;

public class StationaryProduct extends Product implements Taxable {

	public StationaryProduct(int productId, String productName, double price) {
		super(productId, productName, price);
	}
	
	@Override
	public double calculateDiscount() {
		return getPrice()*0.12;
	}
	
	@Override
	public double calculateTax(double priceAfterDiscount) {
		return priceAfterDiscount*0.05;
	}

	@Override
	public double calculateFinalPrice() {
		double discount = calculateDiscount();
		double priceAfterDiscount = getPrice()-discount;
		double tax=calculateTax(priceAfterDiscount);
		return priceAfterDiscount + tax;
	}
	

}
