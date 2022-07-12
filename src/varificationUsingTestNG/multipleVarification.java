package varificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class multipleVarification {
  @Test
  public void mythod() {
	  String a="pune";
	  String b="pune";
	  Assert.assertNotEquals(a,b, " a and b are equal test case is failed");
	  Assert.assertNotEquals(a,"TC is faliled value is null");
	  
  }
}
