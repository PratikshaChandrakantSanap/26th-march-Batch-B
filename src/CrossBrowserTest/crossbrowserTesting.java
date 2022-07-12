package CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowserTesting {
	@Parameters("browserName")
  @Test
  public void mymethod(String Name) throws InterruptedException {
		WebDriver driver = null;
		if(Name.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
			  driver=new FirefoxDriver();
			 
		}else if(Name.equals("chrome"))
				{
			System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
			 driver=new ChromeDriver();
				}
		driver.manage().window().maximize();
		  driver.get("https://vctcpune.com/selenium/practice.html");
		  Thread.sleep(1000);
		  driver.close();

	  
  }
}
