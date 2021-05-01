
public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() +" Başarıyla Giriş Yaptın!!");
	}
	
	
	public void register(User user) {
		System.out.println(user.getFirstName() +" Başarıyla Üye Oldunuz!!");
	}
}
