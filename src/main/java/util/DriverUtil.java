package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverUtil {

    public static void waitForElementPresent(WebDriver driver, Duration waitSeconds, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, waitSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

}
