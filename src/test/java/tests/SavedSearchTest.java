package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageClasses.AfterSign;
import pageClasses.MainPage;
import pageClasses.SearchCar;
import pageClasses.SignIn;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class SavedSearchTest extends TestBase {
	
	
	
	@Test
	public void savedSearch() {
	
		SoftAssert soft = new SoftAssert();
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		MainPage mp = new MainPage();
		mp.profileIcon.click();
		BrowserUtils.waitForClickablility(mp.signIn, 10);
		jsExecutor.executeScript("arguments[0].click();" , mp.signIn);
		SignIn s = new SignIn();
		s.userEmail.sendKeys(ConfigReader.getProperty("email"));
		s.userPassword.sendKeys(ConfigReader.getProperty("password"));
		s.signInButton.click();
		BrowserUtils.waitFor(10);
		
		mp.mainSearchBox.sendKeys(ConfigReader.getProperty("car"),Keys.ENTER);
		SearchCar sc = new SearchCar();
		
		
		try{BrowserUtils.waitForClickablility(sc.keepStoreButton, 10);
		jsExecutor.executeScript("arguments[0].click();", sc.keepStoreButton);}
		catch(Exception e) {}
		
		
		
		sc.zip.click();
		sc.zip.sendKeys(Keys.BACK_SPACE);
		sc.zip.sendKeys("76210");
		sc.savedSearch.click();
		BrowserUtils.waitForClickablility(sc.saveButton, 5);
		sc.saveButton.click();
		String expectedMessage = "Search saved";
		String actualMessage = sc.searchSavedMessage.getText();
		soft.assertTrue(expectedMessage.contains(actualMessage));
		BrowserUtils.waitFor(5);
		sc.gotIt.click();

		Driver.getDriver().get(ConfigReader.getProperty("url"));
		AfterSign as = new AfterSign();
		as.profileIcon.click();
		as.savedSearches.click();
		String car = Driver.getDriver().findElement(By.xpath("//h3[@class='kmx-typography--display-1']")).getText();
		System.out.println(car);
		soft.assertTrue(car.contains(ConfigReader.getProperty("car")));
	
	
	
	}
}
