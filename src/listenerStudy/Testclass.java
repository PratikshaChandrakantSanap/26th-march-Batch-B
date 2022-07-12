package listenerStudy;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners( listenerStudy.Listener.class)
public class Testclass {
  @Test
  public void mymethod1() 
  {
	  Reporter.log("mymethod1 is running", true);
  }
  @Test
  public void mymethod2() 
  {  
	  Assert.fail();
	  Reporter.log("mymethod2 is running", true);
	 
  }
  @Test
  public void mymethod3() 
  {
	  Reporter.log("mymethod3 is running", true);
  } 
  @Test(dependsOnMethods = {"mymethod2"})
  public void mymethod4() 
  {
	  Reporter.log("mymethod4 is running", true);
  }
}
