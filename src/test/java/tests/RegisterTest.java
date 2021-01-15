package furkan;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageClasses.MainPage;
import pageClasses.RegisterPage;

import org.testng.AssertJUnit;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterTest extends TestBase {
	
	
	@Test(dataProvider="dataProvider")
	public void testRegister(String name,String lastName,String email,String password,String confirmPassword) {

		Driver.getDriver().get(ConfigReader.getProperty("url"));
		MainPage mp = new MainPage();
		mp.profileIcon.click();
		BrowserUtils.waitForVisibility(mp.register, 10);
		jsExecutor.executeScript("arguments[0].click();" , mp.register);
		RegisterPage rp = new RegisterPage();
		rp.firstName.sendKeys(name);
		rp.lastname.sendKeys(lastName);
		rp.email.sendKeys(email);
		rp.password.sendKeys(password);
		rp.confirmPassword.sendKeys(confirmPassword);
		rp.registerButton.click();
		String title="Browse used cars and new cars online";
		assertTrue(Driver.getDriver().getTitle().contains(title));
		
			
	}
	
	@DataProvider
	public Object[][] dataProvider(){
		
		return new Object[][] {
			{"John","Doe","jo1@gmail.com","johndoe","johndoe"},
			{"John","Doe","jo1@gmail.com","johndoe1","johndoe"},
			{"","Doe","jo1@gmail.com","johndoe1","johndoe1"},
			{"John","","jo1@gmail.com","johndoe1","johndoe1"},
			{"John","Doe","","johndoe1","johndoe1"},
			{"John","Doe","jo5@gmail.com","johndoe1","johndoe1"}
		};
	}
	
	
	
	
	
}

