package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void mymethod() {
	  String a="Aurangabad";
	  String b="Aurangabad";
	 Assert.assertEquals(a,b, "a and b are not maching test case is failed");
	 Reporter.log("a and b are maching test case is passed", true);
	  
			  
  }
}
