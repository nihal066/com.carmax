package tests;
import org.testng.annotations.Test;
import pages.NihalPage;
import static org.testng.Assert.*;
import utilities.BrowserUtils;

import java.io.IOException;

public class PrivacyPolicyTest2 extends TestBase{
    @Test(priority = 3,groups = "A")
    public void ContactUs() throws IOException {
        NihalPage m= new NihalPage();
        BrowserUtils.scroll(0,100);
        m.privacyPolicy.click();
        BrowserUtils.waitForPageToLoad(1000);
        m.contactUs.click();
        String name="zhot";
        BrowserUtils.takeScreenshot(name);
        assertTrue(driver.getPageSource().contains("take control of your data"));

    }
}
