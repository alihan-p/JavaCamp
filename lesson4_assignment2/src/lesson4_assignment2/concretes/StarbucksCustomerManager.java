package lesson4_assignment2.concretes;

import lesson4_assignment2.abstracts.CustomerCheckService;
import lesson4_assignment2.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;
	
			
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Starbucks müþterisi olarak eklendi " + customer.getFirstName());
			
		}
		else {
			System.out.println("Müþteri bilgileri doðrulanmadý!");
		}
		
	}

}
