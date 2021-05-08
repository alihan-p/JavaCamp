package lesson4_assignment3.adapters;

import lesson4_assignment3.abstracts.CustomerCheckService;
import lesson4_assignment3.entities.Customer;

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
