package d4hw3;

public class Game {
	private int gameId;
	private String gameName;
	public Game(int gameId, String gameName) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	

}
