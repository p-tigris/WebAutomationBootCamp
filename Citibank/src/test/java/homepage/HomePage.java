package homepage;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.HomePagePOM;

public class HomePage extends CommonAPI {

    HomePagePOM homePagePOM;

    @BeforeMethod
    public void setPageFactory() {
        homePagePOM = PageFactory.initElements(driver, HomePagePOM.class);
    }

    @Test (enabled = false)
    public void login() {
        homePagePOM.signInInfo("username", "password");
        homePagePOM.clickOnSignIn();
    }

    @Test(enabled = false)
    public void hoverAndClickNavBar() {
        WebElement element = getElementByLinkText("Banking");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElementByLinkText("Banking Overview");
    }

    @Test(enabled = false)
    public void searchTest() {
        homePagePOM.clickSearchBar();
        homePagePOM.searchText("credit cards");
        homePagePOM.clickSearch();
    }

    @Test(enabled = false)
    public void scrollToOffersAndClick() {
        WebElement element = getElementByLinkText("Benefits and Services");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    @Test
    public void validateOffersLink() {
        isElementDisplayed("//div[@id='whyCiti']//a[contains(text(),'Benefits and Services')]");
    }


}
