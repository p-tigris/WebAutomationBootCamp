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
    public void login() {
        homePagePOM.signIn();
        driver.navigate().to("https://my.cigna.com/web/public/guest");
        homePagePOM.signInInfo("username", "password");
        homePagePOM.login();
    }

    @Test(enabled = false)
    public void verifyLoginFailure() {
        login();
        homePagePOM.validateLogin();
    }

    @Test(enabled = false)
    public void browseDentalInsurance() {
        clickOnElementByXpath("//a[contains(text(),'Dental Insurance Plans')]");
        clickOnElementByXpath("//a[contains(text(),'GET A QUOTE')]");
        driver.navigate().to("https://cignaindividual.com/public/Quoting/Individual/EnterQuoteCriteria.aspx?r+bZgxlWhFPrqjNRvlJg+LjL8/rCE7ultYMwkOER9e40v3Qtm5HfwuSCA6PA+Gd8ChiAQBmXNeNS+Yfbl0/GuXDFGzbe1NJWGaXVmoSql2R4PIa3kl4Q/Zw7I8akmiLU");
        sendKeysByXpath("//input[@id='uxFieldZipCode']", "11377");
        clickOnElementByXpath("//option[contains(text(),'11/1/2019')]");
        sendKeysByXpath("//input[@id='cph_uxRepeaterApplicants_uxFieldDateOfBirth_0']", "01011970");
        clickOnElementByXpath("//select[@id='cph_uxRepeaterApplicants_uxFieldGender_0']//option[contains(text(),'Male')]");
        clickOnElementByXpath("//input[@id='uxButtonGetQuote']");
    }

    @Test
    public void medicareQuiz() {
        clickOnElementByXpath("//span[contains(text(),'Medicare')]");
        driver.navigate().to("https://www.cigna.com/medicare/");
        clickOnElementByXpath("//button[@class='btn btn-primary guidance-nav-submit']");
        driver.navigate().to("https://www.cigna.com/medicare/understanding-medicare/");
        clickOnElementByXpath("//button[@class='btn btn-primary guidance-nav-submit']");
        clickOnElementByXpath("//form[@id='tool-step-1']//button[@class='btn btn-primary mb-m'][contains(text(),'Next')]");
        clickOnElementByXpath("//form[@id='tool-step-2']//button[@class='btn btn-primary mb-m'][contains(text(),'Next')]");
        clickOnElementByXpath("//form[@id='tool-step-3']//button[@class='btn btn-primary mb-m'][contains(text(),'Next')]");
        clickOnElementByXpath("//form[@id='tool-step-4']//button[@class='btn btn-primary mb-m'][contains(text(),'Next')]");
        clickOnElementByXpath("//button[@class='btn btn-primary mr-m mb-m']");
        clickOnElementByXpath("//a[@class='btn btn-primary mr-m mb-m']");
    }

}
