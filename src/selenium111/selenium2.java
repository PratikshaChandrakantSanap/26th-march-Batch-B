package selenium111;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/search?q=instagram.cpm&oq=instagram.cpm&aqs=chrome..69i57j0i10i131i433j0i10l2j0i10i433j5i10i44l3.5416j0j7&sourceid=chrome&ie=UTF-8//");

	}

}
