package pageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SearchCar {
		
		public SearchCar() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
		
		
		@FindBy (id = "zip")
		public WebElement zip;
		
		@FindBy (xpath = "//div[@class='search-bar--form-field radius']")
		public WebElement radius;
		
		@FindBy (xpath = "(//button[@class='save-car'])[2]")
		public WebElement savedCar;
		
		
		
		
		
		
		
		
		
		

}
