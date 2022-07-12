package KiteTestPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUserName();
		login.sendPassword();
		login.clickOnLoginButton();
		Thread.sleep(2000);
		KitePinPage pin=new KitePinPage(driver);
		pin.sendPin();
		pin.clickoncontinueButton();
		Thread.sleep(2000);
		Homepage homep=new Homepage(driver);
		homep.validateUserName();
		homep.logoutbutton();
		
		
	}

}