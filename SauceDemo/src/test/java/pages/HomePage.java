package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver ldriver;
	
	public HomePage(WebDriver driver)
	{
		ldriver = driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(xpath = "//div[@class='app_logo']")
    WebElement logo;
	
	
	public void verifyhome()
	{
		logo.click();
	}

}
