package tests;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import pageObject.Homepageobject;
import pageObject.LoginPageObject;

import util.ExcelReader;



public class LoginTesCases extends BaseCases {
	LoginPageObject pageObject = null;
	ExcelReader reader = null;
	Homepageobject homeObject = null;
	String urlhomestr = null;
	

	@BeforeClass
	public void setUp()
	{
		System.out.println("InsideLogin InsideLoginInsideLoginInsideLogin");
		
		
		
		System.out.println("driver in LoginTestcases"+ driver);
		
		pageObject = new LoginPageObject(driver);
		//driver.get("https://dsportalapp.herokuapp.com/login");
		homeObject = new Homepageobject(driver);
		reader = new ExcelReader(System.getProperty("user.dir")+"\\TestData\\\\logindata.xlsx");
		urlhomestr = reader.getProperty("URLHOME");
	}

	@Test (priority = 1)
	public void checkEmptyUsername()
	{

	driver.get(urlhomestr);
	

	homeObject.clickSignIn();
	
	String[] data = reader.getUserPassword("Sheet1",1);
	
	try
	{
		
		pageObject.setUsername(data[0]);
		pageObject.clickLogin();
		String str = driver.switchTo().activeElement().getAttribute("validationMessage");
		Assert.assertEquals(str, "Please fill out this field.");


	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}

	}

		@Test(priority=2)
		public void clickRegisterLink()
		{
			pageObject.clickRegisterLink();
			Assert.assertEquals(driver.getTitle(), "Registration");
	
		}
	
	@DataProvider
	public Iterator<Object[]>getTestUserData()
	{
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!Iterator<ArrayList>getTestData");
		ArrayList<Object[]> dataList = reader.getProviderUserData("Sheet1");
		System.out.println("7777777777777777777777777777"+dataList.iterator());
		
		return dataList.iterator();
	}

	
	
	@Test(priority=3, dataProvider ="getTestUserData")
	public void checkInvalidUsernamePassword(String username,String pass) throws InterruptedException {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!checkInvalidUsernamePassword"+ username+pass);
		pageObject.setUsername(username);
		pageObject.setPassword(pass);
		pageObject.clickLogin();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Login");
	}

	@Test(priority=4)
	public void checkCorrectUsernamePassword() throws InterruptedException {

		String[] data = reader.getUserPassword("Sheet1",0);
		pageObject.setUsername(data[0]);
		pageObject.setPassword(data[1]);
		pageObject.clickLogin();

	}

	


}






























