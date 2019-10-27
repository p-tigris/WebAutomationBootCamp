package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

public class HomePagePOM {

    @FindBy(xpath = "//a[@class='btn btn-sm btn-primary'][text()='Log in to myCigna']")
    public static WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public static WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement passwordField;

    @FindBy(xpath = "//input[@id='loginbutton']")
    public static WebElement loginButton;

    @FindBy(xpath = "//div[@id='error-inner']")
    public static WebElement errorMessage;

    public void signIn () {
        login.click();
    }

    public void signInInfo(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public void login() {
        loginButton.click();
    }

    public void validateLogin() {
        Assert.assertEquals(errorMessage.isDisplayed(), true, "Error message is not displayed");
        TestLogger.log("Login error status: " + errorMessage.isDisplayed());
    }
}
