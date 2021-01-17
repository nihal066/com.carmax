package tests;

import org.testng.annotations.Test;
import pages.BurcuPage;
import utilities.BrowserUtils;

public class BurcuSigninTest2 extends TestBase {

    @Test(priority = 2,groups = "burcu")
    public void signin2(){
        BurcuPage b=new BurcuPage();
        b.icon.click();
        actions.moveToElement(b.signin).click().build().perform();
        BrowserUtils.waitForPageToLoad(3000);
        b.eMail.sendKeys("burcu@a.com");
        b.password_a.sendKeys("12345abc");
        b.submitButton.click();

    }
}
