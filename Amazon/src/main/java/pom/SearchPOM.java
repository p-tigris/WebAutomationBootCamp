package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

public class SearchPOM {

    @FindBy(xpath = "//span[contains(text(),'Java All-in-One For Dummies (For Dummies (Computer')]")
    public static WebElement javaBookSearchResult;

    public void isJavaBookDisplayed() {
        Assert.assertEquals(javaBookSearchResult.isDisplayed(), true, "Java Book is not displayed");
        TestLogger.log("Java Book displayed status: " + javaBookSearchResult.isDisplayed());
    }
}
