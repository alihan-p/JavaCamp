package lesson5_assignment1.core.concretes;

import lesson5_assignment1.core.abstracts.SignUpService;
import lesson5_assignment1.entities.concretes.User;
import lesson5_assignment1.googleSignUpManager.googleSignUpManager;

public class googleSignUpManagerAdapter implements SignUpService {

	googleSignUpManager manager = new googleSignUpManager();
	
	@Override
	public void signUp(User user) {
		manager.signUp(user.getEmail());
		user.setActive(true);
		
	}

}
