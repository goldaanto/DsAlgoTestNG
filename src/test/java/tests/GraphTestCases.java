package tests;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.GraphPageObject;
import pageObject.Homepageobject;




public class GraphTestCases extends BaseCases {
	
	WebDriver driver = null;
	GraphPageObject graphPageObject = null;

@BeforeClass
public void graphSetup() {
	
	driver = getDriver();
	graphPageObject = new GraphPageObject(driver);
	homeObject = new Homepageobject(driver);
	login(driver);
	
   
}

public void navigateHome()
{
	driver.get(getUrlHome());
	homeObject.graphGetStarted();
}

@Test(priority = 1)
public void user_clicks_on_graph_link() {
	navigateHome();
	graphPageObject.clickGraphLink();
	String title = driver.getTitle();
	Assert.assertEquals("Graph", title);
	
}

@Test(priority = 2)
public void user_clicks_on_sub_graph_link() {
	
	graphPageObject.clickGraphLink();
	String title = driver.getTitle();
	Assert.assertEquals("Graph", title);
}

@Test(priority = 3)
public void clicksGraphLinkTryHere() {	
	
	graphPageObject.clickTryLink();
	String title = graphPageObject.getTitle();
	Assert.assertEquals("Assessment", title);
}

@Test(priority = 4)
public void executeGraphLinkTryHere() {
		
	TryEditorCases tryEditor = new TryEditorCases();
	tryEditor.executeTryEditor(driver);	
}

@Test(priority = 5)
public void user_clicks_on_graph_represent_link() {
	navigateHome();
	graphPageObject.clickGraphRepLink();
	String title = driver.getTitle();
	Assert.assertEquals("Graph Representations", title);	
}

@Test(priority = 6)
public void user_clicks_on_sub_graph_represent_link() {
	graphPageObject.clickGraphRepLink();
	String title = graphPageObject.getTitle();
	Assert.assertEquals("Graph Representations", title);
}

@Test(priority = 7)
public void clicksGraphRepresentLinkTryHere() {	
	
	graphPageObject.clickTryLink();
	String title = graphPageObject.getTitle();
	Assert.assertEquals("Assessment", title);
}

@Test(priority = 8)
public void executeGraphRepresentLinkTryHere() {
		
	TryEditorCases tryEditor = new TryEditorCases();
	tryEditor.executeTryEditor(driver);	
}

@Test(priority = 9)

public void user_clicks_on_graph_practice_test_link() {
	navigateHome();
	graphPageObject.clickGraphRepLink();
	graphPageObject.clickPracticeLink();
	
	String title = graphPageObject.getTitle();
	Assert.assertEquals("Practice Questions", title);
	
}


@AfterClass
public void user_clicks_on_logout_link() {
	driver.get(getUrlHome());
	homeObject.clickLogout();
	//driver.quit();
}


}
