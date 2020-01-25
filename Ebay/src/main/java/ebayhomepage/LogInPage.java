package ebayhomepage;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends CommonAPI {

    //LogIn
    @FindBy(id = "login-username")
    WebElement logInTextBox;
    @FindBy(css = "#login-signin")
    WebElement nextButton;
    @FindBy(id = "login-passwd")
    WebElement passWordTextBox;

    // Methods
    public void logIn(String str1, String str2) {
        logInTextBox.sendKeys(str1);
        nextButton.click();
        passWordTextBox.sendKeys(str2);
    }
}
