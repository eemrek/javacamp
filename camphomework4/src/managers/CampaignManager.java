package managers;

import entities.Campaign;
import services.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignDetail() + " yeni kampanya eklendi!!" );
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignDetail() +  " kampanya güncellendi!!");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignDetail() + " kampanya silindi!! ");
		
	}

}
