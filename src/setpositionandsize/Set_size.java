package setpositionandsize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getSize());
		//to set size, need to create object of Dimension class and pass Width and height
		Dimension d=new Dimension(1900,300);
		driver.manage().window().setSize(d);
	}
	}

