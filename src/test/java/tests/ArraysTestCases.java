package tests;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObject.Arraypageobject;
import pageObject.Homepageobject;
import pageObject.LoginPageObject;
import util.ConstantsFile;
import util.ExcelReader;


public class ArraysTestCases extends BaseCases {
	
	Arraypageobject arrayObject=null;
	LoginPageObject loginObject = null;
	Homepageobject homeObject = null;	
	ExcelReader xcelReader = null;
	

	@BeforeClass
	public void setUp() {
		xcelReader = new ExcelReader(System.getProperty("user.dir")+"\\TestData\\\\ArrayData.xlsx");
		arrayObject = new Arraypageobject(driver);
		homeObject = new Homepageobject(driver);
		login(driver);
	}
	
	
	public void navigateHome()
	{
		
		driver.get(getUrlHome());
		homeObject.arrayGetStarted();
	}
	
	@Test(priority = 1) 
	public void clickArraysInPythonLink() {	
		navigateHome();
		arrayObject.arrayinpython();
		String title = driver.getTitle();
		Assert.assertEquals(title, ConstantsFile.ARRINPYTHON);
	}

	
	@Test (priority = 2) 
	public void clicksSubArraysInPythonLink() {		
		
		arrayObject.clickSubArrayPython();
		
		String title = arrayObject.getTitle();
		Assert.assertEquals(title, ConstantsFile.ARRINPYTHON);	
	}
	
	@Test (priority = 3) 
	public void clicksArraysPhythonTryHereLink() {
		
		arrayObject.clickTryhere();
		String title = arrayObject.getTitle();
		Assert.assertEquals(title, ConstantsFile.ASSESSMENT);
	}
	
