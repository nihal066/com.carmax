package furkan;

import static org.testng.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageClasses.AfterSign;
import pageClasses.MainPage;
import pageClasses.RegisterPage;
import pageClasses.SignIn;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class SignInTest extends TestBase {
	
	@Test(dataProvider="dataProvider1")
	public void negativeSignIn(String email,String password) {

		Driver.getDriver().get(ConfigReader.getProperty("url"));
		MainPage mp = new MainPage();
		mp.profileIcon.click();
		BrowserUtils.waitForClickablility(mp.signIn, 10);
		jsExecutor.executeScript("arguments[0].click();" , mp.signIn);
		SignIn s = new SignIn();
		s.userEmail.sendKeys(email);
		s.userPassword.sendKeys(password);
		s.signInButton.click();
		BrowserUtils.waitForPageToLoad(10);
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		AfterSign as = new AfterSign();
		as.profileIcon.click();
		List<WebElement>list = Driver.getDriver().findElements(By.xpath("//li[@class='header-footer-menu-list-item']"));
		int expectedNum=3;
		assertTrue(expectedNum==list.size());
	}
	@Test
	public void positiveSignIn() {
		
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
		AfterSign as = new AfterSign();
		as.profileIcon.click();
		as.myProfile.click();
		WebElement customer=Driver.getDriver().findElement(By.xpath("//h4[@class='kmx-typography--headline-1']"));
		assertTrue(customer.getText().contains(ConfigReader.getProperty("name")));
	}
	
	@DataProvider
	public Object[][] dataProvider1(){
		
		return new Object[][] {
			{"jo3@gmail.com","johndoe"},{"","johndoe1"},{"jo3@gmail.com",""},{"joj@gmail.com","johndoe1"}	
		};

	}
}
