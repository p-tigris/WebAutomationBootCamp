package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePOM {

    @FindBy(id = "email")
    public static WebElement emailField;

    @FindBy(id = "pass")
    public static WebElement passwordField;

    public void enterEmailAndPassword(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }
}
