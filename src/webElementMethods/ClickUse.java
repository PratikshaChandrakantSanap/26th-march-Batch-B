package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='radio'][2]")).click();
		
	}

}
