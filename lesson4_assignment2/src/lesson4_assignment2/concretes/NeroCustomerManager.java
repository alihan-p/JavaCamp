package lesson4_assignment2.concretes;


import lesson4_assignment2.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		System.out.println("Nero m��terisi olarak kaydedildi " + customer.getFirstName());
		
	}

}
