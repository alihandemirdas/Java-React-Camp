package eCommerceBackendHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceBackendHomework.dataAccess.abstracts.CustomerDao;
import eCommerceBackendHomework.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{
	
	List<Customer> customers = new ArrayList<Customer>();
	
	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate ile m��teri eklendi: " + customer.getName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Hibernate ile m��teri g�ncellendi: " + customer.getName());

		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Hibernate ile m��teri silindi: " + customer.getName());

		
	}

	@Override
	public Customer get(int id) {
		return customers.get(id);
	}

	@Override
	public List<Customer> getAll() {

		return customers;
	}

}
