package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable_keyword {
  @Test
  public void mymethod1 () {
	  Reporter.log("method1 is running", true);
  }
  @Test(enabled=false)
  public void mymethod2() {
	  Reporter.log("method2 is running", true);
  }
  @Test
  public void mymethod3() {
	  Reporter.log("method3 is running", true);
  }
}
