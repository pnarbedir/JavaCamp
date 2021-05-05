package d4hw3;

public class GameSaleManager implements GameSaleService{
	

	@Override
	public void saleGame(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " is sold: " + game.getGameName());
		
		
	}
	public void saleGame(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " is sold: " + game.getGameName() + " : " + campaign.getCampaignName());
		
		
	}

}
