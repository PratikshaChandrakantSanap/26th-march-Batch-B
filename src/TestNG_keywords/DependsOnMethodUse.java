package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
	@Test
	  public void  d() {
		  Reporter.log("d is running", true);
	  }
	  @Test
	  public void b() {
		  Reporter.log("b is running", true);
	  }
	  @Test(dependsOnMethods= {"b"})
	  public void a() {
		  Reporter.log("a is running", true);
	  }
	  @Test
	  public void c() {
		  Reporter.log("c is running", true);
	  }
}
