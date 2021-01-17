package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);  
	}
	
	
	
	@FindBy (xpath = "(//img[@class='icon-tile-img loaded tns-complete'])[1]")
	public WebElement suvsField;
	
	@FindBy (xpath = "//img[@src='/cars/images/brand-logos/honda.png']")
	public WebElement hondaField;
	
	@FindBy (xpath = "//*[@href='/cars/all?price=10000']")
	public WebElement lowPriceField;
	


	
	
	

	
	
	
	
	
	

}
