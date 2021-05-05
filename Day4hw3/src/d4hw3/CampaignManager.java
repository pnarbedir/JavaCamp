package d4hw3;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign is added: " + campaign.getCampaignName() );
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign is added: " + campaign.getCampaignName());

		
	}

	@Override
	public void deleted(Campaign campaign) {
		System.out.println("Campaign is added: " + campaign.getCampaignName());

		
	}

}
