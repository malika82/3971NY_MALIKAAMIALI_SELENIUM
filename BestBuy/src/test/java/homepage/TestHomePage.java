package homepage;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    String url = "https://www.bestbuy.com/";

    BestBuyHomePage bestBuy;

    public void accessBestBuyHomePage() {

        this.bestBuy = PageFactory.initElements(driver, BestBuyHomePage.class);
    }
    @Test
    public void testSearchBox() throws InterruptedException {
        driver.get(url);
        accessBestBuyHomePage();
        bestBuy.searchBar("iphone");
        Thread.sleep(5000);
    }
    @Test
    public void testProductsLink() throws InterruptedException {
        driver.get(url);
        accessBestBuyHomePage();
        bestBuy.productLink();
        Thread.sleep(5000);
    }

}
