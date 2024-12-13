package retry;

import org.testng.ITestListener;
import org.testng.ITestResult;

import tests.BaseCases;

public class ScreeShotListener extends BaseCases implements ITestListener {
	
	@Override
	  public void onTestFailure(ITestResult tr) {
		failedTestShot(tr.getMethod().getMethodName());
	  }

	  @Override
	  public void onTestSkipped(ITestResult tr) {
	    
	  }

	  @Override
	  public void onTestSuccess(ITestResult tr) {
	   
	  }
	  
	  

}
