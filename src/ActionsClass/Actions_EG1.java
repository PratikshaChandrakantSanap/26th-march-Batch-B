package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_EG1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		WebElement seleniumbutton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		// How to click using Actions class
		// Create object of Actions class and pass driver object
		Actions act=new Actions(driver);
//		act.moveToElement(seleniumbutton).perform();
//		act.click().perform();
		// act.moveToElement(seleniumButton).click().build().perform();
		//when we use to or more method combine then we use build().perfoem().
		//perform() is compalsary in action class
		Thread.sleep(1000);
		act.click(seleniumbutton).perform();
		
	}

}
