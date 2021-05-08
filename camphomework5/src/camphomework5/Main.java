package camphomework5;

import camphomework5.business.concretes.AuthManager;
import camphomework5.business.concretes.UserManager;
import camphomework5.core.AmazonMailManagerAdapter;
import camphomework5.core.GoogleMailManagerAdapter;
import camphomework5.dataaccess.concretes.InMemoryUserDao;
import camphomework5.entities.contretes.User;

public class Main {

	public static void main(String[] args) {
		
		//UserManager userManager=new UserManager(new InMemoryUserDao(), new AmazonMailManagerAdapter());
				User mert=new User(4, "Mert", "Çakmak", "mertcakmak@gmail.com", "123654", true);
				//userManager.add(mert);
				
				User enes = new User(2, "Hilmi", "Şafak", "hilmisafak@gmail.com", "147258", false);
				//userManager.update(enes);
				
				InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
				GoogleMailManagerAdapter googleMailManagerAdapter = new GoogleMailManagerAdapter();
				AmazonMailManagerAdapter amazonMailManagerAdapter = new  AmazonMailManagerAdapter();

				
				AuthManager authManager =new AuthManager(new UserManager(inMemoryUserDao, googleMailManagerAdapter));
				//authManager.register(mert);
				authManager.register(mert);
				////userManager.getAll();
				//userManager.getAll();	
	}

}
