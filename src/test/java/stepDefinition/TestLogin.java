package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestLogin {
	
	static  WebDriver driver;
	PageObjects po;
	
	@Given("Navigate to Home Page")
	public void navigate_to_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\L.vardhan\\OneDrive\\Desktop\\NewWS\\FrameWorkDemoTest\\src\\test\\resources\\driver\\chromedriver.exe");	 
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://demo.guru99.com/V4/");
	}

	@When("Enter the username and password and then login")
	public void enter_the_username_and_password_and_then_login() {
	    // Write code here that turns the phrase above into concrete actions
		po=new PageObjects(driver);
	    PageObjects.user99GuruName.sendKeys("mgr123");
	    PageObjects.password99Guru.sendKeys("mgr!23");
	    PageObjects.login.click();
	}

	@Then("Successfully login")
	public void successfully_login() {
		po=new PageObjects(driver);
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Succesfully LoggedIn");
	   driver.quit();
	   
	}


}
