package managers;



import Utils.Validation;
import entities.Gamer;
import services.GamerService;

public class GamerManager implements GamerService {

	@Override
	public void signUp(Gamer gamer) {
		boolean validation = Validation.validate(gamer);
		if (validation == true) {
			System.out.println("ID: "+ gamer.getId() + " Registered ");
		}
		else {
			throw new IllegalStateException("Wrong Identity number");
		}
		
	}

	
	
	@Override
	 public void signIn(Gamer gamer) {
			// TODO Auto-generated method stub
			boolean validation = Validation.validate(gamer);
			if (validation == true) {
				System.out.println("ID: "+ gamer.getId() + "Signed ");
			}
			else {
				throw new IllegalStateException("Wrong Identity number");
			}
			
		}
		
	

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("ID: "+ gamer.getId() + " güncellendi");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("ID: "+ gamer.getId() + " silindi");
		
	}

}
