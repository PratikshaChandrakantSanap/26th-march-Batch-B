package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver");
		WebDriver d=new ChromeDriver();
		d.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(1000);
		d.findElement(By.id("alertBox")).click();
		Thread.sleep(1000);
		Alert alt = d.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(1000);
	d.findElement(By.id("confirmBox")).click();
	Alert alt1 = d.switchTo().alert();
	System.out.println(alt1.getText());
	Thread.sleep(1000);
	alt1.dismiss();
	Thread.sleep(1000);
	
	d.findElement(By.id("promptBox")).click();
	Thread.sleep(1000);
	Alert alt2 = d.switchTo().alert();
	System.out.println(alt2.getText());

	alt2.dismiss();
//	
		
		
		
	}

}
