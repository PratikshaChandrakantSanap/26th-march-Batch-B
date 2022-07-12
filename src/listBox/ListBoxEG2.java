package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEG2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement cnp = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Thread.sleep(5000);
		cnp.click();
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s=new Select(day);
		s.selectByValue("15");
		Thread.sleep(5000);
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 =new Select(month);
		s1.selectByVisibleText("Feb");
		Thread.sleep(5000);
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByIndex(2);
		
		
		
		
	}

}
