package selenium111;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver d= new ChromeDriver();
		d.get("https://vctcpune.com/selenium/practice.html");
		//d.close();
		//d.manage().window().maximize();
		//d.manage().window().minimize();
		d.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hi i am pratiksha");
		d.findElement(By.xpath("//input[@value = 'option1']")).click();
		d.findElement(By.xpath("//input[@value='Radio3']")).click();
		d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pratiksha");
}
}