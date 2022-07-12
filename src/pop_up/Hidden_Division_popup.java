package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		d.findElement(By.name("q")).sendKeys("purse");
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@type='submit']")).click();
	}	
}
