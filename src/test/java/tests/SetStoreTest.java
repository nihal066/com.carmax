package tests;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageClasses.MainPage;
import pageClasses.SignIn;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class SetStoreTest extends TestBase {

	@Test
	public void setStore() {
		
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
		
		mp.store.click();
		mp.storeSearch.sendKeys(ConfigReader.getProperty("zip"),Keys.ENTER);
		BrowserUtils.waitFor(4);
		String search=Driver.getDriver().findElement(By.xpath("//h1[@class='stores-list--title show-tablet-desktop-block kmx-typography--display-3']")).getText();
		assertTrue(search.contains(ConfigReader.getProperty("zip")));
	
	
	
	}
}