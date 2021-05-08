package lesson4_assignment3.concretes;

import lesson4_assignment3.abstracts.GameService;
import lesson4_assignment3.entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi:  " + game.getName());
		
	}

}
