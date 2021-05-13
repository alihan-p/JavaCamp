package lesson5_assignment1;


import lesson5_assignment1.business.concretes.UserManager;
import lesson5_assignment1.core.concretes.eMailSignUpManager;
import lesson5_assignment1.core.concretes.googleSignUpManagerAdapter;
import lesson5_assignment1.dataAccess.concretes.HibernateUserDao;
import lesson5_assignment1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Alihan", "Polat", "alihan_polat@gmail.com", "123456789");
		User user2 = new User("A", "P", "alihan_polat@gmail.com", "123456789");
		User user3 = new User("Alihan", "Polat", "alihan", "123456789");
		User user4 = new User("Alihan", "Polat", "alihan_polat@hotmail.com", "123");
		
		
		UserManager userManager = new UserManager();
		
		userManager.signUp(user1, new eMailSignUpManager(), new HibernateUserDao());
		System.out.println("------------");
		userManager.signUp(user2, new eMailSignUpManager(), new HibernateUserDao());
		System.out.println("------------");
		userManager.signUp(user3, new eMailSignUpManager(), new HibernateUserDao());
		System.out.println("------------");
		userManager.signUp(user4, new eMailSignUpManager(), new HibernateUserDao());
		System.out.println("------------");
		
		userManager.signUp(user1, new googleSignUpManagerAdapter(), new HibernateUserDao());
		System.out.println("------------");
		
		userManager.signIn("alihan_polat@hotmail.com", "123456789");
		System.out.println("------------");
		userManager.signIn("alihan_polat@gmail.com", "123456789");
	}

}
