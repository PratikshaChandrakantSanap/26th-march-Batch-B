package selenium111;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniun_study {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://apps.google.com/meet/");
		driver.close();

	}

}
