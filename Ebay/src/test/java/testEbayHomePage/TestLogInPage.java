package testEbayHomePage;

import common.CommonAPI;
import ebayhomepage.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogInPage extends CommonAPI {
    String url = "https://login.yahoo.com/";
    LogInPage logInPage = new LogInPage();

    public void accessLogInPage() {
        this.logInPage = PageFactory.initElements(driver, LogInPage.class);
    }

    @Test
    public void testLogIn() throws InterruptedException {
        driver.get(url);
        accessLogInPage();
        logInPage.logIn("#####","#######");
        Thread.sleep(5000);
    }

}
