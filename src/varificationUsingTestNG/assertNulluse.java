package varificationUsingTestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNulluse {
  @Test
  public void mymethod() {
	  String a="pune";
	  String b=null;
//	  Assert.assertNull(b, "TC is failed value is nor null");
//	  Reporter.log("TC is Passed", true);
	  Assert.assertNotNull(b, "value is null TC is failed");
	  Reporter.log("Tc is passed value is notnull", false);
	  Assert.fail();
	  
	  
	 
  }
}