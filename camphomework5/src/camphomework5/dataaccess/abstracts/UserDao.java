package camphomework5.dataaccess.abstracts;

import java.util.List;

import camphomework5.entities.contretes.User;

public interface UserDao {
	void add(User user);
	void delete(int userId);
	void uptade(User user);
	List<User> getAll();
	User get(String email);
}
