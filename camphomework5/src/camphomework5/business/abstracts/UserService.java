package camphomework5.business.abstracts;

import java.util.List;

import camphomework5.entities.contretes.User;

public interface UserService {
	
	void add(User user);
	void uptade(User user);
	void delete(int userId);
	User get(String email);
	List<User> getAll();
}
