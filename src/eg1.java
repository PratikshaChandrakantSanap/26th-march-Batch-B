import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eg1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chromedriver", "chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	List<WebElement> links = driver.findElements(By.tagName("img"));
	System.out.println(links.size());
	Iterator<WebElement> it = links.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next().getText());
	}

	}

}
