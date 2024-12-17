package tests;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.DSIntropageobject;
import pageObject.Homepageobject;
import pageObject.LoginPageObject;
import util.ConstantsFile;
import util.ExcelReader;

public class DSIntroTestCases extends BaseCases {
	
	DSIntropageobject DSpageobject = null;	
	LoginPageObject loginObject = null;
	ExcelReader reader = null;
	ExcelReader xcelReader = null;
	String urlhomestr = null;
	Homepageobject homeObject = null;
	
	@BeforeClass
	public void setUp() {	
		
		DSpageobject = new DSIntropageobject(driver);
		homeObject =new Homepageobject(driver);
		login(driver);
	}
	
	public void navigateHome()
	{
		driver.get(getUrlHome());
		homeObject.dataGetStarted();
	}

@Test(priority =1)
public void DSintro() {
	navigateHome();
	String title = DSpageobject.getTitle();
	Assert.assertEquals(ConstantsFile.DATASTRUCTURES, title);
}
@Test(priority =2)
public void TimeComplexityLink() {
	navigateHome();
	DSpageobject.timecomplexity();
	String title = DSpageobject.getTitle();
	Assert.assertEquals(ConstantsFile.TIMECOMPLEX, title);
}
@Test(priority= 3)
public void DSintrotryhere() {
	driver.getCurrentUrl();
    DSpageobject.clickTryHere();
	String title = driver.getTitle();
	Assert.assertEquals(ConstantsFile.ASSESSMENT, title);
}	
@Test(priority = 4, dataProvider = "getTestData")
public void executeImplementationTryHere(String value) {
		
	TryEditorCases tryEditor = new TryEditorCases();
	tryEditor.executeTryEditor(driver, value);	
}
@AfterClass
public void user_clicks_on_logout_link() {
		driver.get(getUrlHome());
		homeObject.clickLogout();
	}
}

