package lesson5_assignment1.business.concretes;

import lesson5_assignment1.business.abstracts.UserService;
import lesson5_assignment1.core.abstracts.SignUpService;
import lesson5_assignment1.dataAccess.abstracts.UserDao;
import lesson5_assignment1.entities.concretes.User;

import java.util.regex.Pattern;

public class UserManager implements UserService {
	
	@Override
	public void signUp(User user, SignUpService signUpService, UserDao userDao) {
		if (isValidUser(user)) {
			signUpService.signUp(user);
			userDao.add(user);
			
		}else {
			System.out.println("Kayıt gerçekleşmedi!");
		}
	}

	@Override
	public void signIn(String eMail, String password) {
		if (isExistingUser(eMail,password)) {
			System.out.println(eMail + " siteme giriş yaptı");
		}else {
			System.out.println("Giriş yapılmadı. Kullanıcı bilgileri geçersiz");
		}
		
	}

	
	private boolean isValidUser (User user) {
		
		String mailPattern = "^(.+)@(.+)$";
		
		if (user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karaketerden oluşmalıdır!");
			return false;
		}else if (!Pattern.matches(mailPattern, user.getEmail().toUpperCase())) {
			System.out.println("Email adresiniz doğru değildir.");
			return false;
		}else if (isExistingUser(user.getEmail(), user.getPassword())) {
			System.out.println("Kayıtlı e-posta");
			return false;
		}else if (user.getFirstName().length()<2 || user.getLastName().length()<2) {
			System.out.println("Ad ve soyad en az iki karakterden oluşmalıdır.");
			return false;
		}else {
			return true;
		}
	}

	private boolean isExistingUser(String eMail, String password) {
		// check database 
		if (eMail == "alihan_polat@hotmail.com") {
			return true;
		}else {
			return false;
		}
		
	}

	

	

}
