package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

public class USNewsPOM {

    @FindBy (linkText = "3 arrested in Philadelphia shootings of 2 children")
    public static WebElement topArticle;

    public void clickOnTopArticle() {
        topArticle.click();
    }

    public void validateTopArticle() {
        Assert.assertEquals(topArticle.isDisplayed(), true, "Article is not displayed");
        TestLogger.log("Article Displayed status: " + topArticle.isDisplayed());
    }
}
