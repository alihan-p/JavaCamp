package lesson4_assignment2.abstracts;

import lesson4_assignment2.entities.Customer;

public interface CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer);
}
