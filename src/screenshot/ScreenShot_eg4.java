package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot_eg4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		String str = RandomString.make(3);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\ScreenshotBy selenium\\.NewScreenshot"+str+".png");
		FileHandler.copy(source, destination);
//		driver.findElement(By.name("email")).sendKeys("8308693810");
//		Thread.sleep(1000);
//		driver.manage().window().minimize();
//		driver.manage().window().maximize();
//		driver.findElement(By.id("pass")).sendKeys("+_@$()");
//		Thread.sleep(1000);
//		driver.findElement(By.name("login")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.name("email")).clear();
//		
		
		String st1r = RandomString.make(2);
//		
		

	}

}
