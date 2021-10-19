package com.fblogin.org;

import com.baseclass.Base_Class;
import com.loginpom.org.FBlogin_POM;

public class Facebooklogin extends Base_Class  {

	public static void main(String[] args) {
		 
	      browserLaunch("chrome");
	      getUrl("https://www.facebook.com/");
	      
	      FBlogin_POM login = new FBlogin_POM(driver);
	      
	      sendKeys(login.getUsername(), "manivenom@gmail.com");
	      sendKeys(login.getPassword(), "robinleo");
	      click(login.getLogin());

	}

}
