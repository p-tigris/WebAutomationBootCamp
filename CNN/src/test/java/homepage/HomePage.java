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

    @Test(enabled = false)
    public void navToUSNews() {
        homePagePOM.clickUSNews();
    }

    @Test
    public void searchForNews() {
        homePagePOM.clickSearchButton();
        homePagePOM.searchField("election news");
        homePagePOM.searchResults();
    }


}
