package tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import pageObject.LoginPageObject;
import pageObject.TryEditorPageObject;

import util.ExcelReader;

public class TryEditorCases {
	
	WebDriver driver = null;
	TryEditorPageObject pageEle = null;
	ExcelReader xcelRead = null;
	final String sheetName = "Sheet1";
	ArrayList<ArrayList> dataList = null;
	ArrayList<Object> data = null;	
	
	public void setUpTryEditor(WebDriver driver) throws IOException {	
		
		pageEle = new TryEditorPageObject(driver);		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		
		
	}	
	
	public void setTextAreaStatement(String value) {
				
//		dataList = xcelRead.getData(SheetName);
//		System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJJ"+dataList.size());
//		
//		data =  (ArrayList) dataList.get(rowNo);
//		System.out.println("datadatadatadatadatadatadatadatadatadatadata"+data.size());
//		
//		
//		String statement = (String) data.get(0);
		
		System.out.println("99999999999999999999999999999999statementstatementstatementstatement"+value);
		
		
		pageEle.setTextAreaValue(value);
		
	}

	

	
	public void clicksRunButton() {
		pageEle.clickRun();
	}
	
	
	
	public void executeTryEditor(WebDriver driver, String Value )
	{
		TryEditorCases tryEditor = new TryEditorCases();
		try {
			tryEditor.setUpTryEditor(driver);
			System.out.println("TRTTTTRRRRRRRRRRRRRRRRRRRRRRRRRR"+Value);
			tryEditor.setTextAreaStatement(Value);
			tryEditor.clicksRunButton();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
