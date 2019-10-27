package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.SearchPOM;

public class SearchResults extends CommonAPI {

    SearchPOM searchPOM;

    @BeforeMethod
    public void setPageFactory() {
        searchPOM = PageFactory.initElements(driver, SearchPOM.class);
    }

    @Test
    public void validateSearchResult() {
        sendKeysById("twotabsearchtextbox", "java books");
        clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
        searchPOM.isJavaBookDisplayed();
    }
}
