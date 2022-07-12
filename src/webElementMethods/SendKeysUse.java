package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//sendkeys
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pratiksha");
		Thread.sleep(1000);
		//clear
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
	}

}
