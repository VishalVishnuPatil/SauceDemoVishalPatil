package testcases;

import pages.LoginPage;
import utility.Base;

import org.testng.annotations.Test;

import pages.HeaderPage;

public class HeaderTestCases extends Base{
	
	@Test
	void HeaderPage()
	{
		
		driver.get("https://www.saucedemo.com/");
		LoginPage login = new LoginPage(driver);
		login.setUserName("standard_user");
		log.info("enter username"+global_username);
		login.setPassword("secret_sauce");
		 log.info("enter password"+global_password);
		login.clickButton();
		log.info("click on login button");
		
		
		
		HeaderPage header = new HeaderPage(driver);
		header.Verify_header_section_countain_menubarbutton_clickable();
		log.info("Verified Header Section");
	}

}
