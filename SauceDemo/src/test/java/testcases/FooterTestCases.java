package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.Base;
import utility.ExcelUtility;

public class FooterTestCases extends Base{
	
	
	@DataProvider
	Object readDataFooter() throws IOException // creating | reading the data and will give the data  to another method 
	{
		String loc ="C:\\Users\\VISHAL\\eclipse-workspace\\SauceDemo\\resources\\LoginDataResource.xlsx";
		ExcelUtility read = new ExcelUtility(loc);
		int rows = read.getRowCount("footer");
		int cols = read.getCellCount("footer", rows);
		
			
	    Object[][] data = new Object[rows][cols];
	    // creating two dim array
		
	    for (int i = 1; i <= rows; i++)
	    {
	    	
			for (int j = 0; j < cols; j++)
			{
				data[i-1][j] = read.getCellData("footer", i, j);
				
			}
		}
		return data;
	}
	
	
	
	
	@Test(dataProvider = "readDataFooter")
	
	void verifyFooter(String xpath) throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
		LoginPage login  = new LoginPage(driver);
		login.setUserName("standard_user");
		log.info("enter username"+global_username);
		login.setPassword("secret_sauce");
		log.info("enter password"+global_password);
		login.clickButton();
		log.info("click on login button");
		
		
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		//Thread.sleep(6000);
		driver.findElement(By.xpath(xpath)).click();
		log.info("Clicking and opening Footer Section present social media account icon via excelsheet xpath"+xpath);
		System.out.println("---------------------------------------------------");
        
		
		String nameofWindowString  = driver.getWindowHandle();
		System.out.println(nameofWindowString);
		System.out.println(driver.switchTo().window(nameofWindowString).getTitle());
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		//Thread.sleep(6000);
		// verify the  titke of opening page 
		// we use driver. switch ... get title
	}
	
	
	
	
	
	
	
	

}
