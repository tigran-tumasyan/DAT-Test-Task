package pages.login;

import base.BasePage;
import pages.member.MemberPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.DriverUtil;

import java.time.Duration;
import java.util.List;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    final String englishIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'english')]";
    final String greekIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'greek')]";
    final String frenchIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'french')]";
    final String italianIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'italian')]";
    final String russianIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'russian')]";
    final String polishIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'polish')]";
    final String chineseIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'chinese')]";
    final String czechIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'czech')]";
    final String deutscheIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'deutsche')]";
    final String spanishIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'spanish')]";
    final String koreanIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'korean')]";
    final String nederlandseIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'nederlandse')]";
    final String austriaIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'austria')]";
    final String switzerlandIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'switzerland')]";
    final String turkeyIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'turkey')]";
    final String hungaryIconXpath = "//div[contains(@class, 'SelectLanguage')]/img[contains(@src, 'hungary')]";



    @FindBy(xpath="//input[@id='customerNumberAndUser']")
    WebElement usernameField;

    @FindBy(xpath="//input[@id='password']")
    WebElement passwordField;

    @FindBy(xpath="//button[@type='submit']")
    WebElement loginButton;

    @FindBy(xpath="//div[contains(@class,'SelectLanguage')]")
    WebElement languagePopUpButton;

    @FindBy(xpath="//button/img[contains(@src, 'english')]")
    WebElement englishButton;

    @FindBy(xpath="//button/img[contains(@src, 'greek')]")
    WebElement greekButton;

    @FindBy(xpath="//button/img[contains(@src, 'french')]")
    WebElement frenchButton;

    @FindBy(xpath="//button/img[contains(@src, 'italian')]")
    WebElement italianButton;

    @FindBy(xpath="//button/img[contains(@src, 'russian')]")
    WebElement russianButton;

    @FindBy(xpath="//button/img[contains(@src, 'polish')]")
    WebElement polishButton;

    @FindBy(xpath="//button/img[contains(@src, 'chinese')]")
    WebElement chineseButton;

    @FindBy(xpath="//button/img[contains(@src, 'czech')]")
    WebElement czechButton;

    @FindBy(xpath="//button/img[contains(@src, 'deutsche')]")
    WebElement deutscheButton;

    @FindBy(xpath="//button/img[contains(@src, 'spanish')]")
    WebElement spanishButton;

    @FindBy(xpath="//button/img[contains(@src, 'korean')]")
    WebElement koreanButton;

    @FindBy(xpath="//button/img[contains(@src, 'nederlandse')]")
    WebElement nederlandseButton;

    @FindBy(xpath="//button/img[contains(@src, 'austria')]")
    WebElement austrianButton;

    @FindBy(xpath="//button/img[contains(@src, 'switzerland')]")
    List<WebElement> schweizerischButton;

    @FindBy(xpath="//button/img[contains(@src, 'turkey')]")
    WebElement turkishButton;

    @FindBy(xpath="//button/img[contains(@src, 'hungary')]")
    WebElement hungarianButton;

    @FindBy(xpath="//input[@id='customerNumberAndUser']//parent::div//label/span")
    WebElement usernameFieldText;

    @FindBy(xpath="//input[@id='password']//parent::div//label/span")
    WebElement passwordFieldText;

    @FindBy(xpath="//form[contains(@class, 'FormStyled')]/span")
    WebElement loginText;

    @FindBy(xpath="//button//img[contains(@src, 'english')]//parent::button//parent::div//parent::div//parent::div/div/h4")
    WebElement selectALanguageText;

    @FindBy(xpath="//button[@id='onesignal-slidedown-cancel-button']")
    WebElement notificationBarLaterButton;

    @FindBy(xpath="//span[contains(@class, 'ErrorText')]")
    WebElement authorizationFailedErrorMessage;


    public void openLanguageWindow(){
        languagePopUpButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), "//button/img[contains(@src, 'english')]");
        try{
                Thread.sleep(5000);
            }
        catch(InterruptedException e){
        }

    }

    public void selectEnglishLanguage(){
        languagePopUpButton.click();
        englishButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), englishIconXpath);

    }

    public void selectGreekLanguage(){
        greekButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), greekIconXpath);
    }

    public void selectFrenchLanguage(){
        frenchButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), frenchIconXpath);
    }

    public void selectItalianLanguage(){
        italianButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), italianIconXpath);
    }

    public void selectRussianLanguage(){
        russianButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), russianIconXpath);
    }

    public void selectPolishLanguage(){
        polishButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), polishIconXpath);
    }

    public void selectChineseLanguage(){
        chineseButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), chineseIconXpath);
    }

    public void selectCzechLanguage(){
        czechButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), czechIconXpath);
    }

    public void selectDeutscheLanguage(){
        deutscheButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), deutscheIconXpath);
    }

    public void selectSpanishLanguage(){
        spanishButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), spanishIconXpath);
    }

    public void selectKoreanLanguage(){
        koreanButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), koreanIconXpath);
    }

    public void selectDutchLanguage(){
        nederlandseButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), nederlandseIconXpath);
    }

    public void selectAustrianLanguage(){
        austrianButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), austriaIconXpath);
    }

    public void selectSchweizerischLanguage(){
        schweizerischButton.get(0).click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), switzerlandIconXpath);
    }

    public void selectTurkishLanguage(){
        turkishButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), turkeyIconXpath);
    }

    public void selectHungarianLanguage(){
        hungarianButton.click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), hungaryIconXpath);
    }

    public String authorizationErrorText(){
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
        }

        return authorizationFailedErrorMessage.getText();
    }

    public String loginText(){
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
        }

        return loginText.getText();
    }

    public String usernameFieldText(){
        return usernameFieldText.getText();
    }

    public String passwordFieldText(){
        return passwordFieldText.getText();
    }

    public String logInButtonText(){
        return loginButton.getText();
    }

    public String selectALanguageText(){
        return selectALanguageText.getText();
    }

    public void enterUsername(String correctUsername) {
        usernameField.clear();
        usernameField.sendKeys(correctUsername);
    }

    public void enterPassword(String correctPassword) {
        passwordField.clear();
        passwordField.sendKeys(correctPassword);
    }


    public MemberPage clickOnLoginButton() {
        loginButton.click();
        return new MemberPage(driver);
    }

    public void chooseLaterForNotifications(){
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), "//button[@id='onesignal-slidedown-cancel-button']");
        notificationBarLaterButton.click();
    }


}
