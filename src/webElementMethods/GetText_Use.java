package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Use {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//h2[text()='Deals of the Day']")).getText();
		//we can execute in three way
		//1
		System.out.println(driver.findElement(By.xpath("//h2[text()='Deals of the Day']")).getText());
		//2
		String text = driver.findElement(By.xpath("//h2[text()='Deals of the Day']")).getText();
		System.out.println(text);
		//3
		WebElement elements = driver.findElement(By.xpath("//h2[text()='Deals of the Day']"));
		System.out.println(elements.getText());
			
	}

}
