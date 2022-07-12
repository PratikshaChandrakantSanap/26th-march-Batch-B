package SerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestClass1 {
  @Test
  public void mymethod1() throws InterruptedException {
	  System.setProperty("webdriver.chromedriver", "chromedriver");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  driver.get("https://www.google.com/");
  }
}
