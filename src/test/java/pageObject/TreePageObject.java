package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TreePageObject {

	WebDriver driver = null;
	public TreePageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//locator
	
	@FindBy(linkText = "Overview of Trees") WebElement Overview_loc;
	
	@FindBy(linkText = "Terminologies") WebElement terminologies_loc;
	@FindBy(linkText = "Types of Trees") WebElement types_loc;
	@FindBy(linkText = "Tree Traversals") WebElement traversals_loc;
	@FindBy(linkText = "Traversals-Illustration") WebElement illustration_loc;
	@FindBy(linkText = "Binary Trees") WebElement binary_loc;
	
	@FindBy(linkText = "Types of Binary Trees") WebElement typesBinary_loc;
	@FindBy(linkText = "Implementation in Python") WebElement implPython_loc;
	@FindBy(linkText = "Binary Tree Traversals") WebElement binary_traversals_loc;
	@FindBy(linkText = "Implementation of Binary Trees") WebElement implement_binary_loc;
	@FindBy(linkText = "Applications of Binary trees") WebElement apply_binary_loc;
	@FindBy(linkText = "Binary Search Trees") WebElement binary_search_loc;
	@FindBy(linkText = "Implementation Of BST") WebElement impl_BST_loc;
	@FindBy(linkText= "Practice Questions") WebElement practice_ques_loc;
	
	@FindBy(linkText= "Try here>>>") WebElement try_here_loc;
	
	//Action
	
	public void clickOverviewLink()
	{
		Overview_loc.click();
	}
	
	public String  getTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public void clickTerminologiesLink()
	{
		terminologies_loc.click();
	}
	
	public void clickTypesOfLink()
	{
		types_loc.click();
	}
	
	public void clickTraversalsLink()
	{
		traversals_loc.click();
	}
	
	public void clickIllustrationLink()
	{
		illustration_loc.click();
	}
	
	public void clickBinaryLink()
	{
		binary_loc.click();
	}
	
	public void clickTypesBinaryLink()
	{
		typesBinary_loc.click();
	}
	
	public void clickImplPythonLink()
	{
		implPython_loc.click();
	}
	public void clickBinaryTraversalLink()
	{
		binary_traversals_loc.click();
	}
	
	public void clickImplBinaryLink()
	{
		implement_binary_loc.click();
	}
	
	public void clickApplyBinaryLink()
	{
		apply_binary_loc.click();
	}
	
	public void clickBinarySearchLink()
	{
		binary_search_loc.click();
	}
	
	public void clickImplBSTLink()
	{
		impl_BST_loc.click();
	}
	public void click_practice_quest_Link()
	{
		practice_ques_loc.click();
	}
	public void click_try_here_link()
	{
		try_here_loc.click();
	}
	
	
}
