package testNG_study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TESTNGSTUDY {
  @Test
  public void sample() {
	  Reporter.log("i am method first from class second", true);
  }
  @Test
  public void sample1()
  {
	  Reporter.log("i am method second from class second", true);
  }
  
}
