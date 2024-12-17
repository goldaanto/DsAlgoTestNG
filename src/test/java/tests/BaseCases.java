package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.DataProvider;

import io.qameta.allure.Allure;
import pageObject.Homepageobject;
import pageObject.LoginPageObject;
import util.ExcelReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class BaseCases {
	
	public static WebDriver driver = null;
	
	LoginPageObject loginObject = null;
	public ExcelReader reader = null;
	ExcelReader xcelRead = null;
	private static String urlhomestr = null;
	Homepageobject homeObject = null;
	static String username = null;
	static String password = null;
	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("@BeforeSuite@BeforeSuite@BeforeSuite@BeforeSuite@BeforeSuite");
		driver = new ChromeDriver();
		
		
		System.out.println("driverdriverdriverdriverdriver"+driver);
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
	
	@DataProvider
	public Iterator<Object[]>getTestData()
	{
		xcelRead = new ExcelReader(System.getProperty("user.dir")+"\\TestData\\\\tryeditordata.xlsx");
		ArrayList<Object[]> dataList = xcelRead.getTryEditorValue("Sheet1");
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!Iterator<ArrayList>getTestData"+dataList.size());
		return dataList.iterator();
	}
	
	
	public String failedTestShot(String methodname)
	{
		String filepath = null;
		System.out.println();
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// String screenshotBase64 = ((TakesScreenshot) element).getScreenshotAs(OutputType.BASE64);
		
		try {
			Allure.addAttachment("screenshot", FileUtils.openInputStream(screenshotFile));
			filepath = System.getProperty("user.dir")+"/ScreenShots/"+methodname+".png";
					//"C:\\Users\\golda\\eclipse-workspacenew\\DsAlgoTestNgProject\\src\\test\\java\\util\\"+methodname+".png";
			FileUtils.copyFile(screenshotFile, new File(filepath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return filepath;
	}
	
	
	
	@AfterSuite
	public void tearDown()
	{
		System.out.println("AfterSuiteAfterSuiteAfterSuiteAfterSuiteAfterSuiteAfterSuiteAfterSuite");
		driver.quit();
	}

}
