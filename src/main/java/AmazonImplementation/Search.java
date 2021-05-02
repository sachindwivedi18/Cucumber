package AmazonImplementation;

public class Search {

	public String displayProduct(Product prod) {
		if (prod.getProdList().contains(prod.getProductName())) {

			return prod.getProductName();
		}		
		return null;
	}
}