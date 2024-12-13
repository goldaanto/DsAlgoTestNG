package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageObject {
	
	WebDriver driver = null;
	
	//Constructor
	
	public RegisterPageObject(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//locator
	
	@FindBy(name="username") WebElement username_loc;
	//WebElement username1 = driver.findElement(By.name("username"));
	@FindBy(name="password1") WebElement password1_loc;
	//WebElement password1 = driver.findElement(By.name("password1"));
	@FindBy(name="password2") WebElement password2_loc;
	//WebElement password2 = driver.findElement(By.name("password2"));
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[5]") WebElement submitloc;
	
	//WebElement submitloc = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[5]"));
	
	
	public void setUserName(String name)
	{
		username_loc.sendKeys(name);
	}
	
	public void setPassword1(String password)
	{
		password1_loc.sendKeys(password);
	}
	
	public void setPassword2(String password)
	{
		password2_loc.sendKeys(password);
		
	}
	
	public void submitPage()
	{
		submitloc.submit();
	}

}
