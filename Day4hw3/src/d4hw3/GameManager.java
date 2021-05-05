package d4hw3;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " is added");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " is updated");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " is deleted");
	}



}
