package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
			
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/test/drag_drop.html");
				Thread.sleep(1000);
				
				Actions act =new Actions(driver);
				// find source and destination
				WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[3]"));
				WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
				Thread.sleep(2000);
				//act.dragAndDrop(source, destination).perform();
				//act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
   act.dragAndDrop(source, destination).perform();
	}

}
