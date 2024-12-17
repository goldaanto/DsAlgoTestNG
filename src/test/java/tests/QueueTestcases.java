package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.QueuePageObject;




public class QueueTestcases extends BaseCases{

	
	QueuePageObject queuePageObject = null;

	@BeforeClass
	public void queueSetup() {		
		
		queuePageObject = new QueuePageObject(driver);
		login(driver);	    
	}


	public void navigateHome()
	{
		driver.get(getUrlHome());
		homeObject.queueGetStarted();
	}

	public void clickQueueTryHereLink() {
		queuePageObject.clickTryHereLink();
		String title = driver.getTitle();
		Assert.assertEquals("Assessment", title);
	}

	@Test(priority = 1)
	public void user_clicks_on_implement_queue_link() {
		navigateHome();
		queuePageObject.clickQueueLink();
		String title = driver.getTitle();
		Assert.assertEquals("Implementation of Queue in Python", title);
	}

	@Test(priority = 2)
	public void user_clicks_sub_implement_queue_link() {

		queuePageObject.clickQueueLink();
		String title = driver.getTitle();
		Assert.assertEquals("Implementation of Queue in Python", title);
	}

	@Test(priority =3)
	public void clicksubImplementQueueTryHere()
	{
		this.clickQueueTryHereLink();
	}

	@Test(priority = 4, dataProvider = "getTestData")
	public void executeImpleQueueTryHere(String value)
	{
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver, value);
	}


	@Test(priority = 5)
	public void user_clicks_on_implement_de_que_link() {
		navigateHome();
		queuePageObject.clickDeQueLink(); 
		String title = driver.getTitle();
		Assert.assertEquals("Implementation using collections.deque", title);
	}

	@Test(priority = 6)
	public void user_clicks_sub_implement_de_que_link() {
		queuePageObject.clickDeQueLink(); 
		String title = driver.getTitle();
		Assert.assertEquals("Implementation using collections.deque", title);
	}

	@Test(priority =7)
	public void clicksubImplementDeQueueTryHere()
	{
		this.clickQueueTryHereLink();
	}

	@Test(priority = 8, dataProvider = "getTestData")
	public void executeImpleDeQueueTryHere(String Value)
	{
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver, Value);
	}

	@Test(priority = 9)
	public void user_clicks_on_implement_array_link() {
		navigateHome();
		queuePageObject.clickArrayLink();
		String title = driver.getTitle();
		Assert.assertEquals("Implementation using array", title);
	}
	@Test(priority = 10)
	public void user_clicks_Sub_implement_array_link() {
		queuePageObject.clickArrayLink();
		String title = driver.getTitle();
		Assert.assertEquals("Implementation using array", title);
	}

	@Test(priority =11)
	public void clicksubImplementArrayTryHere()
	{
		this.clickQueueTryHereLink();
	}

	@Test(priority = 12, dataProvider = "getTestData")
	public void executeImpleArrayTryHere(String value)
	{
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver, value);
	}

	@Test(priority = 13)
	public void user_clicks_on_queue_operation_link() {
		navigateHome();
		queuePageObject.clickOperationLink();
		String title = driver.getTitle();
		Assert.assertEquals("Queue Operations", title);
	}	

	@Test(priority = 14)
	public void user_clicks_sub_queue_operation_link() {
		queuePageObject.clickOperationLink();
		String title = driver.getTitle();
		Assert.assertEquals("Queue Operations", title);
	}	


	@Test(priority =15)
	public void clicksubQueueOperationsTryHere()
	{
		this.clickQueueTryHereLink();
	}

	@Test(priority = 16, dataProvider = "getTestData")
	public void executeQueueOperationsTryHere(String value)
	{
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver, value);
	}


	@Test(priority =17)
	public void user_clicks_on_queue_practise_test_link() {
		navigateHome();
		queuePageObject.clickQueueLink();
		queuePageObject.clickPractiseLink();
		String title = driver.getTitle();
		Assert.assertEquals("Practice Questions", title);
	}

	@AfterClass
	public void user_clicks_on_logout_link() {
		driver.get(getUrlHome());
		homeObject.clickLogout();
		
	}

}
