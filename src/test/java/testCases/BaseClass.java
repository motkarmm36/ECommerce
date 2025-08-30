package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Utilities.ExtentTestListener;

public class BaseClass {
	
	
	public WebDriver driver ;
	
	public Logger logger;
	public Properties p; // property class variable
	ChromeOptions options;
	
	
	@Parameters({"OS","browser"})
	@BeforeClass(groups = {"Functional","Master","UI"})
	public void setUp(String OS , String browser) throws IOException {
		FileReader file = new FileReader(".//src/test/resources/config.Properties");
				p = new Properties();
				p.load(file);

		
		
		if(browser.equals("Chrome")) {
			
			options = new ChromeOptions();
			options.addArguments("--headless=new");
			options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
			options.setExperimentalOption("useAutomationExtension", false);
			options.addArguments("--disable-blink-features=AutomationControlled");

			 driver = new ChromeDriver();
			
		}
		if(browser.equals("Edge")) {
			driver = new EdgeDriver();
		}
	    ExtentTestListener.setDriver(driver);

		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		logger = LogManager.getLogger(this.getClass());

	}
	
	@AfterClass (groups = {"Functional","Master","UI"})
	public void tearDown() {

		driver.quit();
        ExtentTestListener.removeDriver();  // clean up thread-local


	}
	

	    @BeforeMethod
	    public void setup() {
	        ExtentTestListener.setDriver(driver);  
	    }

	   

	    @AfterMethod
	    public void removeDriver() {
	        if (driver != null) {
	            ExtentTestListener.removeDriver(); 
	        }
	    }
	

	
	@SuppressWarnings("deprecation")
	public static String Randomusername() {
		
		return RandomStringUtils.randomAlphabetic(7);
		 
		
	}


}
