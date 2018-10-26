package crm.utils;

import static crm.base.TestBase.driver;

public class TestUtil {

    public static long PAGE_LOAD_TIMEOUT = 40;
    public static long IMPLICIT_WAIT = 40;


    public void switchToFrame(){
        driver.switchTo().frame("mainpanel");

    }
}
