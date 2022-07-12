package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable_use {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']"));
	WebElement GetOTPButton = driver.findElement(By.xpath("//button[@type='submit']"));
	System.out.println(GetOTPButton .isEnabled());
	driver.findElement(By.id("mobileNumber")).sendKeys("8308693810");
	Thread.sleep(1000);
	System.out.println(GetOTPButton .isEnabled());
	GetOTPButton.click();
	
	
	

}
}