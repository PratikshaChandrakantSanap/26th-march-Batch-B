package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
  @Test
  public void mymethod() {
	  System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
			 
			  //WebDriver driver= new ChromeDriver();
			  WebDriver driver=new FirefoxDriver();
			   driver.manage().window().maximize();
			  driver.get("https://vctcpune.com/selenium/practice.html");
			  driver.close();

  }
}
