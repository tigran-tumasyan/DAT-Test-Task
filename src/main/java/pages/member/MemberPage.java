package pages.member;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.DriverUtil;

import java.time.Duration;
import java.util.List;

public class MemberPage extends BasePage {
    public MemberPage(WebDriver driver) {
        super(driver);
    }

    final String headerElementXpath = "//header/div[contains(@class, 'styles__Container')]";
    final String itemListXpath = "//div[@data-test-id='virtuoso-item-list']";


    @FindBy(xpath="//div[contains(@class, 'FolderFiltersWrapper')]/div//button")
    List<WebElement> categoryMenuComponents;

    public void check123Component(){
        categoryMenuComponents.get(0).click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), itemListXpath);
    }

    public void checkFastTrackStdComponent(){
        categoryMenuComponents.get(1).click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), itemListXpath);
    }

    public void checkFastTrackStandardComponent(){
        categoryMenuComponents.get(2).click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), itemListXpath);
    }

    public void checkFastTrackStandard2Component(){
        categoryMenuComponents.get(3).click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), itemListXpath);
    }

    public void checkInsuranceCalculationOrderTypeComponent(){
        categoryMenuComponents.get(4).click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), itemListXpath);
    }

    public void checkCalcolatoComponent(){
        categoryMenuComponents.get(5).click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), itemListXpath);
    }

    public void checkTestExpiredComponent(){
        categoryMenuComponents.get(6).click();
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), itemListXpath);
    }


    public void headerIsDisplayed(){
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), headerElementXpath);
    }

    public void itemListIsDisplayed(){
        DriverUtil.waitForElementPresent(driver, Duration.ofSeconds(15), itemListXpath);
    }







}
