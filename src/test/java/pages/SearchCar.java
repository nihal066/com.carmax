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
		
		@FindBy (xpath = "(//button[@aria-label='Save this car'])[1]")
		public WebElement savedCar;
		
		@FindBy (xpath = "//button[@class='kmx-button kmx-button--secondary save-search--link']")
		public WebElement savedSearch;
		
		@FindBy (xpath = "//input[@id='text-field-save-search-name']")
		public WebElement savedSearchInput;
		
		@FindBy (xpath = "//button[@class='save-search-button kmx-button kmx-button--primary']")
		public WebElement saveButton;
		
		@FindBy (xpath = "//button[@class='kmx-button kmx-button--tertiary save-search-success-modal--close']")
		public WebElement gotIt;
		
		@FindBy (xpath = "//h2[@id='save-search-success-modal--header']")
		public WebElement searchSavedMessage;
		
		@FindBy (xpath = "//button[@class='close-accessible-button base-modal--close']")
		public WebElement alert;
		
		@FindBy (xpath = "(//button[@class='kmx-button kmx-button--tertiary kmx-button--flat'])[1]")
		public WebElement keepStoreButton;
		
		
		
		
		
		
		
		
		

}
