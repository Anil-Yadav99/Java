package App.Todo;

import org.springframework.stereotype.Service;

@Service
public class ValidateUser {

	public boolean isValidateUser(String user, String password) {
		return user.equalsIgnoreCase("Yadav") && password.equals("Yadav");
		}

}
