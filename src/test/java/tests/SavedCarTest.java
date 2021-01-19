package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageClasses.AfterSign;
import pageClasses.MainPage;
import pageClasses.SearchCar;
import pageClasses.SignIn;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class SavedCarTest extends TestBase {

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
		
		mp.mainSearchBox.sendKeys(ConfigReader.getProperty("save_car"),Keys.ENTER);
		SearchCar sc = new SearchCar();
		
		
		try{BrowserUtils.waitForClickablility(sc.keepStoreButton, 10);
		jsExecutor.executeScript("arguments[0].click();", sc.keepStoreButton);}
		catch(Exception e) {}
		
		sc.zip.click();
		sc.zip.sendKeys(Keys.BACK_SPACE);
		sc.zip.sendKeys("76210");
		sc.savedCar.click();
		BrowserUtils.waitFor(4);

		Driver.getDriver().get(ConfigReader.getProperty("url"));
		AfterSign as = new AfterSign();
		as.profileIcon.click();
		as.savedCars.click();
		String car = Driver.getDriver().findElement(By.xpath("//h4[@class='kmx-typography--headline-1']")).getText();
		System.out.println(car);
		soft.assertTrue(car.contains(ConfigReader.getProperty("car")));
	
	
	
	}
}