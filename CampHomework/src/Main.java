
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setFirstName("Emre");
		student1.setId(1);
		student1.setEmail("emre@emre.com");
		student1.setLastName("Kocabey");
		student1.setProgress("%100");
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engin@engin.com");
		instructor1.setId(2);
		instructor1.setSalary("23000");
		
		
		UserManager userManager = new StudentManager();
		userManager.register(student1);
		
		UserManager userManager2 = new InstructorManager();
		userManager2.register(instructor1);
		
	}

}
