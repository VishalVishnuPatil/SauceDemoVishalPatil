package testcases;

import utility.Base;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductsPage;

public class ProductsTestCases extends Base{
	
	@Test
	void ProductPage()
	{
		
		driver.get("https://www.saucedemo.com/");
		LoginPage login = new LoginPage(driver);
		login.setUserName("standard_user");
		log.info("enter username"+global_username);
		login.setPassword("secret_sauce");
		log.info("enter password"+global_password);
		login.clickButton();
		log.info("click on login button");
		
		
		
		
		ProductsPage products = new ProductsPage(driver);
		
		products.verify_productname_clicking_move_productpage();
		log.info("click on Product name and opening Product information Page");
		//Assert.assertEquals(false, true);
				
	}

}
