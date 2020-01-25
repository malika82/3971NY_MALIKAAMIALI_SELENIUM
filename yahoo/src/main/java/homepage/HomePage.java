package homepage;

import com.google.common.annotations.VisibleForTesting;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    //WebElements
    @FindBy(id = "header-search-input")
    WebElement searchBarTextBox;

    @FindBy(xpath = "//span[text()='Mail']")
    WebElement mailButton;

    @FindBy(linkText = "Mail")
    WebElement mailLink;

    @FindBy(xpath = "//button[@id='header-desktop-search-button']")
    WebElement searchIconButton;

    @FindBy(linkText = "News")
    WebElement newsLink;

    @FindBy(id = "header-notification-button")
    WebElement notificationButton;

    // Methods
    public void search(String str) {
        searchBarTextBox.sendKeys(str, Keys.ENTER);
    }

    public void mail() {
        mailButton.click();
    }

    public void signIn() {
        driver.findElement(By.id("header-signin-link")).click();
    }

    public void clickOnNewsLink() {
        newsLink.click();
    }

    public void notificationButton() {
        notificationButton.click();
    }

    public void mailLink() {
        mailLink.click();
    }


}
