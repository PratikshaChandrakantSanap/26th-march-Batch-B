package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityKeyword {
  @Test(priority=2)
  public void x() {
	  Reporter.log("x is running", true);
  }
  @Test(priority=1)
  public void y()
  {
	  Reporter.log("y is running", true);
  }
  @Test(priority=-1)
  public void z()
  {
	 Reporter.log("z is running", true); 
  }
}
