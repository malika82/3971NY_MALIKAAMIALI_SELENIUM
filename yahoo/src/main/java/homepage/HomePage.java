package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {

    public void lunchBrowser(String url) {
        driver.get(url);
        System.out.println(driver.getTitle());
    }

    public void search(String str) {
        driver.findElement(By.id("header-search-input")).sendKeys(str);
    }

    public void mail() {
        driver.findElement(By.xpath("//span[text()='Mail']")).click();
    }
    public void signIn(){
       driver.findElement(By.id("header-signin-link")).click();
    }
    public void logIn(){
        HomePage homePage=new HomePage();
        driver.findElement(By.id("login-username")).sendKeys("malika@yahoo.com");
    }
}
