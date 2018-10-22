package crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static crm.base.TestBase.driver;

public class HomePage {


    @FindBy(xpath ="")
    WebElement userNameLabel;

    @FindBy(xpath = "")
    WebElement contactsLink;

    @FindBy(xpath = "")
    WebElement dealsLink;

    @FindBy(xpath = "")
    WebElement tasksLink;

    //Initializing the Page Object


    public HomePage(){
        PageFactory.initElements(driver,this);

    }
    public