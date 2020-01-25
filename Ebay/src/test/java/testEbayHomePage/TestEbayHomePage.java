package testEbayHomePage;

import common.CommonAPI;
import ebayhomepage.EbayHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEbayHomePage extends CommonAPI {
    String url = "https://www.ebay.com/";
    EbayHomePage ebayHomePage;


    public void accessEbayHomePage() {
        this.ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
    }

    @Test
    public void testSearchBar() {
        driver.get(url);
        accessEbayHomePage();
        ebayHomePage.searchBar("computer");
    }
    @Test
    public void testSignIn() {
        driver.get(url);
        accessEbayHomePage();
        ebayHomePage.signIn("########","#########");
    }
    @Test
    public void testAdvancedSearch() throws InterruptedException {
        driver.get(url);
        accessEbayHomePage();
        ebayHomePage.advancedSearch ("nike","95");
        Thread.sleep(2000);
    }
    @Test
    public void testMyEbayLink() throws InterruptedException {
        driver.get(url);
        accessEbayHomePage();
        ebayHomePage.myEbayLink();
        Thread.sleep(2000);
    }
}
