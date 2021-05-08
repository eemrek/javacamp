package camphomework5.business.abstracts;

import camphomework5.entities.contretes.LoginDto;
import camphomework5.entities.contretes.User;

public interface AuthService {
	
	void register(User user);
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto dto);
	
}
