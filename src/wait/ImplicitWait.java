package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.close();
		
		

	}

}
