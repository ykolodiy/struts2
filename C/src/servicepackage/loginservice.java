package servicepackage;

import model.User;

public class loginservice {

	
	public boolean verifyuser (User user) {
		
		
		
		if(user.getUserid().equals("userid") && user.getPassword().equals("p")) {
					return true;
			
		}
			return false;
			}
	
	
}
