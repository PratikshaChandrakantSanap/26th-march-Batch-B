package tableFinding;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableFinding {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		//how to find number of row in a table
		List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
		int total = row.size();
		System.out.println(total);
		System.out.println("+++++++++++");
		//how to get total  number of colum in table
		List<WebElement> cell = driver.findElements(By.xpath("//table//tr//th"));
		
		int Totalc = cell.size();
		System.out.println(Totalc);
		System.out.println("==========");
		//read all table
		List<WebElement> readalltable = driver.findElements(By.xpath("//table//tr"));
	Iterator<WebElement> it = readalltable.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next().getText()+" ");
		System.out.println();
	}
	List<WebElement> readalltable1 = driver.findElements(By.xpath("//table//tr//td"));
	int t = readalltable1.size();
	System.out.println(t);
	
	}

}
