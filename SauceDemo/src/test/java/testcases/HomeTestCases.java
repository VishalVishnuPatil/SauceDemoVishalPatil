package testcases;

import org.apache.commons.exec.LogOutputStream;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.Base;
import pages.HomePage;

public class HomeTestCases extends Base {
	
	@Test
	void HomePage()
	{
		driver.get("https://www.saucedemo.com/");
		LoginPage login = new LoginPage(driver);
		login.setUserName("standard_user");
		log.info("enter username"+global_username);
		login.setPassword("secret_sauce");
		 log.info("enter password"+global_password);
		login.clickButton();
		log.info("click on login button");
		  
		
		
		HomePage home = new HomePage(driver);
		home.verifyhome();
		log.info("Verified Homepage");
		  
	
		
	}
	
	

}
