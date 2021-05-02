package AmazonImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	String productName;
	int price;
	
	
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProdList()
	{
		List<String> prodList = new ArrayList<String>();
		prodList.add("Mac Book Pro");
		prodList.add("Mac Book Pro 2");
		prodList.add("Mac Book Pro 3");
		
		return prodList;
	}
}