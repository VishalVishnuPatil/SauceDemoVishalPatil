package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import pages.CartPage;
import utility.Base;

public class CartTestCases extends Base{
	
	@Test
	public void CartPage() throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
		LoginPage login = new LoginPage(driver);
		
		login.setUserName("standard_user");
		log.info("enter username"+global_username);
		login.setPassword("secret_sauce");
		log.info("enter password"+global_password);
		login.clickButton();
		log.info("click on login button");
		
		
		CartPage cart = new CartPage(driver);
		cart.backpack_productclick();
		log.info("Opening page of product by clicking name Sauce Labs Backpack ");
		
		cart.backpack_addtocart();
		log.info("Added Sauce Labs Backpack product to Cart");
		cart.verify_Cart_at_Home_and_it_clickable();
		log.info("Clicking on cart button");
		
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		//Thread.sleep(6000);
		cart.checkout_products();
		log.info("Checkout the Products by clicking Checkout button");
		
		cart.setfirst_name("Vishal");
		log.info("Adding First Name Vishal");
		cart.setlast_name("Patil");
		log.info("Adding Last Name Patil");

		cart.set_zip("123");
		log.info("Adding Zipcode 123");
		
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		//Thread.sleep(6000);

		
		cart.countinueclick();
		log.info("click on countinue button");

		cart.finishclick();
		log.info("click on Finish Button ");
		
		
		 LogoutPage logout = new LogoutPage(driver);
		  logout.verify_menu();
		  log.info("click on Menu button");
		  
		  driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		 // Thread.sleep(6000);
		  logout.verify_logout_button_working_properly();
		  log.info("click on Logout Button");
		
	}
	
}
