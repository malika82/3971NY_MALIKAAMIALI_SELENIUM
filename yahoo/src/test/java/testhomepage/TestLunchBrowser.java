package testhomepage;

import common.CommonAPI;
import homepage.HomePage;
import org.testng.annotations.Test;

public class TestLunchBrowser extends CommonAPI {
    @Test
    public void testLunchBrowser(){
        HomePage lunchBrowser= new HomePage();
        lunchBrowser.lunchBrowser("https://www.yahoo.com/");
    }
    @Test
    public void testSearch(){
        HomePage browser= new HomePage();
        browser.lunchBrowser("https://www.yahoo.com/");
        browser.search("selenium");
    }
    @Test
    public void testMail() throws InterruptedException {
        HomePage homePage=new HomePage();
         homePage.lunchBrowser("https://www.yahoo.com/");
         homePage.mail();
         Thread.sleep(3000);
    }
    @Test
    public void testSignIn(){
        HomePage homePage= new HomePage();
        homePage.lunchBrowser("https://www.yahoo.com/");
        homePage.signIn();
    }
    @Test
    public void tesLogIn() throws InterruptedException {
        HomePage homePage= new HomePage();
        homePage.lunchBrowser("https://login.yahoo.com/");
        homePage.logIn();
        Thread.sleep(3000);
    }
}
