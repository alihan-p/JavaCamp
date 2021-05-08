package lesson4_assignment3.concretes;

import lesson4_assignment3.abstracts.OrderService;
import lesson4_assignment3.entities.Campaign;
import lesson4_assignment3.entities.Customer;
import lesson4_assignment3.entities.Game;

public class OrderManager implements OrderService {

	@Override
	public void sellGame(Customer customer, Game game, Campaign campaign) {
		System.out.println(game.getName() + " oyunu " + customer.getFirstName() + "'a " + campaign.getName() + " kampanyasý ile satýþý yapýldý");
		
	}

}
