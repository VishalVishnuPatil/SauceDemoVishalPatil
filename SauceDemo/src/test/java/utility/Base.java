package utility;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {

	ReadConfigFile read = new ReadConfigFile();
	protected String global_username = read.getUsername();
	protected String global_password = read.getPassword();
	protected String url = read.getUrl();
	protected String browser = read.getBrowser();
	public static Logger log;

	
	
	protected static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		if(browser.equals("chrome"))
		{	
		//System.setProperty("webdriver.chrome.driver", "C:\Users\VISHAL\eclipse-workspace\SauceDemo\src\test\resources\driver\chromedriver.exe");
                                                       //C:\\\\Users\\\\VISHAL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe
	
		 WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		  log = Logger.getLogger("SauceDemo");
		 PropertyConfigurator.configure("logfile.properties");
		 
		}
		
		if(browser.equals("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\VISHAL\\eclipse-workspace\\SauceDemo\\src\\test\\resources\\driver\\geckodriver.exe");
			
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			 log = Logger.getLogger("SauceDemo");
			 PropertyConfigurator.configure("logfile.properties");
		}
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	@AfterTest
	public void tear()
	{
		driver.quit();
	}
	
	
	     

}
