package crm.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfiedXpath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //comment the above 2 lines and uncomment below 2 lines to use FireFox
        //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();l

        String baseUrl = "https://217.67.221.181:8765/front/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        driver.get(baseUrl);
        actualTitle = driver.getTitle();
    }
}
