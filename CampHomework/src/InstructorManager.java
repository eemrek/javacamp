
public class InstructorManager implements UserManager{

	public void showSalary(Instructor instructor) {
		System.out.println("Maaşınız: " + instructor.getSalary());
	}
	
	@Override
	public void login(User instructor) {
		System.out.println(instructor.getFirstName() + " Eğitmen olarak giriş yaptınız!!");
	}
	
	@Override
	public void register(User instructor) {
		System.out.println(instructor.getFirstName() + " Egitmen Üyeliğiniz Oluşturuldu!!");
	}
}
