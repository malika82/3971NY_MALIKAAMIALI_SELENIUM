package testhomepage;

import common.CommonAPI;
import homepage.LunchBrowser;
import org.testng.annotations.Test;

public class TestLunchBrowser extends CommonAPI {
    @Test
    public void testLunchBrowser(){
        LunchBrowser lunchBrowser= new LunchBrowser();
        lunchBrowser.lunchBrowser("https://www.yahoo.com/");
    }
    @Test
    public void testSearch(){
        LunchBrowser search= new LunchBrowser();
        search.lunchBrowser("https://www.yahoo.com/");
        search.search("selenium");
    }
}
