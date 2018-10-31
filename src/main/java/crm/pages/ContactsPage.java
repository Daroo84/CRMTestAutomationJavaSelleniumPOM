package crm.pages;

import crm.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends TestBase {

    @FindBy(xpath = "//td[contains(text(),'Contacts')]")
    WebElement contactsLabel;

    public ContactsPage(){
        PageFactory.initElements(driver, this);

    }
    public boolean verifyContactsLabel(){
        return contactsLabel.isDisplayed();
    }
    public void selectContactsByName(String)


}
