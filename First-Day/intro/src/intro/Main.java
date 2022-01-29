package intro;

public class Main {

	public static void main(String[] args) {
		
		//Don't Repeat Yourself! - DRY
		//camelCase
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.56;
		double dolarBugun = 8.55;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu + "'ne giri� yap�ld�.");
		System.out.println("D�n�n Dolar Fiyat� : " + dolarDun);
		System.out.println("Bug�n�n Dolar Fiyat� : " + dolarBugun);
		
		if(dolarDun < dolarBugun)
		{	
			dustuMu = false;
			System.out.println("Dolar y�kseldi.");
		}
		
		else if(dolarDun > dolarBugun)
		{
			dustuMu = true;
			System.out.println("Dolar d��t�.");
		}
		
		else
		{
			System.out.println("Dolar fiyat� d�n ile ayn�.");
		}
		
		//Array,
		System.out.println("Kredi bilgileri y�kleniyor.");
		String[] krediler = {"H�zl� Kredi","Konut Kredisi","Ta��t Kredisi","�ift�i Kredisi","Emekli Kredisi"};
		
		for(int i=0; i<krediler.length; i++)
		{
			System.out.println(i+1 + ".Kredi T�r�: " + krediler[i]);
		}
		
		//foreach
		for(String kredi : krediler)
		{
			System.out.println(kredi);
		}
		
		//de�er tip, int,double,boolean
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		//referans tip, dizi,class,interface,abstract class
		//string referans tip olsa da de�er tip gibi �al���r
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		
		
		
		
	}

}
