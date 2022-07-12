package pop_up;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		String mainPageId = driver.getWindowHandle();
		System.out.println(mainPageId );
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();//to open child brow
		
	Thread.sleep(1000);
		Set<String> AllPageIds = driver.getWindowHandles();//to handle multiple handles
		System.out.println(AllPageIds);
		Iterator<String> it = AllPageIds.iterator();
		Thread.sleep(1000);
		String mainPageId1 = it.next();
		String childpageid = it.next();
		
		//to switch focus to child
		driver.switchTo().window(childpageid);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("s")).sendKeys("selenium");



	}

}
