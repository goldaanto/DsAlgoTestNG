package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.Arraypageobject;
import pageObject.Homepageobject;
import pageObject.LinkedListPageObject;
import pageObject.LoginPageObject;
import util.ExcelReader;


public class LinkedListCases extends BaseCases{

	LinkedListPageObject llPageObject = null;	
	WebDriver driver = null;
	LoginPageObject loginObject = null;
	ExcelReader reader = null;
	ExcelReader xcelReader = null;
	String urlhomestr = null;
	Homepageobject homeObject = null;

	@BeforeClass
	public void setUp() {	

		driver = getDriver();
		if(driver == null)
		{
			driver = new ChromeDriver();
			setDriver(driver);
		}
		llPageObject = new LinkedListPageObject(driver);
		homeObject = new Homepageobject(driver);
		login(driver);
	}
	
	
	public void navigateHome()
	{
		driver.get(getUrlHome());
		homeObject.linkedGetStarted();
	}

	@Test(priority = 1)
	public void clicksIntroductionLink() throws InterruptedException {
		navigateHome();		
		llPageObject.click_Intro();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Introduction", title);
	}	
	
	@Test(priority = 2)
	public void clicksSubIntroductionLink() {
		llPageObject.click_Intro_Intro();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Introduction", title);
		
	}
	

	@Test(priority = 3)
	public void clicksSubIntroductionLinkTryHere() {	
		
		llPageObject.click_Intro_tryhere();
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 4)
	public void executeSubIntroductionLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}


	@Test(priority = 5)
	public void clicksCreateLinkedListLink() {
		navigateHome();	
		llPageObject.click_Create();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Creating Linked LIst", title);	   
	}
	
	@Test(priority = 6)
	public void clicksSubCreatingLinkedListLink() {
			
		
		llPageObject.click_Intro_Create();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Creating Linked LIst", title);
	}
	
	@Test(priority = 7)
	public void clicksSubCreatingLinkTryHere() {	
		
		llPageObject.click_Intro_tryhere();
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 8)
	public void executeSubCreatingLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}

	@Test(priority = 9)
	public void clicksTypesLinkedLink() throws InterruptedException {
		navigateHome();
		llPageObject.click_TypeOf();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Types of Linked List", title);
	}
	
	@Test(priority = 10)
	public void clicksSubTypesOfLinkedListLink() {			
		llPageObject.click_Intro_TypeOf();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Types of Linked List", title);
	}

	@Test(priority = 11)
	public void clicksSubTypesOfLinkTryHere() {	
		
		llPageObject.click_Intro_tryhere();
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 12)
	public void executeSubTypesOfLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}

	@Test(priority = 13)
	public void clicksImplementLinkedLink() throws InterruptedException {
		navigateHome();
		llPageObject.click_Implement();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Implement Linked List in Python", title);
	}

	@Test(priority = 14)
	public void user_clicks_on_sub_implement_link() {
			
		
		llPageObject.click_Intro_Implement();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Implement Linked List in Python", title);
	}
	
	@Test(priority = 15)
public void clicksSubImplementLinkTryHere() {	
		
		llPageObject.click_Intro_tryhere();
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 16)
	public void executeSubImplementLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	
	@Test(priority = 17)
	public void clicksTraversalLinkedListLink() throws InterruptedException {
		navigateHome();
		llPageObject.click_traverse();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Traversal", title);

	}
	
	@Test(priority = 18)
	public void user_clicks_on_traverse_sub_linked_list_link() {
				
		//llPageObject.click_Intro();
		llPageObject.click_Intro_traverse();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Traversal", title);
		
	}
	
	@Test(priority = 19)
public void clicksSubTraversalLinkTryHere() {	
		
		llPageObject.click_Intro_tryhere();
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 20)
	public void executeSubTraversalLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}


	@Test(priority = 21)
	public void clicksInsertLinkedListLink() throws InterruptedException {
		navigateHome();
		llPageObject.click_Insert();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Insertion", title);
	}
	
	@Test(priority = 22)
	public void user_clicks_on_sub_insert_linked_list_link() {
				
		//llPageObject.click_Intro();
		llPageObject.click_Intro_Insert();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Insertion", title);
	}
	@Test(priority = 23)
public void clicksSubInsertLinkTryHere() {	
		
		llPageObject.click_Intro_tryhere();
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 24)
	public void executeInsertOfLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}

	@Test(priority =25)
	public void clicksDeleteLinkedListLink() {
		navigateHome();
		llPageObject.click_Delete();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Deletion", title);
	}

	@Test(priority = 26)
	public void user_clicks_on_sub_delete_linked_list_link() {
				
		//llPageObject.click_Intro();
		llPageObject.click_Intro_Delete();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Deletion", title);
	}
	@Test(priority = 27)
public void clicksSubDeleteLinkTryHere() {	
		
		llPageObject.click_Intro_tryhere();
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 28)
	public void executeSubDeleteLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}

	@Test(priority = 29)
	public void user_clicks_on_sub_linked_practice_question_link() {
		navigateHome();
		llPageObject.click_Intro();
		llPageObject.click_Intro_Practice();
		String title = llPageObject.getTitle();
		Assert.assertEquals("Practice Questions", title);


	}		

	@AfterClass
public void user_clicks_on_logout_link() {
		driver.get(getUrlHome());
		homeObject.clickLogout();
		//driver.quit();
}
	

}