	@Test (priority = 4, dataProvider ="getTestData") 
	public void checkArraysPhythonTryHereLink(String value) {		
		
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver, value);
		
	}

	@Test (priority = 5) 
	public void clicksArraysUsingListLink() {
		navigateHome();
		arrayObject.arrayusinglist();
		String title = arrayObject.getTitle();
		Assert.assertEquals(title, ConstantsFile.ARRUSINGLIST);
	}
	
	@Test (priority = 6) 
	public void clicksSubArraysUsingListLink() {		
		arrayObject.arrayusinglist();
//		arrayObject.clickTryhere();
		String title = arrayObject.getTitle();
		Assert.assertEquals(title, ConstantsFile.ARRUSINGLIST);		
	}
	
	@Test (priority = 7) 
	public void clicksArraysUsingTryHereLink() {
		
		arrayObject.clickTryhere();
		String title = arrayObject.getTitle();
		Assert.assertEquals(title, ConstantsFile.ASSESSMENT);
	}
	
	@Test (priority =8, dataProvider = "getTestData") 
	public void checkArraysUsingTryHereLink(String value) {		
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver, value);
		
	}

	@Test (priority = 9) 	
	public void clicksBasicOperationsInListsLink() {	
		navigateHome();
		arrayObject.basicoperations();
		String title = arrayObject.getTitle();
		Assert.assertEquals(title, ConstantsFile.BASICOPERA);

	}
	
	@Test (priority = 10) 
	public void clicksSubBasicOperationsInListsLink() {
		
		arrayObject.clickSubBasicOp();
		String title = arrayObject.getTitle();
		Assert.assertEquals(title, ConstantsFile.BASICOPERA);		
	}

	@Test (priority = 11) 
	public void clicksBasicOperationsTryHereLink() {
		
		//arrayObject.basicoperations();
		arrayObject.clickTryhere();
		String title = arrayObject.getTitle();
		Assert.assertEquals(title, ConstantsFile.ASSESSMENT);
	}
	
	@Test (priority = 12, dataProvider = "getTestData") 
	public void checkBasicOperationsTryHereLink(String Value) {
		
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver, Value);	
		
	}

	@Test (priority =13) 
	public void clicksApplicationsOfArrayLink() {
		navigateHome();
		arrayObject.applicationarray();
		String title = arrayObject.getTitle();
		Assert.assertEquals(title, ConstantsFile.APPLICATIONARRAY);		
	}	

	@Test (priority = 14) 
	public void clicksSubApplicationsOfArrayLink() {
		
		arrayObject.clickSubApplication();
		String title = arrayObject.getTitle();
		Assert.assertEquals(title, ConstantsFile.APPLICATIONARRAY);		
	}
	
	@Test (priority = 15) 
	public void clickApplicationArrayTryHereLink() {
		
		//arrayObject.applicationarray();
		arrayObject.clickTryhere();
		String title = arrayObject.getTitle();
		Assert.assertEquals(title, ConstantsFile.ASSESSMENT);
	}
	
	@Test (priority = 16, dataProvider = "getTestData") 
	public void checkApplicationArrayTryHereLink(String value) {
		
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver, value);
		
	}

	@Test (priority = 17) 
	public void clicksSubPracticeLink() {
		navigateHome();
		arrayObject.arrayinpython();
		arrayObject.clickPracticeLink();
		String title = arrayObject.getTitle();
		Assert.assertEquals(title, ConstantsFile.PRACTICEQUEST);		
	}
	
	@Test (priority = 18) 
	public void VerifySearchArrayLink() {
		
//		arrayObject.arrayinpython();
//		arrayObject.clickPracticeLink();
		arrayObject.clickSearchArray();
		String text = arrayObject.getTitle();
		Assert.assertEquals(text, ConstantsFile.ASSESSMENT);
	}
	
	@Test (priority = 19) 
	public void executeClicksSearchArrayLink() {
//		driver.get(urlhomestr);
//		homeObject.arrayGetStarted();
//		arrayObject.arrayinpython();
//		arrayObject.clickPracticeLink();
//		arrayObject.clickSearchArray();
		ArrayList dataList = xcelReader.getData("SearchArray");
		ArrayList data =  (ArrayList) dataList.get(0);
		System.out.println("read the excel row "+data.size());
		String statement = (String) data.get(0);
		arrayObject.sendcode(statement);
		arrayObject.runbutton();
		//arrayObject.submitbutton();
		
	}
	
	@Test (priority = 20) 
	public void verifyClicksMaxConsecutiveOnesLink() {
		navigateHome();
		arrayObject.arrayinpython();
		arrayObject.clickPracticeLink();		
		arrayObject.clickMax();	
		String text = arrayObject.getTitle();
		Assert.assertEquals(text, ConstantsFile.ASSESSMENT);
	}
	
	
	@Test (priority = 21) 
	public void executeClicksMaxConsecutiveOnesLink() {
//		driver.get(urlhomestr);
//		homeObject.arrayGetStarted();
//		arrayObject.arrayinpython();
//		arrayObject.clickPracticeLink();		
//		arrayObject.clickMax();	
		
		ArrayList dataList = xcelReader.getData("SearchArray");
		ArrayList data =  (ArrayList) dataList.get(0);
		System.out.println("read the excel row "+data.size());
		String statement = (String) data.get(0);
		arrayObject.sendcode(statement);
		arrayObject.runbutton();
	//	arrayObject.submitbutton();
		
	}
	
	@Test (priority = 22) 
	public void verifyClicksFindEvenLink() {
		navigateHome();
		arrayObject.arrayinpython();
		arrayObject.clickPracticeLink();		
		arrayObject.clickFindEven();	
		String text = arrayObject.getTitle();
		Assert.assertEquals(text, ConstantsFile.ASSESSMENT);
	}
	
	@Test (priority = 23) 
	public void executeClicksFindEvenLink() {

		ArrayList dataList = xcelReader.getData("SearchArray");
		ArrayList data =  (ArrayList) dataList.get(0);
		System.out.println("read the excel row "+data.size());
		String statement = (String) data.get(0);
		arrayObject.sendcode(statement);
		arrayObject.runbutton();
	
		
	}

	@Test (priority = 24) 
	public void verifySortedArrayLink() {
		navigateHome();
		arrayObject.arrayinpython();
		arrayObject.clickPracticeLink();		
		arrayObject.clickSquares();	
		String text = arrayObject.getTitle();
		Assert.assertEquals(text, ConstantsFile.ASSESSMENT);
	}
	
	@Test (priority = 25) 
	public void executeClicksSortedArrayLink() {

		ArrayList dataList = xcelReader.getData("SearchArray");
		ArrayList data =  (ArrayList) dataList.get(0);
		System.out.println("read the excel row "+data.size());
		String statement = (String) data.get(0);
		arrayObject.sendcode(statement);
		arrayObject.runbutton();
		
		
	}


	@AfterClass
public void user_clicks_on_logout_link() {
		driver.get(getUrlHome());
		homeObject.clickLogout();
		
}
	
	

}
