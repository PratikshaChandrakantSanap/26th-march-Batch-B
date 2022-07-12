package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe_eg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//b[text()='Selenium']")).click();
		String text = driver.findElement(By.xpath("//h1[text()='Frames Examples in Selenium Webdriver']")).getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
	String t = driver.findElement(By.xpath("//b[text()='Topic :']")).getText();
	System.out.println(t);
	driver.findElement(By.xpath("//input")).sendKeys("pratiksha");
	Thread.sleep(1000);
	
	driver.switchTo().frame("frame3");
	String text1 = driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']")).getText();
	System.out.println(text1);
	driver.findElement(By.id("a")).click();
	
	Thread.sleep(1000);
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("frame2");
	String ttt = driver.findElement(By.xpath("//b[text()='Animals :']")).getText();
	System.out.println(ttt);
	WebElement id = driver.findElement(By.id("animals"));
	Select s=new Select(id);
	s.selectByVisibleText("Baby Cat");
	Thread.sleep(1000);
	s.selectByValue("avatar");
	
	driver.switchTo().parentFrame();
	
	}

}
