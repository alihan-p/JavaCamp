package lesson4_assignment2.concretes;

import lesson4_assignment2.abstracts.CustomerService;
import lesson4_assignment2.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Müþteri Eklendi " + customer.getFirstName());
		
	}

}
