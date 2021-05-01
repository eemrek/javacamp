
public class StudentManager extends UserManager{

	public void showProgress(Student student) {
		System.out.println("İlerlemeniz " + student.getProgress());
	}
	
	@Override
	public void login(User student) {
	 System.out.println(student.getFirstName()+ " Öğrenci olarak giriş yaptınız!!");	
	}
	
	@Override
	public void register(User student) {
		System.out.println(student.getFirstName() +" Öğrenci olarak kaydoldunuz!!");
	}
}
