package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class asssertNotEquals {
  @Test
  public void mymethod() {
	  int p=1234;
	  int q=1235;
	 Assert.assertNotEquals(p,q, "p and q are maching test case is failed");
	 Reporter.log("a and b  are not maching test case is passed");
  }
}
