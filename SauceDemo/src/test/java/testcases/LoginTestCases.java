package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.Base;
import utility.ExcelUtility;


public class LoginTestCases extends Base {
	
	
	@DataProvider
	Object readData() throws IOException // creating | reading the data and will give the data  to another method 
	{
		String loc ="C:\\Users\\VISHAL\\eclipse-workspace\\SauceDemo\\resources\\LoginDataResource.xlsx";
		ExcelUtility read = new ExcelUtility(loc);
		int rows = read.getRowCount("Sheet1");
		int cols = read.getCellCount("Sheet1", rows);
		
			
	    Object[][] data = new Object[rows][cols];
	    // creating two dim array
		
	    for (int i = 1; i <= rows; i++)
	    {
	    	
			for (int j = 0; j < cols; j++)
			{
				data[i-1][j] = read.getCellData("Sheet1", i, j);
				
			}
		}
	/*  data[0][0]= "standard_user";    data[0][1]= "ThisisnotPassword";   
		
		data[1][0]= "standard_user";    data[1][1]= "1234"; 
		
		data[2][0]= "standard_user";    data[2][1]= "secret_sauce"; 
		
		data[3][0]= "Vishal";    data[3][1]= "ThisisnotPassword";  */
		
		return data;
	}
	
	
	@Test(dataProvider = "readData")
	void verifyUser(String user, String pass)
	{
		
		System.out.println(user);
		System.out.println(pass);
		//System.out.println(driver);
		driver.get("https://www.saucedemo.com/");
		LoginPage login  = new LoginPage(driver);
		login.setUserName(user);
		log.info("enter username"+user);
		
		login.setPassword(pass);
		log.info("enter password"+pass);
		
		login.clickButton();
		log.info("click on login button");
		
	
	}

}

