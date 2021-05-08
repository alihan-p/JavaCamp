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
			System.out.println("Müþteri eklendi:  " + customer.getFirstName());
			
		}
		else {
			System.out.println("Müþteri bilgileri doðrulanmadý: " + customer.getFirstName());
		}
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Müþteri güncellendi:  " + customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi:  " + customer.getFirstName());
		
	}

}
