package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_eg1 {

	
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chromedriver", "chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination=new File("D:\\ScreenshotBy selenium\\myScreenshot.png");
	FileHandler.copy(source, destination);
	///if i cange url and image name same then it will replace immage




	}

	
	}



