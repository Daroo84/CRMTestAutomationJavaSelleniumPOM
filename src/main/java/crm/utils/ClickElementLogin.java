package crm.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElementLogin {



    public static void clickByXPath(WebDriver ldriver, String lid)

    {

        Actions act = new Actions(ldriver);
        act.moveToElement(ldriver.findElement(By.xpath(lid))).click().build().perform();


    }




}
