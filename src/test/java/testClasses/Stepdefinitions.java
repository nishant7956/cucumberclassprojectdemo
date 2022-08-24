package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.LoginPage;
import testUtils.LoginVerification;

public class Stepdefinitions {

	WebDriver driver;
	LoginPage login;
	LoginVerification verify;
	@Given("Initialize browser and driver")
	public void initialize_browser_and_driver() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.sentrifugo.com/");
		Thread.sleep(2000);
	}

	@Given("Login page should be opened and initialized")
	public void login_page_should_be_opened_and_initialized() {
	    // Write code here that turns the phrase above into concrete actions
	    login=new LoginPage(driver);
	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    login.LoginOperations(string, string2);
	}

	  @Then("user should be logged in successfully with {string}")
	    public void user_should_be_logged_in_successfully_with_something(String strArg1) throws Throwable {
	      verify=new LoginVerification(driver);  
		  verify.validate(strArg1);
	    }
	}

