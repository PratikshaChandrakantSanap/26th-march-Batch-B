package testNG_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_ex1 {
  @Test
  public void KiteLogin() throws InterruptedException {
	  System.setProperty("webdriver.chromedriver", "chromedriver");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  driver.get("https://kite.zerodha.com/");
	  Reporter.log("hi this is pratiksha", true);
	  System.out.println("hi this is printing statement");
	  Reporter.log("hihi");
  }
}
