package tests;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.RegisterPageObject;
import util.ExcelReader;

public class RegisterTestCases  {
	
//	WebDriver driver = null;
	RegisterPageObject  pageObject = null;
	ExcelReader xcelRead = null;
	final String sheetName = "Sheet1";
	ArrayList dataList = null;	
	
	
	public RegisterTestCases()
	{
		
	}
	
	public void user_enter(String string, String string2, String string3) {
		
		pageObject.setUserName(string);
		pageObject.setPassword1(string2);
		pageObject.setPassword2(string3);
	   
	}

	
	
	
	public void getRegistered(String sheetName, Integer rowNum,WebDriver driver) throws InterruptedException {
		
		pageObject = new RegisterPageObject(driver);
		xcelRead = new ExcelReader(System.getProperty("user.dir")+"\\TestData\\\\registerdata.xlsx");
		dataList = xcelRead.getData(sheetName);
		
		@SuppressWarnings("unchecked")
		ArrayList<Object> data =  (ArrayList<Object>) dataList.get(rowNum);
		
		String username = (String) data.get(0);
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBB"+username);
		String password = (String) data.get(1);
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBB"+password);
		String cnfPassword = (String) data.get(2);	
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBB"+cnfPassword);
		pageObject.setUserName(username);
		pageObject.setPassword1(password);
		pageObject.setPassword2(cnfPassword);
		pageObject.submitPage();
	}
	
	
	
	
	

}
