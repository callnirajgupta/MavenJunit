package com.training.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
    WebDriver driver=null;
	public static final String facebook_login_username_id="email";
	@FindBy(id=facebook_login_username_id)
	private WebElement username;
	
	public static final String facebook_login_password_id="pass";
	@FindBy(id=facebook_login_password_id)
	private WebElement password;
	
	public static final String facebook_login_button_xpath="//input[@value='Log In']";
	@FindBy(xpath=facebook_login_button_xpath)
	private WebElement login;
	
	
	public FacebookLogin(WebDriver driver){
		this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	

	public  WebElement getusername(){
		return username;
		
	}
	
	public void setusername(String usernamevalue){
		username.sendKeys(usernamevalue);
	}
	
	public  WebElement getpassword(){
		return password;
		
	}
	
	public void setpassword(String pass){
		password.sendKeys(pass);
	}
	
	public void clicklogin(){
		login.click();
	}
	
	public void facebooklogin(String user,String pass){
		setusername(user);
		setpassword(pass);
		clicklogin();
		
		
	}
}


