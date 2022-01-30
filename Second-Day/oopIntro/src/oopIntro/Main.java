package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(); //referans olu�turma, intance
		product1.id = 1;
		product1.name = "Monster A5";
		product1.unitPrice = 8999.59;
		product1.detail = "Gaming";
		
		Product product2 = new Product(); //referans olu�turma, intance
		product2.id = 2;
		product2.name = "Monster Huma";
		product2.unitPrice = 12999.59;
		product2.detail = "Business";
		
		Product product3 = new Product(); //referans olu�turma, intance
		product3.id = 3;
		product3.name = "Monster A7";
		product3.unitPrice = 10999.59;
		product3.detail = "Gaming";
		
		Product product4 = new Product(4,"Lenovo 14",13999.59,"Business");
		
		Product[] products = {product1,product2,product3,product4};
		
		for (Product product : products) {
			System.out.println("�r�n ID Numaras�: "+product.id);
			System.out.println("�r�n Ad�: "+product.name);
			System.out.println("�r�n Birim Fiyat� "+product.unitPrice);
			System.out.println("�r�n Detay�: "+product.detail);
			System.out.println("");
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ak�ll� Telefon";
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		productManager.addToCart(product4);
		
		
	}

}
