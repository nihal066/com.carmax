package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class RegisterPage {
	
	public RegisterPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	@FindBy (name = "firstname")
	public WebElement firstName;
	
	@FindBy (name = "lastname")
	public WebElement lastname;
	
	@FindBy (name = "email")
	public WebElement email;
	
	@FindBy (name = "password")
	public WebElement password;
	
	@FindBy (name = "retypepassword")
	public WebElement confirmPassword;
	
	@FindBy (xpath = "//input[@type='Submit']")
	public WebElement registerButton;
	
	
	
	
	
	
	

}
