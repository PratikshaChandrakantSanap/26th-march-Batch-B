package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_eg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/iframes/");
//		Thread.sleep(1000);
//		driver.switchTo().frame("Frame1");
//		Thread.sleep(1000);
//		 String text = driver.findElement(By.xpath("I am inside Frame")).getText();
//		 
//		 System.out.println(text);
//		 thre
		String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
        System.out.println(text);
        Thread.sleep(1000);
//        driver.switchTo().frame(0);//changing focus from main page to frame 0 by using index 
//        String text1 = driver.findElement(By.xpath("//a[text()='Category1']")).getText();
//        System.out.println(text1);
        //Thread.sleep(1000);
        driver.switchTo().frame("Frame1");//changing focus from main page to frame 0 by using name 
        String text2 = driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
        System.out.println(text2);
        Thread.sleep(1000);
        driver.switchTo().parentFrame();//changing focus from iframe to main page
        String text3 = driver.findElement(By.xpath("//a[text()='Pavilion']")).getText();
        System.out.println(text3);
        Thread.sleep(1000);
        driver.switchTo().frame(1);
       String text4 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
       System.out.println(text4);
     // driver.switchTo().frame());
       // String text4 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
      //System.out.println(text4);
	}
	}



