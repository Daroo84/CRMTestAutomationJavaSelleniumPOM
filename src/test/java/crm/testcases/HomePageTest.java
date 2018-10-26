package crm.testcases;

import crm.base.TestBase;
import crm.pages.HomePage;
import crm.pages.LoginPage;
import crm.utils.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){

        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

    }
    @Test(priority=1)
    public void verifyHomePageTitleTest(){
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle,"CRMPRO","fail");
    }
    @Test(priority=2)
    public void verifyUserNameTest(){
        testUtil.switchToFrame();
        Assert.assertTrue(homePage.verifyCorrectUserName());
    }
    @Test(priority3)
    public void verifyContactsListTest



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
