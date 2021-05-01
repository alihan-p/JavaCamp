package lesson3_assignment2;

public class UserManager {
	public void Add(User user) {
		System.out.println(user.getEmail() + " kullanýcý eklendi!");
	}
	
	public void Delete(User user) {
		System.out.println(user.getEmail() + " kullanýcý silindi!");
	}
}
