package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageAlternateFlow {
	
	
WebDriver ldriver;
	
   public CartPageAlternateFlow (WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements( driver,this);
	}
	
   
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement bikelightaddcart;
   
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement carticon;
	
	
	
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement checkout;
	
	@FindBy(id =  "first-name")      //"//input[@id='first-name']"
	WebElement fname;
	
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement lname;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement pinElement;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement countinuElement;
	
	@FindBy(xpath = "//button[@id='finish']")
	WebElement finshElement;
	
	
	//public void backpack_productclick()
	//{
		//backpack.click();
	//}
	
	public void bikelight_addtocart()
	{
		bikelightaddcart.click();
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
		fname.sendKeys(fstN);
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
