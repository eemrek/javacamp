package camphomework5.business.concretes;

import java.util.List;

import camphomework5.business.abstracts.UserService;
import camphomework5.core.EmailService;
import camphomework5.dataaccess.abstracts.UserDao;
import camphomework5.entities.contretes.User;

public class UserManager implements UserService{

	
	
	private UserDao userDao;
	
	private EmailService emailService;
	
	public UserManager(UserDao userDao, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}

	
	@Override
	public void add(User user) {
		userDao.add(user);
	
		
	}

	@Override
	public void uptade(User user) {
		userDao.uptade(user);
		
		
	}

	@Override
	public void delete(int userId) {
		userDao.delete(userId);
		
	}

	@Override
	public User get(String email) {
		
		return  userDao.get(email);
		
	}

	@Override
	public List<User> getAll() {
		
		return  userDao.getAll();
		
	}

}
