package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePageObject {
	WebDriver driver = null;
	
	//contructor
	public QueuePageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//locator
	@FindBy(linkText = "Implementation of Queue in Python") WebElement ImplQueue_loc;
	@FindBy(linkText = "Implementation using collections.deque") WebElement ImplDeQue_loc;
	@FindBy(linkText = "Implementation using array") WebElement ImplArray_loc;
	@FindBy(linkText = "Queue Operations") WebElement ImplOperations_loc;
	@FindBy(linkText = "Practice Questions") WebElement ImplPractise_loc;
	@FindBy(linkText = "Try here>>>") WebElement ImplTryHere_loc;
	
	//Action
	
	public void clickQueueLink()
	{
		ImplQueue_loc.click();
	}
	
	public void clickDeQueLink()
	{
		ImplDeQue_loc.click();
	}
	
	public void clickArrayLink()
	{
		ImplArray_loc.click();
	}
	public void clickOperationLink()
	{
		ImplOperations_loc.click();
	}
	public void clickPractiseLink()
	{
		ImplPractise_loc.click();
	}
	
	public void clickTryHereLink()
	{
		ImplTryHere_loc.click();
	}

}
