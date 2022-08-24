package testUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginVerification {

	@FindBy(xpath="//div[@class='shortcuts']/h1")
	WebElement shortcut;
	
	public LoginVerification(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void validate(String verify) {
		if(shortcut.getText().contains(verify))
		{
			System.out.println("Login successful");
		}
		else
		{
			System.out.println("Login unsucessful");
		}
	}
}
