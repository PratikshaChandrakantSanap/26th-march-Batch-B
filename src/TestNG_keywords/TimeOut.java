package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
	@Test
	  public void r () {
		  Reporter.log("p is running", true);
	  }
	  @Test(timeOut=1000)
	  public void q() {
		  Reporter.log("q is running", true);
	  }
	  @Test
	  public void p() {
		  Reporter.log("r is running", true);
	  }
}
