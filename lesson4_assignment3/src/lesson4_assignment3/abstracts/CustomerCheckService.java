package lesson4_assignment3.abstracts;

import lesson4_assignment3.entities.Customer;

public interface CustomerCheckService {
	public boolean checkIfRealPerson(Customer customer);
}
