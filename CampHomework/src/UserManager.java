
public interface UserManager {
	
	void  login(User user);

	void register(User user);	
	
	default void deneme(Student student) {
		register(student);
		
	}
}
