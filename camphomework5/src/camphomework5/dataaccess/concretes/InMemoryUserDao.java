package camphomework5.dataaccess.concretes;

import java.util.ArrayList;
import java.util.List;

import camphomework5.business.abstracts.UserService;
import camphomework5.dataaccess.abstracts.UserDao;
import camphomework5.entities.contretes.User;

public class InMemoryUserDao implements UserDao{

	private List<User> users = new ArrayList<User>();
	
	public InMemoryUserDao() {
		User user = new User(1,"Emre","Kocabey","emre@emre.com","123456",true);
		User user2 = new User(2,"Halil","Polat","emre@emre.com","123456",true);
		User user3 = new User(3,"Tuğberk","Bütün","emre@emre.com","123456",true);
		users.add(user);
		users.add(user2);
		users.add(user3);
		
	}
	
	@Override
	public void add(User user) {
		System.out.println("Kaydedildi : " + user.getEmail());
		users.add(user);
		
	}

	@Override
	public void delete(int userId) {
		User userToDelete = users.stream()
				.filter(u->u.getId()==userId)
				.findFirst()
				.orElse(null);
			users.remove(userToDelete);
		
	}

	@Override
	public void uptade(User user) {
		User userUptade = users.stream()
				.filter(u->u.getId()==user.getId()) 
				.findFirst()
				.orElse(null);
		
		userUptade.setEmail(user.getEmail());
		userUptade.setFirstName(user.getFirstName());
		userUptade.setLastName(user.getLastName());
		userUptade.setPassword(user.getPassword());
		userUptade.setVerify(user.isVerify());
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	@Override
	public User get(String email) {
		User user = users.stream()
				.filter(u -> u.getEmail() == email)
				.findFirst()
				.orElse(null);
		return user;
	}

}
