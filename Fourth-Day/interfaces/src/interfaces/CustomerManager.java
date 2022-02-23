package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	//loosly - tightly coupled - ba�l�l�k t�rleri, kat� ve yumu�ak
	public void add(Customer customer) {
		System.out.println("M��teri eklendi: " + customer.getFirstName());
		Utils.RunLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi: " + customer.getFirstName());
		Utils.RunLoggers(loggers, customer.getFirstName());
	}
}
