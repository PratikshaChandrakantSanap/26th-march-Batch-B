package FailedTest;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void f() {
	  Reporter.log("f is running", true);
	  }
	  @Test
	  public void z()
	  {
		Assert.fail();
		  Reporter.log("z is running", true);
	  }
  }

