package lesson4_assignment2;


import lesson4_assignment2.adapters.MernisServiceAdapter;
import lesson4_assignment2.concretes.BaseCustomerManager;
import lesson4_assignment2.concretes.NeroCustomerManager;
import lesson4_assignment2.concretes.StarbucksCustomerManager;
import lesson4_assignment2.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager2 = new NeroCustomerManager();

		Customer customer = new Customer(1, "Alihan", "Polat", "1993,07,30", "1234567890");
		
		customerManager1.save(customer);
		customerManager2.save(customer);
		
		
	}

}
