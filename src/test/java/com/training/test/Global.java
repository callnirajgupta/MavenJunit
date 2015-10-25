package com.training.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;





import com.training.pageobject.FacebookLogin;
import com.training.webaccess.WebConnector;
import com.training.pageobject.FaceBook_Home;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;

public class Global {
	private static Logger logger=LogManager.getLogger(Global.class);

	private static WebConnector selenium = WebConnector.getInstance(); 
	private FacebookLogin facebookLogin;
	private FaceBook_Home faceBook_Home;
	 
	@Given("^Login to facebook application")
	public void Login_to_face_book_application() throws InterruptedException{
		logger.debug("Login to face book application"+Global.class.getCanonicalName());
		selenium.openBrowser();
		selenium.openUrl();
		facebookLogin=new FacebookLogin(selenium.getdriver());
	    System.out.println("value from properties"+selenium.getPropertiesValue("UserName"));
		facebookLogin.facebooklogin(selenium.getPropertiesValue("UserName"), selenium.getPropertiesValue("Password"));
		Thread.sleep(2000);
	
	}
	
	
	@Given("^Logout from the facebook Application$")
	public void Logout_from_the_facebook_Application(){
		faceBook_Home=new FaceBook_Home(selenium.getdriver());
		faceBook_Home.logout_app();
		
	}
	
	
	@After
	public void AfterTest(){
		logger.debug("Close the browser");
		selenium.closebrowser();
	}
}
