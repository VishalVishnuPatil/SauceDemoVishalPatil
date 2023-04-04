package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	WebDriver ldriver;
	
	public  LogoutPage(WebDriver driver)
	{
		ldriver= driver;
		PageFactory.initElements( driver,this);
	}

	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	WebElement menubtn;
	
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")
	WebElement logoutbtn;
	
	public void verify_menu()
	{
		menubtn.click();
	}
	
	public void verify_logout_button_working_properly()
	{
		logoutbtn.click();
	}
}
