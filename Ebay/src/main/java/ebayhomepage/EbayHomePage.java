package ebayhomepage;

import common.CommonAPI;

import com.google.common.annotations.VisibleForTesting;
import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePage extends CommonAPI {

    //WebElements
    @FindBy(id = "gh-ac")
    WebElement searchBarTextBox;

    @FindBy(linkText = "Sign in")
    WebElement signinLink;

    //Sing In to Ebay
    @FindBy(name = "userid")
    WebElement userId;
    @FindBy(id = "pass")
    WebElement password;
    @FindBy(id = "sgnBt")
    WebElement singinButton;

    //Advanced Search
    @FindBy(id = "gh-as-a")
    WebElement advancedLink;
    @FindBy(id = "_nkw")
    WebElement keyWord;
    @FindBy(id = "_in_kw")
    WebElement keyWordOptionsDropDown;
    @FindBy(id = "_ex_kw")
    WebElement excludeWordTextBox;
    @FindBy(id = "e1-1")
    WebElement categoryDropDown;
    @FindBy(xpath = "//button[@class='btn btn-prim']")
    WebElement searchButton;

    //My Ebay Link
    @FindBy(xpath = "//a[@class='gh-eb-li-a']")
    WebElement myEbayLink;

    //Methods
    public void searchBar(String str) {
        searchBarTextBox.sendKeys(str, Keys.ENTER);
    }

    public void signIn(String str1, String str2) {
        signinLink.click();
        userId.sendKeys(str1);
        password.sendKeys(str2);
        singinButton.click();
    }

    public void advancedSearch(String str1, String str2) throws InterruptedException {
        advancedLink.click();
        keyWord.sendKeys(str1);
        Thread.sleep(2000);
        Select dropdown = new Select(keyWordOptionsDropDown);
        dropdown.selectByIndex(2);
        Thread.sleep(2000);

        excludeWordTextBox.sendKeys(str2);
        Thread.sleep(2000);
        Select dropdown1 = new Select(categoryDropDown);
        dropdown1.selectByIndex(27);
        searchButton.click();
    }

    public void myEbayLink() {
        myEbayLink.click();
        Select ebaydropdown = new Select(myEbayLink);
        ebaydropdown.selectByIndex(2);
    }

}
