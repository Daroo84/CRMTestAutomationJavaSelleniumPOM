package crm.utils;

import crm.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class TestUtil extends TestBase {

    public static long PAGE_LOAD_TIMEOUT = 40;
    public static long IMPLICIT_WAIT = 40;

    public  static String TESTDATA_SHEET_PATH = "C:/contacts/crm_contacts.xlsx";

    static Workbook book;
    static Sheet sheet;



    public void switchToFrame(){
        driver.switchTo().frame("mainpanel");


    }
    public static void takeScreenshotAtEndOfTest()throws IOException{
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");
        FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
    }
/*
    public static Object[][] getTestData(String sheetName) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(TESTDATA_SHEET_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
            }
        }
        return data;
    }
*/
    public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
    public static void clickOn(WebDriver driver, WebElement element,int timeout){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement webElement, int seconds){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
        return element;
    }
    public static WebElement waitforElementToBeClickable(WebDriver driver, WebElement webElement, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
        return element;
    }
}
