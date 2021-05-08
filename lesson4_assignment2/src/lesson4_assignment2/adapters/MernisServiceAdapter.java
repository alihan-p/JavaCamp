package lesson4_assignment2.adapters;

import lesson4_assignment2.abstracts.CustomerCheckService;
import lesson4_assignment2.entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if (customer.getNationalityNumber().length() == 11) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
