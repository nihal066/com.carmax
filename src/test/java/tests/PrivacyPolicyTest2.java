package tests;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import pages.MainPage;
import static org.testng.Assert.*;
import utilities.BrowserUtils;

public class PrivacyPolicyTest2 extends TestBase{
    @Test(priority = 3,groups = "A")
    public void ContactUs(){
        MainPage m= new MainPage();
        BrowserUtils.scroll(0,100);
        m.privacyPolicy.click();
        BrowserUtils.waitForPageToLoad(1000);
        m.contactUs.click();
        assertTrue(driver.getPageSource().contains("take control of your data"));

    }
}
