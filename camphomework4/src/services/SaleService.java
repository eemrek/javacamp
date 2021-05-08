package services;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SaleService {
	void buy(Campaign campaign, Game game, Gamer gamer);
	void refund(Game game, Gamer gamer);
}
