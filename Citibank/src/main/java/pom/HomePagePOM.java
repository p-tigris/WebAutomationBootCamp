package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePOM {

    @FindBy(xpath = "//input[@id='username']")
    public static WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    public static WebElement passwordField;

    @FindBy(xpath = "//input[@id='signInBtn']")
    public static WebElement signInButton;

    @FindBy(xpath = "//div[@id='personetics-citi-menu']")
    public static WebElement searchBar;

    @FindBy(xpath = "//input[@id='citi-autocomplete-content-searchbox-livesearch']")
    public static WebElement searchTextBox;

    @FindBy(xpath = "//button[@class='citi-autocomplete-content-searchbox-go']")
    public static WebElement searchButton;

    public void signInInfo(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public void clickOnSignIn() {
        signInButton.click();
    }

    public void clickSearchBar() {
        searchBar.click();
    }

    public void searchText(String text) {
        searchTextBox.sendKeys(text);
    }

    public void clickSearch() {
        searchButton.click();
    }


}
