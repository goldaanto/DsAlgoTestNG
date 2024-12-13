package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pageObject.Homepageobject;

import util.ExcelReader;




public class HomeTestCases extends BaseCases {
	
	private Homepageobject homeObject = null;
	String urlhomestr = null;
	ExcelReader reader = null;
	WebDriver driver = null;
	
	@BeforeClass
	public void setUp() {
		
		reader = new ExcelReader();
		urlhomestr = getUrlHome();
		driver = getDriver();
		//login(driver);
		driver.get(urlhomestr);
		
		homeObject = new Homepageobject(driver);	   
	}

	@Test(priority =1)
	public void VerifyBeforeLoginDSgetStarted() {
		homeObject.dataGetStarted();
	   String text = homeObject.checkLoginError();
	   Assert.assertEquals(text, "You are not logged in");

	}
	
	@Test(priority =2)
	public void VerifyBeforeArraygetStarted() {
		homeObject.arrayGetStarted();
		   String text = homeObject.checkLoginError();
		   Assert.assertEquals(text, "You are not logged in");

		}
	
	@Test(priority =3)
	public void VerifyBeforeLinkedDSgetStarted() {
		homeObject.linkedGetStarted();
		   String text = homeObject.checkLoginError();
		   Assert.assertEquals(text, "You are not logged in");

		}
	@Test(priority =4)
	public void VerifyBeforeStackDSgetStarted() {
		homeObject.stackGetStarted();
		   String text = homeObject.checkLoginError();
		   Assert.assertEquals(text, "You are not logged in");

		}
	@Test(priority =5)
	public void VerifyBeforeQueueDSgetStarted() {
		homeObject.queueGetStarted();
		   String text = homeObject.checkLoginError();
		   Assert.assertEquals(text, "You are not logged in");

		}
	@Test(priority =6)
	public void VerifyBeforeTreeDSgetStarted() {
		homeObject.treeGetStarted();
		   String text = homeObject.checkLoginError();
		   Assert.assertEquals(text, "You are not logged in");

		}
	@Test(priority =7)
	public void VerifyBeforeGraphDSgetStarted() {
		homeObject.graphGetStarted();
		   String text = homeObject.checkLoginError();
		   Assert.assertEquals(text, "You are not logged in");

		}

	@Test(priority = 8)
	public void clickRegisterLink() {
		System.out.println("!!!!!!!!!!!!!!!clickRegisterLinkclickRegisterLinkclickRegisterLinkclickRegisterLink");
		driver.get(urlhomestr);
		System.out.println("driverdriverdriverdriverdriverdriver"+driver);
		homeObject.clickRegister();
		String title = homeObject.getTitle();
		Assert.assertEquals(title, "Registration");
	}
	
	@Test(priority =9)
	public void executeRegister()
	{
		RegisterTestCases regtest = new RegisterTestCases();
		
		try {
			regtest.getRegistered("Sheet1",0, driver);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test(priority = 10)
	public void user_clicks_on_sign_in_link() throws InterruptedException {
		login(driver);
		
	}
	@Test(priority =11)
	public void clicksGetStartedButton() {
		driver.get(urlhomestr);
		homeObject.dataGetStarted();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Data Structures-Introduction");
		
	}	
	
	
	@Test(priority = 12)
	public void checkArrayGetStartedButton() {
		driver.get(urlhomestr);
		homeObject.arrayGetStarted();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Array");
	}

	@Test(priority = 13)
	public void checkLinkedGetStartedButton() {
		driver.get(urlhomestr);
		homeObject.linkedGetStarted();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Linked List");		
	}
	
	@Test(priority = 14)
public void checkStackGetStartedButton() {
		driver.get(urlhomestr);
	homeObject.stackGetStarted();
	String title = driver.getTitle();
	Assert.assertEquals(title, "Stack");
   
}
	@Test(priority = 15)
public void checkQueueGetStartedButton() {
		driver.get(urlhomestr);
		
	homeObject.queueGetStarted();
	String title = homeObject.getTitle();
	Assert.assertEquals(title, "Queue");
}
	
	@Test(priority = 16)	
public void checkTreeGetStartedButton() {
		driver.get(urlhomestr);
	homeObject.treeGetStarted();
	String title = homeObject.getTitle();
	Assert.assertEquals(title, "Tree");
}
	@Test(priority = 17)
public void checkGraphGetStartedButton() {
		driver.get(urlhomestr);
	homeObject.graphGetStarted();
	String title = homeObject.getTitle();
	Assert.assertEquals(title, "Graph");
    
}

	
	
	@AfterClass
public void user_clicks_on_logout_link() {
		driver.get(urlhomestr);
	homeObject.clickLogout();
	
}






}
