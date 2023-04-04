package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class ProductsPage {

	WebDriver ldriver;
	
	
	public ProductsPage(WebDriver driver)
	{
		ldriver = driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
	WebElement bolttshirt;
	

	
	
	
	
	public void verify_productname_clicking_move_productpage()
	{
		bolttshirt.click();
	}
	
	
	
}
