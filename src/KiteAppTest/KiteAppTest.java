package KiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteAppTest {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chromedriver","chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://kite.zerodha.com/");
Thread.sleep(1000);
WebElement UID = driver.findElement(By.id("userid"));
UID.sendKeys("ELR321");
WebElement PWD = driver.findElement(By.id("password"));
PWD.sendKeys("Dhana1111");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(1000);
WebElement PIN = driver.findElement(By.id("pin"));
PIN.sendKeys("982278");

driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(1000);
WebElement username = driver.findElement(By.xpath("//span[@class='user-id']"));
String actualusername = username.getText();
String expectedusername = "ELR321";
if(actualusername.equals(expectedusername))
{
System.out.println("userid maching tc is PASSED");	
}
else
{
	System.out.println("userid is not maching tc is fail");
}
username.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@target='_self']")).click();
Thread.sleep(1000);
driver.close();

	}

}
