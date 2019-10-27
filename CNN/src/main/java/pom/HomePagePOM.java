package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagePOM {

    @FindBy(xpath = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='us'][contains(text(),'US')]")
    public static WebElement usNews;

    @FindBy(xpath = "//button[@class='buttonstyles__ButtonBase-augw5g-0 headerstyles__IconButton-sc-1vh4dor-0 ikSuiI']//*[@class='search-icon']")
    public static WebElement searchButton;

    @FindBy(xpath = "//input[@id='header-search-bar']")
    public static WebElement searchTextBox;

    @FindBy(xpath = "//div[@class='Box-sc-1fet97o-0 iKQPmQ']//button[@class='Flex-sc-1sqrs56-0 search-barstyles__Button-yoe3fw-2 kxpkSG']")
    public static WebElement searchButtonResults;

    public void clickUSNews() {
        usNews.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void searchField(String search) {
        searchTextBox.sendKeys(search);
    }

    public void searchResults() {
        searchButtonResults.click();
    }

}
