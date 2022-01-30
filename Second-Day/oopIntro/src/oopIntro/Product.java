package oopIntro;

public class Product {
	//constructer
	//class� olu�tururken olmas�n� istedi�imiz �eyi yaz�yoruz.
	public Product() {
		System.out.println("Ben �al��t�m.");
	}
	//Bu 2 product, imza
	public Product(int id, String name, double unitPrice, String detail) {
		this(); //Ben �al��t�m� yazd�r�r, yani parametresiz imzay� �al��t�r�r.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
}
