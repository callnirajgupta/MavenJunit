package com.training.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_Home {
	private WebDriver driver=null;
	@FindBy(xpath="//a[contains(text(),'Home')]")
	private WebElement HomeButton;
	
	
	@FindBy(id="userNavigationLabel")
	private WebElement NavigateLabel;
	
	
	@FindBy(xpath="//span[contains(text(),'Log Out')]")
	private WebElement Logout;
	
	
	@FindBy(xpath="//div[@aria-label='Search Facebook']")
	private WebElement SearchLabel;
	
	
	@FindBy(xpath="(//span[contains(text(),'Rubi')])[position()=1]")
	private WebElement clickfirstsearch;
	
	public FaceBook_Home(WebDriver driver){
		this.driver=driver;
	    PageFactory.initElements(driver, this);
		
	}
	
	public void clickHome(){
		HomeButton.click();
		
	}
	
	public void clickNvigationLabel(){
		NavigateLabel.click();
	}

	public void clickLogout(){
		Logout.click();
	}
	
	
	public void logout_app(){
		NavigateLabel.click();
		Logout.click();
	}
	
	public void clickSearchLabel(){
		SearchLabel.click();
	}
	
	public WebElement getSearchLabel(){
		return SearchLabel;
	}
	
	public void firstclickfirstsearch(){
		clickfirstsearch.click();
	}
}
