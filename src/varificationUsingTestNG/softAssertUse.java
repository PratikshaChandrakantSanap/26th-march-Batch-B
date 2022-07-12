package varificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertUse {
  @Test
  public void mymethod() {
	  String a="abcd";
	  String b="abcd";
	  //to use soft assert we need to create object of SoftAssert class
	  SoftAssert soft=new SoftAssert();//created object of softassert
	  soft.assertNotEquals(a,b, "both are equal test case is failed");
	  soft.assertNull(b, "TC is failed value is not null");
	  
	  soft.assertAll();
	    
  } 
	  @Test
	  public void mymethod2()
	  {
		  SoftAssert s= new SoftAssert();
		boolean a=true;  
		boolean b=false;
		s.assertTrue(b,"TC is passed value is true");
		s.assertFalse(b, "value is false test case is passed");
		s.assertAll();
	  }
	  
  }

