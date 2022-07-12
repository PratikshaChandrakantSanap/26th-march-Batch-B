package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertFalseUse {
  @Test
  public void mymethod() {
	  boolean a= true;
	  boolean b=false;
	  Assert.assertFalse(b,"TC is failed value is true");
	  Reporter.log("TC is passed value is false",true);
  }
}
