package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPageObject {
	
	WebDriver driver = null;
	public LinkedListPageObject(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "/html/body/div[2]/ul[1]/a") WebElement intro_loc;	
	
	@FindBy(xpath = "/html/body/div[2]/ul[2]/a") WebElement createLink_loc;
	@FindBy(xpath= "/html/body/div[2]/ul[3]/a") WebElement type_loc;
	@FindBy(xpath = "/html/body/div[2]/ul[4]/a") WebElement implement_loc;
	@FindBy(xpath= "/html/body/div[2]/ul[5]/a") WebElement traverse_loc;
	@FindBy(xpath = "/html/body/div[2]/ul[6]/a") WebElement insert_loc;
	@FindBy(xpath = "/html/body/div[2]/ul[7]/a") WebElement delete_loc;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/p[3]/strong") WebElement createFlag;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/strong/p") WebElement introflag;
	@FindBy(xpath = "/html/body/div[2]/div[3]/div/div/a") WebElement linkedloc;
	//*[@id="content"]/li[1]/a
	//Sub Linked List Pages Locators
	
	@FindBy(linkText= "Introduction") WebElement intro_intro_loc;
	@FindBy(linkText= "Creating Linked LIst") WebElement intro_create_loc;
	@FindBy(linkText= "Types of Linked List") WebElement intro_type_loc;
	@FindBy(linkText= "Implement Linked List in Python") WebElement intro_implement_loc;
	@FindBy(linkText= "Traversal") WebElement intro_traverse_loc;
	@FindBy(linkText= "Insertion") WebElement intro_insert_loc;
	@FindBy(linkText= "Deletion") WebElement intro_delete_loc;
	
	@FindBy(css= "#content > a") WebElement intro_practise_loc;
	@FindBy(linkText= "Try here>>>") WebElement intro_try_loc;
	
	
	

	
	public void click_Linkedlist()
	{
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM"+linkedloc);
		linkedloc.click();
	}
	public void click_Intro()
	{
		System.out.println("intro_locintro_locintro_locintro_locintro_locintro_loc"+intro_loc);
		intro_loc.click();
		
	}
	public String  getTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	
	public void click_Create()
	{
		createLink_loc.click();
	}
	
	public void click_TypeOf()
	{
		type_loc.click();
	}
	public void click_Implement()
	{
		implement_loc.click();
	}
	public void click_traverse()
	{
		traverse_loc.click();
	}
	public void click_Insert()
	{
		insert_loc.click();
	}
	public void click_Delete()
	{
		delete_loc.click();
	}
	
	//Introduction Linkedlist Action
	
	public void click_Intro_Intro()
	{
		intro_intro_loc.click();
		
	}
	
	public void click_Intro_Create()
	{
		intro_create_loc.click();
	}
	
	public void click_Intro_TypeOf()
	{
		intro_type_loc.click();
	}
	public void click_Intro_Implement()
	{
		intro_implement_loc.click();
	}
	public void click_Intro_traverse()
	{
		intro_traverse_loc.click();
	}
	public void click_Intro_Insert()
	{
		intro_insert_loc.click();
	}
	public void click_Intro_Delete()
	{
		intro_delete_loc.click();
	}
	public void click_Intro_Practice()
	{		
		intro_practise_loc.click();
	}
	public void click_Intro_tryhere()
	{
		intro_try_loc.click();
	}
	
			
}
