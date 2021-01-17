package tests;

import org.testng.annotations.Test;
import pages.BurcuPage;
import utilities.BrowserUtils;

import java.io.IOException;

import static utilities.BrowserUtils.getScreenshot;

public class BurcuVerifyProfile extends TestBase{

    @Test(priority = 3,groups = "burcu")
    public void verifyProfile() throws IOException {
        BurcuPage b = new BurcuPage();
        BrowserUtils.waitForPageToLoad(3000);
        b.icon.click();
        actions.moveToElement(b.signin).click().build().perform();
        BrowserUtils.waitForPageToLoad(3000);
        b.eMail.sendKeys("burcu@a.com");
        b.password_a.sendKeys("12345abc");
        b.submitButton.click();
        BrowserUtils.waitForPageToLoad(5000);
        b.icon.click();
        BrowserUtils.waitForPageToLoad(3000);
        actions.moveToElement(b.myprofile).click().build().perform();
        BrowserUtils.waitForPageToLoad(3000);
       String actualUrl=driver.getCurrentUrl();
       String expectedUrl="https://www.carmax.com/mycarmax/profile";




    }
}
