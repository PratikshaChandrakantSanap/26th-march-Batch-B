package scrolling;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		JavascriptExecutor e = (JavascriptExecutor)driver;
		//e.executeScript("window.scrollBy(90,8000)");
		//e.executeScript("window.scrollBy(80,2000)");
		e.executeScript("window.scrollBy(80,800)");
	}

}
