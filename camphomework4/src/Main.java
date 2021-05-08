import entities.Campaign;
import entities.Game;
import entities.Gamer;
import managers.CampaignManager;
import managers.GameManager;
import managers.GamerManager;
import managers.SaleManager;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Emre");
		gamer1.setLastName("Kocabey");
		gamer1.setNationalId("11111111111");
		gamer1.setBirthday("01.08.2001");
		
	  Game gta = new Game();
	  gta.setGameId(1);
	  gta.setGameName("Grand Thief Auto 5");
	  gta.setUnitPrice(200);
	  
	  Campaign gtaC = new Campaign();
	  gtaC.setCampaignId(1);
	  gtaC.setCampaignDetail("Gta 5 %10 indirim");
	  gtaC.setDiscount(10); 
	  gtaC.setGame(gta);
	  
	  GameManager oyunManager = new GameManager();
	  oyunManager.add(gta);
	  oyunManager.update(gta);
	  
	  GamerManager oyuncuManager = new GamerManager();
	  oyuncuManager.signUp(gamer1);
	  oyuncuManager.signIn(gamer1);
	  oyuncuManager.update(gamer1);
	  
	  CampaignManager  campaignManager = new CampaignManager();
	  campaignManager.addCampaign(gtaC);
	  campaignManager.updateCampaign(gtaC);
	  
	  SaleManager saleManager = new SaleManager();
	  saleManager.buy(gtaC, gta, gamer1);
	  
	  
	  

	}

}
