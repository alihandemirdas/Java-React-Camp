package inheritance;

public class CustomerManager {
	
	//Polymorphism
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " numaral� �ye kaydedildi.");
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
	
}

//SOLID- O ->Open Closed Principle
//Sisteme yeni �zellik eklendi�inde mevcutta bulunan hi�bir kodu de�i�tiremezsin

