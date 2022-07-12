package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Thread.sleep(5000);
		btn.click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(2000);
		Select s =new Select(day);
		s.selectByValue("20");
		Thread.sleep(2000);
		s.selectByVisibleText("10");
		Thread.sleep(2000);
		s.selectByIndex(6);
		 WebElement month = driver.findElement(By.name("birthday_month"));
		 Thread.sleep(2000);
		 Select s1= new Select(month);
		 Thread.sleep(2000);
		 s1.selectByValue("12");
		 Thread.sleep(2000);
		 s1.selectByVisibleText("Jul");
		 Thread.sleep(2000);
		 s1.selectByIndex(10);
		 WebElement year = driver.findElement(By.id("year"));
		 Thread.sleep(2000);
		 Select s2=new Select(year);
		 Thread.sleep(2000);
		 s2.selectByValue("2020");
		 Thread.sleep(2000);
		 s2.selectByIndex(6);
		 Thread.sleep(2000);
		 s2.selectByVisibleText("2022");
		
		

	}

	
}
