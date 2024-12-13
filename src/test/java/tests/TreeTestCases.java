package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.TreePageObject;



public class TreeTestCases extends BaseCases {
	WebDriver driver = null;
	TreePageObject treePageObject = null;

	@BeforeClass
	public void treeSetup() {
		driver = getDriver();
		treePageObject = new TreePageObject(driver);	
		login(driver);
	}

	
	public void navigateHome()
	{
		driver.get(getUrlHome());
		homeObject.treeGetStarted();
	}
	
	@Test(priority = 1)
	public void user_clicks_on_tree_overview_link() {
		navigateHome();
		treePageObject.clickOverviewLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Overview of Trees", title);
	}
	
	@Test(priority = 2)
	public void user_clicks_sub_tree_overview_link() {
		
		treePageObject.clickOverviewLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Overview of Trees", title);
	}
	
	@Test(priority = 3)
	public void clicksTreeOverviewLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 4)
	public void executeTreeOverviewLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	

	@Test(priority = 5)
	public void user_clicks_on_terminologies_link() {
		navigateHome();
		treePageObject.clickTerminologiesLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Terminologies", title);
	}

	@Test(priority = 6)
	public void user_clicks_sub_terminologies_link() {
		
		treePageObject.clickTerminologiesLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Terminologies", title);
	}
	
	@Test(priority = 7)
	public void clicksTreeTerminologyLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 8)
	public void executeTreeTerminologyLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	
	@Test(priority = 9)
	public void user_clicks_on_types_trees_link() {
		navigateHome();
		treePageObject.clickTypesOfLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Types of Trees", title);
	}

	@Test(priority = 10)
	public void user_clicks_sub_types_trees_link() {
		treePageObject.clickTypesOfLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Types of Trees", title);
	}

	@Test(priority =11)
	public void clicksTreeTypesOfLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority =12)
	public void executeTreeTypesOfLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	
	@Test(priority =13)
	public void user_clicks_on_traversals_link() {
		navigateHome();
		treePageObject.clickTraversalsLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Tree Traversals", title);
	}
	@Test(priority =14)
	public void user_clicks_sub_traversals_link() {
		treePageObject.clickTraversalsLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Tree Traversals", title);
	}
	@Test(priority = 15)
	public void clicksTreeTraversalLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 16)
	public void executeTreeTraversalLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	
	
	@Test(priority = 17)
	public void user_clicks_on_illustration_link() {
		navigateHome();
		treePageObject.clickIllustrationLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Traversals-Illustration", title);

	}
	@Test(priority =18)
	public void user_clicks_sub_illustration_link() {
		treePageObject.clickIllustrationLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Traversals-Illustration", title);

	}

	@Test(priority =19)
	public void clicksTreeIllustrationLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority =20)
	public void executeTreeIllustrationLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	
	@Test(priority =21)
	public void user_clicks_on_binary_tree_link() {
		navigateHome();
		treePageObject.clickBinaryLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Binary Trees", title);
	}
	@Test(priority = 22)
	public void user_clicks_sub_binary_tree_link() {
		treePageObject.clickBinaryLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Binary Trees", title);
	}


	@Test(priority =23)
	public void clicksTreeBinaryTreeLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 24)
	public void executeTreeBinaryTreeLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	
	
	

	@Test(priority =25)
	public void user_clicks_on_types_binary_link() {
		navigateHome();
		treePageObject.clickTypesBinaryLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Types of Binary Trees", title);
	}
	
	@Test(priority =26)
	public void user_clicks_sub_types_binary_link() {
		treePageObject.clickTypesBinaryLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Types of Binary Trees", title);
	}

	@Test(priority =27)
	public void clicksTreeTypesBinaryLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority =28)
	public void executeTreeTypesBinaryLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	
	@Test(priority =29)
	public void user_clicks_on_impl_python_link() {
		navigateHome();
		treePageObject.clickImplPythonLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Implementation in Python", title);

	}
	
	@Test(priority =30)
	public void user_clicks_sub_impl_python_link() {
		treePageObject.clickImplPythonLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Implementation in Python", title);

	}

	@Test(priority =31)
	public void clicksTreeImplPythonLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 32)
	public void executeTreeImplPythonLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	
	
	

	@Test(priority =33)
	public void user_clicks_on_binary_traversals_link() {
		navigateHome();
		treePageObject.clickBinaryTraversalLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Binary Tree Traversals", title);

	}
	
	@Test(priority = 34)
	public void user_clicks_sub_binary_traversals_link() {
		treePageObject.clickBinaryTraversalLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Binary Tree Traversals", title);

	}

	@Test(priority =35)
	public void clicksTreeBinaryTraversalLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority =36)
	public void executeTreeBinaryTraversalLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	
	
	

	@Test(priority =37)
	public void user_clicks_on_impl_binary_trees_link() {
		navigateHome();
		treePageObject.clickImplBinaryLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Implementation of Binary Trees", title);

	}
	@Test(priority = 38)
	public void user_clicks_sub_impl_binary_trees_link() {
		treePageObject.clickImplBinaryLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Implementation of Binary Trees", title);

	}

	@Test(priority =39)
	public void clicksTreeImplBinaryLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 40)
	public void executeTreeImplBinaryLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	
	
	
	

	@Test(priority = 41)
	public void user_clicks_on_appl_binary_tree_link() {
		navigateHome();
		treePageObject.clickApplyBinaryLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Applications of Binary trees", title);

	}
	
	@Test(priority = 42)
	public void user_clicks_sub_appl_binary_tree_link() {
		treePageObject.clickApplyBinaryLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Applications of Binary trees", title);

	}

	@Test(priority = 43)
	public void clicksTreeApplBinaryLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority =44)
	public void executeTreeTreeApplBinaryLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	
	
	

	@Test(priority = 45)
	public void user_clicks_on_binary_search_link() {
		navigateHome();
		treePageObject.clickBinarySearchLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Binary Search Trees", title);
	}
	
	@Test(priority = 46)
	public void user_clicks_sub_binary_search_link() {
		treePageObject.clickBinarySearchLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Binary Search Trees", title);
	}

	@Test(priority =47)
	public void clicksTreeBinarySearchLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 48)
	public void executeTreeBinarySearchLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}
	
	
	

	@Test(priority = 49)
	public void user_clicks_on_impl_binary_search_link() {
		navigateHome();
		treePageObject.clickImplBSTLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Implementation Of BST", title);
	}
	
	@Test(priority =50)
	public void user_clicks_sub_impl_binary_search_link() {
		treePageObject.clickImplBSTLink();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Implementation Of BST", title);
	}

	@Test(priority = 51)
	public void clicksTreeimplBinSearchLinkTryHere() {	
		
		treePageObject.click_try_here_link();
		String title = treePageObject.getTitle();
		Assert.assertEquals("Assessment", title);
	}
	
	@Test(priority = 52)
	public void executeTreeimplBinSearchLinkTryHere() {
			
		TryEditorCases tryEditor = new TryEditorCases();
		tryEditor.executeTryEditor(driver);	
	}	

	
	@Test(priority = 53)
	
	public void user_clicks_on_tree_practice_questions_link() {
		navigateHome();
		treePageObject.clickImplPythonLink();
		treePageObject.click_practice_quest_Link();
		String title = driver.getTitle();
		Assert.assertEquals("Practice Questions", title);
	}

	
	
	
	@AfterClass
	public void user_clicks_on_logout_link() {
		driver.get(getUrlHome());
		homeObject.clickLogout();
		//driver.quit();
	}




	


}
