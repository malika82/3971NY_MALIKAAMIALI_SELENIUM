package homepage;

import common.CommonAPI;
import org.openqa.selenium.By;

public class LunchBrowser extends CommonAPI {

    public void lunchBrowser(String url){
        driver.get(url);
        System.out.println(driver.getTitle());
    }

    public void search(String str){
        driver.findElement(By.id("header-search-input")).sendKeys(str);

    }

}
