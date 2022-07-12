package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation {
  @Test
  public void validateUserID() {
	  Reporter.log("user id validated", true);
	  
  }
  @Test
  public void validateDashboard()
  {
	  Reporter.log("Dashboard Validated", true);
  }
  @BeforeMethod
  public void loginToKiteapp()
  {
	  Reporter.log("login succsses", true);
  }
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("browser Launched", true);
  }
 @AfterMethod
 public void logoutKiteApp()
 {
	 Reporter.log("logging out", true);
 }
 @AfterClass
 public void CloseBrowser()
 {
	 Reporter.log("browser closed", true);
 }
}
