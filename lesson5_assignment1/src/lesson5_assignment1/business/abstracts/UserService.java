package lesson5_assignment1.business.abstracts;

import lesson5_assignment1.core.abstracts.SignUpService;
import lesson5_assignment1.dataAccess.abstracts.UserDao;
import lesson5_assignment1.entities.concretes.User;

public interface UserService {
	public void signUp(User user, SignUpService signUpService, UserDao userDao);
	public void signIn(String eMail, String password);
}
