package furkan;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageClasses.AfterSign;
import pageClasses.MainPage;
import pageClasses.SignIn;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class SignOutTest extends TestBase {

	@Test
public void signOut() {
		
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		MainPage mp = new MainPage();
		mp.profileIcon.click();
		BrowserUtils.waitForClickablility(mp.signIn, 10);
		jsExecutor.executeScript("arguments[0].click();" , mp.signIn);
		SignIn s = new SignIn();
		s.userEmail.sendKeys(ConfigReader.getProperty("email"));
		s.userPassword.sendKeys(ConfigReader.getProperty("password"));
		s.signInButton.click();
		AfterSign as = new AfterSign();
		BrowserUtils.waitForClickablility(as.profileIcon, 7);
		as.profileIcon.click();
		as.signOut.click();
		BrowserUtils.waitFor(6);
		mp.profileIcon.click();
		List<WebElement>list = Driver.getDriver().findElements(By.xpath("//li[@class='header-footer-menu-list-item']"));
		int expectedSize=3;
		assertTrue(expectedSize==list.size());
	
	
	}

}
