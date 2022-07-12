package SerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestClass2 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chromedriver", "chromedriver");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  driver.get("https://kite.zerodha.com/?next=%2Fmargins");
  }
  }

