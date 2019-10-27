package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePOM {

    @FindBy(xpath = "//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]")
    public static WebElement accountButton;

    @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")
    public static WebElement signInButton;

    @FindBy(id = "twotabsearchtextbox")
    public static WebElement searchBox;

    @FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
    public static WebElement searchButton;



    public void signIn() {
        accountButton.click();
        signInButton.click();
    }

    public void searchText(String text) {
        searchBox.sendKeys(text);
    }

    public void searchButton() {
        searchButton.click();
    }


}
