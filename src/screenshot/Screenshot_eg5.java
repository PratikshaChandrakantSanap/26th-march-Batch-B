package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_eg5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().maximize();
//		driver.navigate().to("https://skpatro.github.io/demo/iframes/");
//		Thread.sleep(1000);
//		driver.navigate().refresh();
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().forward();
//		Thread.sleep(1000);
//		System.out.println(driver.getCurrentUrl());
//	String url = driver.getCurrentUrl();
//		System.out.println(url);
//		String title = driver.getTitle();
//		System.out.println(title);
		
//		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File destination=new File("D:\\ScreenshotBy selenium\\pratiksha.png");
//		FileHandler.copy(source, destination);
		
		//driver.quit();
		//driver.close();
		
		
	}

}
