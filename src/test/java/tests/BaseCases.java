package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pageObject.Homepageobject;
import pageObject.LoginPageObject;
import util.ExcelReader;
import java.io.File;
import java.io.IOException;

public class BaseCases {
	
	public static WebDriver driver = null;
	public static WebDriver driver2 = null;
	LoginPageObject loginObject = null;
	public ExcelReader reader = null;
	ExcelReader xcelReader = null;
	private static String urlhomestr = null;
	Homepageobject homeObject = null;
	static String username = null;
	static String password = null;
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("@BeforeSuite@BeforeSuite@BeforeSuite@BeforeSuite@BeforeSuite");
		
//			
			driver = new ChromeDriver();
			driver2 = new ChromeDriver();
//		
		System.out.println("driverdriverdriverdriverdriver"+driver);
		System.out.println("driverdriverdriverdriverdriver"+driver2);
		reader = new ExcelReader();			
		urlhomestr = reader.getProperty("URLHOME");
		username = reader.getProperty("USERNAME");
		password = reader.getProperty("PASSWORD");
	}
	
//	public void setDriver(WebDriver webDriver)
//	{
//		driver = webDriver;
//	}
//	
//	public WebDriver getDriver()
//	{
//		return driver;
//	}
	
	public void login(WebDriver driver)
	{
		
//		reader = new ExcelReader();
//		urlhomestr = reader.getProperty("URLHOME");
		loginObject = new LoginPageObject(driver);
		
		
		driver.get(urlhomestr);
		homeObject  = new Homepageobject(driver);
		
		homeObject.clickSignIn();
		
		loginObject.setUsername(username);
		loginObject.setPassword(password);
		loginObject.clickLogin();
	}
	public String getUrlHome( )
	{
		return urlhomestr;
	}
	
	public void failedTestShot(String methodname)
	{
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// String screenshotBase64 = ((TakesScreenshot) element).getScreenshotAs(OutputType.BASE64);
		
		try {
			FileUtils.copyFile(screenshotFile, new File("C:\\Users\\golda\\eclipse-workspacenew\\DsAlgoTestNgProject\\src\\test\\java\\util\\"+methodname+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("AfterSuiteAfterSuiteAfterSuiteAfterSuiteAfterSuiteAfterSuiteAfterSuite");
		//driver.quit();
	}

}
