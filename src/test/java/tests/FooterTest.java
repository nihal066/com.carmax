package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.BrowserUtils;
import static org.testng.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FooterTest extends TestBase{

    @Test(priority = 1,groups = "A")

    public void footerTest(){
        MainPage m=new MainPage();
        List<String> actualResult=BrowserUtils.getElementsText(m.footerlist);
        List<String> expectedResul=new ArrayList<>(Arrays.asList("Shop","Sell","Finance","About","Careers","More"));
        System.out.println(expectedResul);
        assertEquals(actualResult,expectedResul);

    }

}
