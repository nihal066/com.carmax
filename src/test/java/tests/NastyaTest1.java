package tests;

import org.testng.annotations.Test;
import pages.NastyaPage;
import utilities.BrowserUtils;

public class NastyaTest1 extends TestBase {

    @Test
        public void getCarType(){
        NastyaPage n=new NastyaPage();
        BrowserUtils.scroll(0,300);
        n.suvButton.click();
        n.crossover.click();

    }


    }



