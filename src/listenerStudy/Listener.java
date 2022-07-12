package listenerStudy;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener {
	 @Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("taken screenshot", true);
	}
	 @Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("test Passed Successful", true);
	}
	 @Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("this test is skipped", true);
	}
	
	

}
