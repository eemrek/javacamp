package camphomework5.business.concretes;

import camphomework5.core.utils.Utils;

import camphomework5.business.abstracts.AuthService;
import camphomework5.business.abstracts.UserService;
import camphomework5.entities.contretes.LoginDto;
import camphomework5.entities.contretes.User;

public class AuthManager implements AuthService {

	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if (userValidate(user) && passwordValidate(user.getPassword()) && !userExists(user.getEmail()) == false
				&& Utils.emailValidate(user.getEmail())) {
			userService.add(user);
		}
		System.out.println("Kayıt başarısız");

	}

	@Override
	public void verify(User user, String token) {
		if (user != null && token.length() > 20) {
			User exitsUser = userService.get(user.getEmail());
			exitsUser.setVerify(true);
			userService.uptade(exitsUser);
			System.out.println("Doğrulandı");
		}
		System.out.println("Doğrulanmadı");

	}

	@Override
	public boolean userExists(String email) {
		User user = userService.get(email);

		if (user == null) {
			return false;
		}

		else {
			System.out.println("Email zaten mevcut.!" + email);
			return true;
		}
	}

	@Override
	public void login(LoginDto dto) {
		User user = userService.get(dto.getEmail());

		if (user != null && user.getPassword().equals(dto.getPassword())) {
			System.out.println("Başarıyla giriş yaptınız.");
		} else {
			System.out.println("Kullanıcı adı veya şifren yanlış.!");
		}

	}

	public boolean userValidate(User user) {
		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.getEmail().isEmpty() && !user.getPassword().isEmpty()) {
			return true;

		}
		System.out.println("Boş alan bırakmayınız!!");
		return false;
	}

	public boolean passwordValidate(String password) {
		if (password.length() >= 6) {
			return true;
		}
		System.out.println("Şifre en az 6 karakterli olmalıdır!!");
		return false;
	}

}
