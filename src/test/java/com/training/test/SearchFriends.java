package com.training.test;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.training.pageobject.FaceBook_Home;
import com.training.webaccess.WebConnector;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchFriends {

	
	
	private static Logger logger=LogManager.getLogger(logintofacebook.class);
	WebConnector selenium = WebConnector.getInstance();
	private FaceBook_Home faceBook_Home=new FaceBook_Home(selenium.getdriver());
	
	
	@When("^search friend in homr page$")
	public void search_friend_in_homr_page(){
		logger.debug("search friend in homr page");
		faceBook_Home.clickSearchLabel();
		faceBook_Home.getSearchLabel().sendKeys("Rubi Gupta");
	}
	
	
	@Then("^verify that friend is search successfully$")
	public void verify_that_friend_is_search_successfully(){
		logger.debug("verify that friend is search successfully");
		
		faceBook_Home.firstclickfirstsearch();
	}
}
