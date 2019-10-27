package homepage;

import base.CommonAPI;
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

    @Test
    public void login() {
        homePagePOM.signIn();
    }

    @Test
    public void browseForItemsAndCheckout() {
        homePagePOM.searchText("java books");
        homePagePOM.searchButton();
        clickOnElementByXpath("//span[contains(text(),'Java All-in-One For Dummies (For Dummies (Computer')]");
        clickOnElementByXpath("//input[@id='add-to-cart-button']");
        clickOnElementByXpath("//a[@id='hlb-ptc-btn-native']");
    }


}
