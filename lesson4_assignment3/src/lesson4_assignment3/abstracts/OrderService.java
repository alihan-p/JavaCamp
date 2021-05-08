package lesson4_assignment3.abstracts;

import lesson4_assignment3.entities.Campaign;
import lesson4_assignment3.entities.Customer;
import lesson4_assignment3.entities.Game;

public interface OrderService {
	public void sellGame(Customer customer, Game game, Campaign campaign);
}
