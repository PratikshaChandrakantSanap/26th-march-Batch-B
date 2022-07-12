package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_use {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement checkbox1 = driver.findElement(By.name("checkBoxOption1"));
		//checkbox1.click();
		System.out.println(checkbox1.isSelected());
	
		if(checkbox1.isSelected())
		{
			System.out.println("checkbox1 is already selected");
		}
		else 
		{
			checkbox1.click();
			System.out.println("checkbox 1 is now selected");
		}

	}

}
