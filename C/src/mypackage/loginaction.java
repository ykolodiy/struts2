package mypackage;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.User;
import servicepackage.loginservice;

//public class loginaction implements Action {
public class loginaction extends ActionSupport implements ModelDriven {
	// if use implement interface no need this private static String SUCCESS = "success";
	
	
	
	
	private String userid;
	private String password;
	
	
	//let use user object
	private User user = new User() ;
	
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	// can validate that is and pass not blank
	public void validate() {
		if (StringUtils.isEmpty(user.getUserid())){
			 addFieldError("userid", "userid can be blank");
			
		}
		if (StringUtils.isEmpty(user.getPassword())){
			 addFieldError("password", "password can be blank");
			
		}
		
		
	}
	
	
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String execute () {
	loginservice ls = new loginservice();

	if(ls.verifyuser(user)) {
				return SUCCESS;
		
	}
		return LOGIN;
		}

	
	//lets strut get model and dont need in login.jsp to use user.userid...

	@Override
	public Object getModel() {
	
		return user;
	}
	
	

	
	
	
}
