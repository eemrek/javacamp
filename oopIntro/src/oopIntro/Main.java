package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenovo v15");
		product1.setDetail("16 gb ram");
		product1.setDiscount(10);
		product1.setUnitPrice(16000);
		
		
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Macbook M1");
		product2.setDetail("pro");
		product2.setUnitPrice(12000);
		product2.setDiscount(10);
		
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
				
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		System.out.println(category1.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		
	}

}
