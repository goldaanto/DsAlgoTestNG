package pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class Arraypageobject {
	//constructor
	Logger logg = (Logger) LogManager.getLogger(Arraypageobject.class);
		WebDriver driver = null;
		public Arraypageobject(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
}

//locators
		
		@FindBy(linkText="Arrays")WebElement dropdown_loc;
		@FindBy(linkText="Arrays in Python")WebElement inpython_loc;	
		@FindBy(linkText="Arrays Using List")WebElement Arraylist_loc;	
		@FindBy(linkText="Basic Operations in Lists")WebElement basicoper_loc;	
		@FindBy(linkText="Applications of Array")WebElement application_loc;	
		
		@FindBy(css="#content > li:nth-child(3) > a") WebElement subinpython_loc;
		@FindBy(css="#content > li:nth-child(4) > a") WebElement subusinglist_loc;
		@FindBy(css="#content > li:nth-child(5) > a") WebElement subbasicop_loc;
		@FindBy(css="#content > li:nth-child(6) > a") WebElement subapplic_loc;
		
		@FindBy(css="#content > a") WebElement practice_loc;
		
		@FindBy(css="body > div.container > div > div.col-sm > a") WebElement tryhere_loc;
		
		
		//locators
		
		@FindBy(linkText="Search the array")WebElement searcharray_loc;
		@FindBy(css="#answer_form > div > div > div.CodeMirror-scroll")WebElement codearea_loc;
		@FindBy(css="#answer_form > button") WebElement run_loc;
		@FindBy(xpath = "#answer_form > input.button")WebElement submit_loc;
		@FindBy(linkText="Max Consecutive Ones")WebElement max_loc;	
		@FindBy(linkText="Find Numbers with Even Number of Digits")WebElement even_loc;	
		@FindBy(xpath="/html/body/div[5]/a")WebElement squares_loc;	
		
						
//Action methods
		
		public void clickPracticeLink()
		{
			practice_loc.click();
			
		}
		public  void clickSearchArray()
		{
			searcharray_loc.click();
		}
		
		public  void sendcode(String Code)
		{
			codearea_loc.sendKeys(Code);
			WebElement codeMirror_loc= driver.findElement(By.className("CodeMirror"));
			WebElement codeLine = codeMirror_loc.findElements(By.className("CodeMirror-line")).get(0);
			codeLine.click();
			WebElement txtArea = codeMirror_loc.findElement(By.cssSelector("textarea"));
			txtArea.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
			txtArea.sendKeys(Code);
			
		}
		
		public void runbutton()
		{
			try {
			run_loc.click();		
			driver.switchTo().alert().accept();
			Assert.assertTrue(true);
			} catch (Exception e) {
				logg.error(e.getMessage());
			}
			
		}
		public void submitbutton()
		{
			submit_loc.click();
		}
		public void clickMax()
		{
			max_loc.click();
		}
		public void clickFindEven()
		{
			even_loc.click();
		}
		public void clickSquares()
		{
			squares_loc.click();
		}
		
		public void clickTryhere()
		{
			this.tryhere_loc.click();
		}
						
//Action methods
		public  void dropdown()
		{
			dropdown_loc.click();
		}
		public void arrayinpython()
		{
			inpython_loc.click();
		}
		public void arrayusinglist()
		{
			Arraylist_loc.click();
		}
		public void basicoperations()
		{
			basicoper_loc.click();
		}
		public void applicationarray()
		{
			application_loc.click();
		}
		//Sub Page
		public void clickSubArrayPython()
		{
			this.subinpython_loc.click();
		}
		public void clickSubArrayIn()
		{
			this.subusinglist_loc.click();
		}
		public void clickSubBasicOp()
		{
			this.subbasicop_loc.click();
		}
		public void clickSubApplication()
		{
			this.subapplic_loc.click();
		}
		public String getTitle()
		{
			String title = driver.getTitle();
			return title;
		}
		}