package lesson3_assignment2;

public class UserManager {
	public void Add(User user) {
		System.out.println(user.getEmail() + " kullan�c� eklendi!");
	}
	
	public void Delete(User user) {
		System.out.println(user.getEmail() + " kullan�c� silindi!");
	}
}
