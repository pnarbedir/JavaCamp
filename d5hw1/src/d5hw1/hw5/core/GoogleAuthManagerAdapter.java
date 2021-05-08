package d5hw1.hw5.core;

import d5hw1.hw5.GoogleAuthManager.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

	@Override
	public void register(String email, String password) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.register(email,password);
	}

	@Override
	public void login(String email, String password) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(email,password);
	}

}
