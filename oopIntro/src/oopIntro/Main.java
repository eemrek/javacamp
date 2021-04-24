package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.name="Bilgisayar";
		product1.id=1;
		product1.unitPrice=10000;
		product1.detail="8 gb";
		
		Product product2 = new Product();
		product2.name="Telefon";
		product2.id=2;
		product2.unitPrice=8000;
		product2.detail="İphone";
		
		Product product3 = new Product();
		product3.name="PS 5";
		product3.id=3;
		product3.unitPrice=5000;
		product3.detail="500 gb";
		
		Product[] products = {product1,product2,product3};
		for (Product product : products) {
			System.out.println(product.name);
			System.out.println(product.detail);
			System.out.println(product.unitPrice);
			
		}
		
		System.out.println(products.length);
				
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		
	}

}
