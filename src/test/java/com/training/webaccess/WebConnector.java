package com.training.webaccess;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.test.Global;



public class WebConnector {

	private static Logger logger=LogManager.getLogger(WebConnector.class);
	 Properties prop = null;
	
	WebDriver driver =null;
	WebDriver Firefox=null;
	WebDriver chrome=null;
	WebDriver ie=null;
	static WebConnector w;

	private WebConnector() {

		if (prop == null) {
			try {
				prop = new Properties();
				FileInputStream fis = new FileInputStream(
						System.getProperty("user.dir")
						+ "\\src\\test\\java\\com\\training\\config\\config.properties");
				prop.load(fis);
			} catch (Exception e) {
				System.out.println(e.getStackTrace() + e.getMessage());

			}
		}
		
	}

	public  String getPropertiesValue(String key) {

		return prop.getProperty(key);
	}

	public  void openBrowser() {
	
			if (prop.getProperty("Browser").equals("Firefox") && Firefox==null ) {
				driver = new FirefoxDriver();
				Firefox=driver;
			}else if(prop.getProperty("Browser").equals("Firefox") && Firefox!=null){
				driver=Firefox;
			} else if (prop.getProperty("Browser").equals("IE")) {
				System.setProperty("webdriver.IE.driver",
						"\\Resource\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			} else if (prop.getProperty("Browser").equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"\\Resource\\chromedriver.exe");
				driver = new ChromeDriver();

			}

			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}



	public  void openUrl() {

		driver.get(getPropertiesValue("URL"));


	}


	public WebDriver getdriver(){
		return driver;

	}

	

	public static WebConnector getInstance(){
		if(w==null)
			w= new WebConnector();
		
		return w;
	}
	public void closebrowser() {
		try {
			if(driver != null){
			
				driver.close();
				driver.quit();
				logger.debug("the browser has been closed");
			}
		} catch (Exception e) {
			logger.error("cannot close browser: unreachable browser");
		} finally {
			driver = null;
			Firefox=null;
		}
	}

	
	
	

}
