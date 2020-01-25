package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver=null;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/malika/IdeaProjects/MyProject/Generic/src/main/java/driver/chromedriver");
        driver = new ChromeDriver();
        //driver.get("https://www.yahoo.com/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }
    }

