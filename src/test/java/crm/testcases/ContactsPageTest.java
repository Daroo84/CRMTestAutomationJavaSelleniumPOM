package crm.testcases;

import crm.base.TestBase;
import crm.pages.ContactsPage;
import crm.pages.HomePage;
import crm.pages.LoginPage;
import crm.utils.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactsPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    ContactsPage contactsPage;

    String sheetName = "contacts";

    public ContactsPageTest() {
        super();
    }
    @BeforeMethod
    public void setUp(){

        initialization();
        loginPage = new LoginPage();
        testUtil = new TestUtil();
        contactsPage = new ContactsPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        testUtil.switchToFrame();
        contactsPage = homePage.clickOnContactsLink();

    }
    @Test(priority = 1)
    public void verifyContactsPageLabel(){
        Assert.assertTrue(contactsPage.verifyContactsLabel(),"contacts label is missing on the page");
    }
    @Test(priority = 2)
    public void selectContactsTest(){
        contactsPage.selectContactsByName("test2 test2");
    }
    @Test(priority = 3)
    public void selectMultipleContactsTest(){
        contactsPage.selectContactsByName("test2 test2");
        contactsPage.selectContactsByName("ui uiii");
    }
    @DataProvider
    public Object[][] getCRMTestData(){
        Object data[][] = TestUtil.getTestData(sheetName);
        return data;
    }

    @Test(priority = 4, dataProvider = "getCRMTestData")
    public void validateCreateNewContact(String title, String firstName, String lastName, String company) {
        homePage.clickOnNewContactLink();
        //contactsPage.createNewContact("Mr.", "Tom","Nas", "Google");
        contactsPage.createNewContact(title, firstName, lastName, company);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
        }

    }
