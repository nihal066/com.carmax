package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SignIn {
	
	public SignIn() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	@FindBy (xpath = "//input[@type='email']")
	public WebElement userEmail;
	
	@FindBy (xpath = "//input[@type='password']")
	public WebElement userPassword;
	
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement signInButton;
	
	
	

}
