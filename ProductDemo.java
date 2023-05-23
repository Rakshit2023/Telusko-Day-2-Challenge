package telusko.day2;

import java.util.*;
import java.util.stream.Stream;

public class ProductDemo {
	
	public static void main(String[] args) {
		
		ProductService service = new ProductService();
		
		service.addProduct(new Product("Asus Vivobook", "Laptop","Brown Table",2022));
		service.addProduct(new Product("MicroSoft", "Laptop book","White Table",2023));
		service.addProduct(new Product("Lenova", "Mouse","Red Table",2025));
		service.addProduct(new Product("Acer", "Key Board","Black Table",2028));
		service.addProduct(new Product("Legion", "Laptop","White Table",2022));
		service.addProduct(new Product("MicroSoft", "Laptop book","White Table",2023));
		service.addProduct(new Product("Lenova", "Mouse","Brown Table",2025));
		service.addProduct(new Product("Acer", "CPU","Yellow Table",2030));
		
		List<Product> productList =  service.getProducts();
		
		Stream<Product> data = productList.stream();
		
		data.forEach(n -> System.out.println(n.getName()+" : "+n.getType()+" : "+n.getPlace()+" : "+ n.getWarranty()));
		System.out.println("------------PRODUCT-----------");
		Product prod =  service.getProduct("MicroSoft");
		System.out.println(prod);
		System.out.println("------------PLACE-----------");
		//Get Products by Place
		List<Product> productPlaceList =  service.getProductsByPlace("brown");
		
		Stream<Product> placeData = productPlaceList.stream();
		placeData.forEach(n -> System.out.println(n.getName()+" : "+n.getType()+" : "+n.getPlace()+" : "+ n.getWarranty()));
		
		System.out.println("------------Warranty-----------");
		//Get Products by Warranty
		List<Product> productWarrantyList =  service.getProductsByWarranty(2023);
		
		Stream<Product> warrantyData = productWarrantyList.stream();
		
		warrantyData.forEach(n -> System.out.println(n.getName()+" : "+n.getType()+" : "+n.getPlace()+" : "+ n.getWarranty()));
		
	}

}
