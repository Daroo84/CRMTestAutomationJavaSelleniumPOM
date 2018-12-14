package crm.testcases;

public class DashboardPageLib extends Base {


    @FindBy(xpath="//img[@src='/front/static/images/logo.png']")
    WebElement samsungBiotDashboardLogo;

    @FindBy(xpath="//span[@class='main-top-nav-alarm error']")
    WebElement numberOfCriticalErrorTab;

    @FindBy(xpath="//span[@class='main-top-nav-alarm warning']")
    WebElement numberOfWarningErrorTab;

    @FindBy(xpath="//span[@class='main-top-nav-user']")
    WebElement userProfileNavigationIcon;

    @FindBy(xpath = "//span[contains(text(),'My Profile')]")
    WebElement myProfilePopUpTitle;

    @FindBy(xpath="//a[contains(text(),'My Profile')]")
    WebElement myProfileLinkInMyProfile;

    @FindBy(xpath="//a[contains(text(),'Sign Out')]")
    WebElement signOutLink;

    @FindBy(xpath="//a[@title='Close']")
    WebElement myProfileCloseButton;

    @FindBy(xpath="//img[@class='btn-drawer-arrow white']")
    WebElement rightHiddenArrowMenu;

    @FindBy(xpath="//a[contains(text(),'Dashboard')]")
    WebElement dashboardTab;

    @FindBy(xpath="//a[contains(text(),'Energy')]")
    WebElement energyTab;

    @FindBy(xpath="//a[contains(text(),'Controls')]")
    WebElement controlsTab;

    @FindBy(xpath="//a[contains(text(),'Service')]")
    WebElement serviceTab;

    @FindBy(xpath="//a[contains(text(),'Spaces')]")
    WebElement spacesTab;

    @FindBy(xpath="//a[contains(text(),'VMS')]")
    WebElement vmsTab;

    @FindBy(xpath="//a[contains(text(),'Accounts')]")
    WebElement accountsTab;

    @FindBy(xpath="//a[contains(text(),'Alarm & Log')]")
    WebElement alarmAndLogTab;

    @FindBy(xpath="//img[@class='Settings']")
    WebElement settingsTab;

    @FindBy(xpath="//a[contains(text(),'Summary')]")
    WebElement summaryInEnergyTab;




    private final static String LOGIN_PATH="//span[@class='main-top-nav-user']";

    //Initializing the Page Objects
    public DashboardPageLib() {
        PageFactory.initElements(driver, this);

    }
    //Action
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }
    public boolean validateBioTImageOnDashboard(){
        return samsungBiotDashboardLogo.isDisplayed();
    }
    public boolean findCriticalErrorTab(){
        return numberOfCriticalErrorTab.isDisplayed();
    }
    public boolean findWarningErrorTab(){
        return numberOfWarningErrorTab.isDisplayed();
    }
    public boolean findProfileNavigationIcon(){
        return userProfileNavigationIcon.isDisplayed();
    }
    public boolean findMyProfileLink(){
        return myProfileLinkInMyProfile.isDisplayed();
    }


    public void clickOnSingOut(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        signOutLink.click();
    }

    public void clickOnProfileIcon(){
        Utils.clickByXpath(driver,LOGIN_PATH);

    }
    public boolean findArrowOnRightSide() {
        return rightHiddenArrowMenu.isDisplayed();
    }

    public boolean findDashboardTab() {
        return dashboardTab.isDisplayed();
    }

    public void clickOnProfile(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        userProfileNavigationIcon.click();
        //wait.until(ExpectedConditions.stalenessOf(element));
        //wait.until(ExpectedConditions.presenceOfElementLocated(addItem)).click();

        /*WebDriverWait wait3 = new WebDriverWait(driver, 10);
        //wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//i[@class='main-top-nav-user-icon']"));
        WebElement ele = driver.findElement(By.xpath("//i[@class='main-top-nav-user-icon']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
        ele.click();

*/

        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(userProfileNavigationIcon));

    }
    public void clickOnEnergyTab(){
        WebElement element = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Energy')]")));
        element.click();


        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        energyTab.click();

        //Utils.clickOn(driver, energyTab, 10);
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(energyTab));
    }
    public void clickOnControlsTab(){
        Utils.waitforElementToBeClickable(driver, settingsTab, 10);
        settingsTab.click();
        Utils.clickOn(driver, settingsTab, 10);
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(controlsTab));
    }
    public void clickOnServiceTab() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(serviceTab));
    }
    public void clickOnSpacesTab() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(spacesTab));
    }
    public void clickOnVmsTab() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(vmsTab));
    }
    public void clickOnAccountsTab() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(accountsTab));
    }
    public void clickOnAlarmAndLog() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(alarmAndLogTab));
    }
    public void clickOnSettingsTab() {
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(settingsTab));
    }
    public void clickOnSummaryInEnergyTab() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        summaryInEnergyTab.click();
        //WebDriverWait wait2 = new WebDriverWait(driver, 10);
        //wait2.until(ExpectedConditions.elementToBeClickable(summaryInEnergyTab));
    }











}