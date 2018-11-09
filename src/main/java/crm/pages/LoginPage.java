package crm.pages;


import crm.base.TestBase;
import crm.utils.ClickElementLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //Object Library
    @FindBy(name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    private final static String LOGIN_PATH="//input[@type='submit']";
    //@FindBy(xpath="//input[@type='submit']")
    //WebElement loginBtn;

    WebElement elementToClick = driver.findElement(By.xpath("//input[@type='submit']"));

    @FindBy(xpath="//img[contains(@class,'img-responsive')]")
    WebElement crmLogo;

    //Initializing the Page Objects
    public LoginPage(){
        PageFactory.initElements(driver,this);

    }
    //Action
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateCRMImage(){
        return crmLogo.isDisplayed();
    }

    public HomePage login(String un, String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        //Click login button
        ClickElementLogin.clickByXPath(driver, LOGIN_PATH);
        //loginBtn.click();

        return new HomePage();



    }

}
