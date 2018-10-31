package Model;

public class Validation {
	private String username = "admin";
	private String password = "admin";
	
	public boolean isAdmin(String username, String password) {
		if(this.username.equals(username) && this.password.equals(password)) {
			return true;
		}
		return false;
	}
}
