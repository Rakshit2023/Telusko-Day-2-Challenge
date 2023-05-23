package telusko.day2;

import java.util.*;

public class ProductService {

	
	List<Product> products = new ArrayList<>();
	
	public void addProduct(Product p) {	
		products.add(p);
	}

	public List<Product> getProducts() {
		
		return products;
	}

	public Product getProduct(String name) {
		Product prod = null;
		for(int i = 0;i<products.size();i++) {
			prod = (Product)products.get(i);
			if(prod.getName().equals(name)) {
				break;
			}
		}
		return prod;
	}

	public List<Product> getProductsByPlace(String name) {
		
		List<Product> prodList = new ArrayList<>();
		Product prod = null;
		for(int i = 0;i<products.size();i++) {
			prod = (Product)products.get(i);
			if(prod.getPlace().toLowerCase().contains(name.toLowerCase())) {
				prodList.add(prod);
			}
		}
		
		return prodList;
	}

	public List<Product> getProductsByWarranty(int year) {
		List<Product> prodList = new ArrayList<>();
		Product prod = null;
		for(int i = 0;i<products.size();i++) {
			prod = (Product)products.get(i);
			if(prod.getWarranty()<=year) {
				prodList.add(prod);
			}
		}
		
		return prodList;
	}

}
