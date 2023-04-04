package testcases;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.Base;
import pages.LogoutPage;


public class LogoutTestCases extends Base {
	
	@Test
	public void LogoutPage() throws InterruptedException
	{
		  driver.get("https://www.saucedemo.com/");
		  LoginPage login = new LoginPage(driver);
		  login.setUserName("standard_user");
		  log.info("enter username"+global_username);
		  login.setPassword("secret_sauce");
		  log.info("enter password"+global_password);
		  login.clickButton();
		  log.info("click on login button");
		  
		  
		  LogoutPage logout = new LogoutPage(driver);
		  logout.verify_menu();
		  log.info("click on Menu button");
		  
		  
		  driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		  //Thread.sleep(6000);
		  logout.verify_logout_button_working_properly();
		  log.info("click on Logout Button");
		  
		 
	}

}
