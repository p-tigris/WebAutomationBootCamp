package usnews;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.USNewsPOM;

public class USNews extends CommonAPI {

    USNewsPOM usNewsPOM;

    @BeforeMethod
    public void setPageFactory() {
        usNewsPOM = PageFactory.initElements(driver, USNewsPOM.class);
    }

    @Test
    public void readTopArticle() {
        clickOnElementByXpath("//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='us'][contains(text(),'US')]");
        usNewsPOM.clickOnTopArticle();
    }

    @Test
    public void verifyTopArticle() {
        clickOnElementByXpath("//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='us'][contains(text(),'US')]");
        usNewsPOM.validateTopArticle();
    }

}
