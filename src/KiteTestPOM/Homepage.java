package KiteTestPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//data member
	@FindBy(xpath = "//span[@class='user-id']")  private WebElement username;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutbutton;
//constructor
	public  Homepage(WebDriver Driver)
	{
		PageFactory.initElements(Driver, this);
	}
	//method
	public void validateUserName()
	{
		 String ExpectedUserName="ELR321";
		 String Actualusername = username.getText();
		 if(ExpectedUserName.equals(Actualusername))
		 {
			 System.out.println("EXpected and actual username is maching test case is passed");
		 }
		 else
		 {
			 System.out.println("EXpected and actual username is not maching test case is failed"); 
		 }
		}
	 public void logoutbutton() throws InterruptedException
	 {
		 username.click();
		 Thread.sleep(1000);
		 logoutbutton.click();
		 
		 
	 }
}
