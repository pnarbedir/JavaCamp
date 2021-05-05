package d4hw3;

public class GamerManager implements GamerService {
	UserValidationService userValidationService;
	

	public GamerManager(UserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if(userValidationService.validate(gamer)) {
			System.out.println("gamer is added: " + gamer.getFirstName());
		}
		else {
			System.out.println("Not a valid person");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println("gamer is updated: " + gamer.getFirstName());

		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println("gamer is deleted: " + gamer.getFirstName());
		
	}

}
