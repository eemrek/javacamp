package entities;

public class Campaign {

	private int campaignId;
	private String campaignDetail;
	private int discount;
	private double priceAfterDiscount;
	Game game;
	
	
	public Campaign() {}
	public Campaign(int campaignId, String campaignDetail, int discount, double priceAfterDiscount) {
		super();
		this.campaignId = campaignId;
		this.campaignDetail = campaignDetail;
		this.discount = discount;
		this.priceAfterDiscount = priceAfterDiscount;
	}

	
	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public Game getGame() {
		return game;
	}


	public void setGame(Game game) {
		this.game = game;
	}


	public String getCampaignDetail() {
		return campaignDetail;
	}

	public void setCampaignDetail(String campaignDetail) {
		this.campaignDetail = campaignDetail;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getPriceAfterDiscount() {
		return this.game.getUnitPrice() - (this.game.getUnitPrice() / 100 *  this.discount) ; 
	}


	
	
}
