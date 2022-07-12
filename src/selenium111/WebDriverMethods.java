package selenium111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		// 1 get use to enter url in browser or to open an application
		driver.get("https://www.google.com/");
		// 2 close use to close current tab of the browser opened by selenioum tool
		//driver.close();
		// 3 quit use to close all tabs present in browser opened by selenium tool
		//driver.quit();
		// 4 maximize/minimize to use maximize and minimize browser
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		// 5. navigate: this method is use to open an application, move forward, backward & refresh the webpage.
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		//driver.navigate().back();
		//driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		//6. getTitle: this method is use to get title of a webpage. return type of getTitle method is String.
		driver.get("https://www.instagram.com/accounts/login/");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println(title);
		//7. getCurrentURL: this method is use to get URL of a webpage. return type of 
		//getCurrentURL method is String
		System.out.println(driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		System.out.println(url);
		

	}

}
