package homepage;

import common.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestBuyHomePage extends CommonAPI {

    //find Element
    @FindBy(id = "gh-search-input")
    WebElement searchBarTextBox;

    @FindBy(id = "menu_wrapper")
    WebElement productsLink;
    @FindBy(id ="header-menu-113")
    WebElement productListMenu;


// Methods
    public void searchBar(String str) {
        searchBarTextBox.sendKeys(str, Keys.ENTER);
    }

    public void productLink(){
        productListMenu.click();

    }
}
