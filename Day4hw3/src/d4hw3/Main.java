package d4hw3;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1,"Pýnar","Bedir",1998,"0000000000");
		Gamer gamer2 = new Gamer(1,"Engin","Demiroð",1985,"0000000000");
		
		Game game1 = new Game(1,"pubg");
		Game game2 = new Game(2,"Fifa");
		
		Campaign campaign1 = new Campaign(1, "spring discount");
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.saleGame(gamer1, game2, campaign1);

	}

}
