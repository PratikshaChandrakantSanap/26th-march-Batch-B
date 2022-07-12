package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		 WebElement hide = driver.findElement(By.id("hide-textbox"));
		  WebElement show = driver.findElement(By.id("show-textbox"));
		  WebElement textbox = driver.findElement(By.name("show-hide"));
		  System.out.println(textbox.isDisplayed());
		  if(textbox.isDisplayed())
		  {
			  System.out.println("thank is text box is displayed");
		  }
		  else
		  {
			System.out.println("can not find textbox");  
			  }
		  Thread.sleep(1000);
		  hide.click();
		  if(textbox.isDisplayed())
		  {
			  System.out.println("textbox is displaying");
		  }
		  else 
		  {
			  System.out.println("cant find textbox ");
		  }
		
	
		

	}

}
