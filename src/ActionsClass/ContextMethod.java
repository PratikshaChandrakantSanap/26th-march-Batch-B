package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		// How to right click(contextClick)using actions clas
		Actions act =new Actions(driver);
		WebElement rightbuttonclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Thread.sleep(1000);
		// act.moveToElement(rightClickButton).contextClick().build().perform();
act.contextClick(rightbuttonclick).perform();
act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
//act.sendKeys(Keys.ENTER).perform();
	}
}
