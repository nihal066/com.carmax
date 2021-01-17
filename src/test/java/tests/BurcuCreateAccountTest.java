package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BurcuPage;
import utilities.BrowserUtils;

public class BurcuCreateAccountTest extends TestBase {
    @Test(dataProvider = "account",priority = 1,groups = "burcu")
            public void createAccount(String name,String lastname,String email,String password,String password1)  {
        BurcuPage b = new BurcuPage();
        b.icon.click();
        BrowserUtils.waitForPageToLoad(3000);
        actions.moveToElement(b.signin).click().build().perform();
        BrowserUtils.waitForPageToLoad(3000);
        b.createAccaount.click();
        BrowserUtils.waitForPageToLoad(3000);
        b.firstname.sendKeys(name);
        BrowserUtils.waitForPageToLoad(3000);

        b.lastname.sendKeys(lastname);
        BrowserUtils.waitForPageToLoad(3000);

        b.email.sendKeys(email);
        BrowserUtils.waitForPageToLoad(3000);

        b.password.sendKeys(password);
        BrowserUtils.waitForPageToLoad(3000);

        b.password1.sendKeys(password1);
        BrowserUtils.waitForPageToLoad(3000);









    }
    @DataProvider(name="account")
    public Object[][] getAccount(){
        return new Object[][]{
                {"burcu","gozal","burcu@a.com","12345abc","12345abc"},
                {"nihal","ala","nihal@b.com","abcd0123","abcd0123"},
                {"veli","veli","veli@d.com","abcd12mn","abcd12mn"}};
        }
    }



