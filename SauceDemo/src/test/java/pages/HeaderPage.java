package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

	WebDriver ldriver;
	
	public HeaderPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
	WebElement menuElement;
	
	public void Verify_header_section_countain_menubarbutton_clickable()
	{
		menuElement.click();
	}
}
