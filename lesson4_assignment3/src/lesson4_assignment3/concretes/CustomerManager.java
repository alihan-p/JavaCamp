package lesson4_assignment3.concretes;

import lesson4_assignment3.abstracts.CustomerCheckService;
import lesson4_assignment3.abstracts.CustomerService;
import lesson4_assignment3.entities.Customer;

public class CustomerManager implements CustomerService {
	
	CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("M��teri eklendi:  " + customer.getFirstName());
			
		}
		else {
			System.out.println("M��teri bilgileri do�rulanmad�: " + customer.getFirstName());
		}
	}

	@Override
	public void update(Customer customer) {
		System.out.println("M��teri g�ncellendi:  " + customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri silindi:  " + customer.getFirstName());
		
	}

}
