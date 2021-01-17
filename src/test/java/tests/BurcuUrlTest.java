package tests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BurcuUrlTest extends TestBase{

    @Test
    public void verifyUrl(){
        String expectedUrl="https://www.carmax.com/";
        String actualUrl= driver.getCurrentUrl();
        assertEquals(actualUrl,expectedUrl);


    }
}
