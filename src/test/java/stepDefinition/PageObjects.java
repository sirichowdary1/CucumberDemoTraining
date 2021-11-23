package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	public PageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	WebDriver driver;
	
	@FindBy(name="uid")
	public static WebElement user99GuruName;
	
	@FindBy(name="password")
	public static WebElement password99Guru;

	@FindBy(className="password")
	public static WebElement titleText;
	
	@FindBy(name="btnLogin")
	public static WebElement login;
	 

	
	//Set user name in textbox
//		 public void setUserName(String strUserName){
//		 driver.findElement(user99GuruName).sendKeys(strUserName);
//		 }
//		 //Set password in password textbox
//		 public void setPassword(String strPassword){
//		 driver.findElement(password99Guru).sendKeys(strPassword);
//		 }
//		 //Click on login button
//		 public void clickLogin(){
//		 driver.findElement(login).click();
//		 }
//		 
//		 public void loginToGuru99(String strUserName,String strPasword){
//			 //Fill user name
//			 this.setUserName(strUserName);
//			 //Fill password
//			 this.setPassword(strPasword);
//			 //Click Login button
//			 this.clickLogin(); 
			 }



