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
        homePagePOM.enterEmailAndPassword("randomemail@gmail.com", "password5");
        clickOnElementByXpath("//input[@id='u_0_2']");
    }


}
