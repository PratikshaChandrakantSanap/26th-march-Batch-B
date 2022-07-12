package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertTrueUse {
  @Test
  public void mymethod() {
	  boolean a=true;
	  boolean b=false;
	 // Assert.assertTrue(a, "a is true test case is passed");
	  Assert.assertTrue(a,"is false test case is failed");
	 Reporter.log("TC is passed value is true",true);
	 
  }
}
