package TestNG_keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGgroup {
  @Test
  public void m() {
	Assert.fail();
	  Reporter.log("m is running",true);
  }
  @Test(groups= {"sanity"})
  public void n()
  {
	  Reporter.log("n is running", true);
  }
  @Test(groups= {"sanity"})
  public void o()
  {
	  Reporter.log("o is running", true);
  }
  @Test(groups = {"Regression"})
  public void p()
  {
	  Reporter.log("p is running", true);
  }
  @Test(groups = {"Regression"})
  public void q()
  {
	  Reporter.log("q is running", true);
  }
}
