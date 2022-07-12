package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		WebElement multiselectedElements = driver.findElement(By.name("cars"));
		Thread.sleep(1000);
		Select s=new Select(multiselectedElements);
		Thread.sleep(1000);
		System.out.println("multi selection status is "+s.isMultiple());
		s.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		
		
		s.selectByValue("audi");
		
		Thread.sleep(1000);
		
		//s.deselectAll();
		s.deselectByIndex(0);
		//s.deselectByValue("audi");
		
		System.out.println(s.getFirstSelectedOption().getText());
	}		

}
