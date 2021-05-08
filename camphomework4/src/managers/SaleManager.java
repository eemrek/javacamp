package managers;

import entities.Campaign;
import entities.Game;
import entities.Gamer;
import services.SaleService;

public class SaleManager implements SaleService{

	@Override
	public void buy(Campaign campaign, Game game, Gamer gamer) {
		System.out.println("New Game sold: "+ campaign.getPriceAfterDiscount() + " TL " + " " + game.getGameName()+ " ID : " + gamer.getId());
		
	}

	@Override
	public void refund(Game game, Gamer gamer) {
		
		
	}

}
