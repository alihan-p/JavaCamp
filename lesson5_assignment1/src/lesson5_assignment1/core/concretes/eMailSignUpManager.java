package lesson5_assignment1.core.concretes;

import lesson5_assignment1.core.abstracts.SignUpService;
import lesson5_assignment1.entities.concretes.User;

public class eMailSignUpManager implements SignUpService {

	@Override
	public void signUp(User user) {
		System.out.println(user.getEmail() + " sisteme kayýt oldu!");
		System.out.println("Doðrulama e-postasý gönderildi");
		eMailVerificationManager manager = new eMailVerificationManager();
		manager.verify(user);
		
	}
	
}
