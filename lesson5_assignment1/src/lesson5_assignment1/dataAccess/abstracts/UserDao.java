package lesson5_assignment1.dataAccess.abstracts;

import java.util.List;

import lesson5_assignment1.entities.concretes.User;

public interface UserDao {
	void add(User user);

	void update(User user);

	void delete(User user);

	User get(String email); 

	List<User> getAll();
}
