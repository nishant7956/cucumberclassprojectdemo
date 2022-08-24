package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(how =How.ID,using ="username")
	WebElement Username;

	@FindBy(how =How.NAME,using ="password")
	WebElement Password;
	
	@FindBy(id="loginsubmit")
	WebElement btnLogin;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void LoginOperations(String UName, String Passwd)
	{
		Username.sendKeys(UName);
		Password.sendKeys(Passwd);
		btnLogin.click();
	}
}
