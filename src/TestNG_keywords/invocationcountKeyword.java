package TestNG_keywords;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class invocationcountKeyword {
  @Test(invocationCount=3)
  public void f() {
	  Reporter.log("hi",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("hello", true);
  }

}
