package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver ldriver;
	
	public CartPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath = "//div[normalize-space()='Sauce Labs Backpack']")
	WebElement backpack;
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement backpackaddcart;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement carticon;
	
	
	
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkout;
	
	@FindBy(xpath =  "//input[@id='first-name']")      //"//input[@id='first-name']"  //input[@id='first-name']
	WebElement fname;
	
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lname;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement pinElement;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement countinuElement;
	
	@FindBy(xpath = "//button[@id='finish']")
	WebElement finshElement;
	
	
	public void backpack_productclick()
	{
		backpack.click();
	}
	
	public void backpack_addtocart()
	{
		backpackaddcart.click();
	}
	
	
	
	public void verify_Cart_at_Home_and_it_clickable()
	{
		carticon.click();
	}
	
	
	
	public void checkout_products()
	{
		checkout.click();
	}
	
	public void setfirst_name(String fstN)
	{
		//System.out.println("------------------------------------------------------------fstn"+fstN);
		fname.sendKeys(fstN);
		//ldriver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(fstN);
		//System.out.println("-]]]]]]]]]]]]]]]]]]]]]]]]]]");
	}
	
	public void setlast_name(String lstN)
	{
		lname.sendKeys(lstN);
	}
	
	public void set_zip(String pin)
	{
		pinElement.sendKeys(pin);
		
	}
	
	public  void countinueclick()
	{
		countinuElement.click();
	}
	
	public void finishclick()
	{
		finshElement.click();
	}
}
