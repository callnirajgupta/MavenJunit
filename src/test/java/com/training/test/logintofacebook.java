package com.training.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.training.pageobject.FaceBook_Home;
import com.training.webaccess.WebConnector;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logintofacebook {
	private static Logger logger=LogManager.getLogger(logintofacebook.class);
	WebConnector selenium = WebConnector.getInstance();
	private FaceBook_Home faceBook_Home=new FaceBook_Home(selenium.getdriver());
	
	@When("^click on the home button$")
	public void click_on_the_home_button() throws InterruptedException{
		logger.debug("click on the home button");
		Thread.sleep(5000);
		faceBook_Home.clickHome();
	}
	
	@Then("^verify that home page is displayed$")
	public void verify_that_home_page_is_displayed(){
		logger.debug("verify that home page is displayed");
		
		
	}
}
