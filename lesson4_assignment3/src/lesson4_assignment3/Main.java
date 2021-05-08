package lesson4_assignment3;

import java.time.LocalDate;

import lesson4_assignment3.adapters.MernisServiceAdapter;
import lesson4_assignment3.concretes.CampaignManager;
import lesson4_assignment3.concretes.CustomerManager;
import lesson4_assignment3.concretes.GameManager;
import lesson4_assignment3.concretes.OrderManager;
import lesson4_assignment3.entities.Campaign;
import lesson4_assignment3.entities.Customer;
import lesson4_assignment3.entities.Game;
import lesson4_assignment3.entities.Order;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "Alihan", "Polat", LocalDate.of(1993, 7, 30), "12345678900");
		Customer customer2 = new Customer(1, "Ahmet", "Polat", LocalDate.of(1995, 7, 30), "1234567890");
		
		Game game = new Game(1, "League of Legends", 100);
		
		Campaign campaign = new Campaign(1, "%10 indirim", 10);
		
		Order order = new Order();
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		
		CampaignManager campaignManager = new CampaignManager();
		
		GameManager gameManager = new GameManager();
		
		OrderManager orderManager = new OrderManager();
		
		customerManager.add(customer);
		customerManager.add(customer2);
		customerManager.update(customer);
		customerManager.delete(customer);
		
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		gameManager.add(game);
		
		orderManager.sellGame(customer, game, campaign);
		

	}

}
