package testhomepage;

import common.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    HomePage homePage;
    String url = "https://www.yahoo.com/";

    public void accessHomePage() {

        this.homePage = PageFactory.initElements(driver, HomePage.class);
    }

    // Tests
    @Test
    public void testSearch() {
        driver.get(url);
        accessHomePage();
        homePage.search("Selenium");
    }
    @Test
    public void testMail() {
        driver.get(url);
        accessHomePage();
        homePage.mail();
    }
    @Test
    public void testSignIn() {
        driver.get(url);
        accessHomePage();
        homePage.signIn();
    }
    @Test
    public void testNewsLink() throws InterruptedException {
        driver.get(url);
        accessHomePage();
        homePage.clickOnNewsLink();
        Thread.sleep(500);
    }
    @Test
    public void testNotificationButton() throws InterruptedException {
        driver.get(url);
        accessHomePage();
        homePage.notificationButton();
        Thread.sleep(5000);
    }
    @Test
    public void testMailLink() throws InterruptedException {
        driver.get(url);
        accessHomePage();
        homePage.mailLink();
        Thread.sleep(5000);
    }

}
