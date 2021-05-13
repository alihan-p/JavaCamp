package lesson5_assignment1.core.concretes;

import lesson5_assignment1.core.abstracts.VerificationService;
import lesson5_assignment1.entities.concretes.User;

public class eMailVerificationManager implements VerificationService {

	@Override
	public void verify(User user) {
		user.setActive(true);
		System.out.println(user.getEmail() + " hesap doðrulandý!");
		
	}

}
