package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardsActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
	WebElement textbox = driver.findElement(By.id("autocomplete"));
//textbox.sendKeys("hi i am pratiksha");//by using webelements method
	Actions act =new Actions(driver) ;
	act.sendKeys(textbox, "hi hih hihi ").perform();
	//How to handle drop down using Actions Class
	WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
	Thread.sleep(2000);
	act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

}
