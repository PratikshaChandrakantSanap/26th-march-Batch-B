package KiteTestPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	//1 data members
	@FindBy(id = "userid")  private WebElement username;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")  private WebElement loginbutton;
	//constructor
	public KiteLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//method
	public void sendUserName()
	{
		username.sendKeys("ELR321");
	}
	public void sendPassword()
	{
	password.sendKeys("Dhana1111");
	}
	public void clickOnLoginButton()
	{
		loginbutton.click();
	}


}
