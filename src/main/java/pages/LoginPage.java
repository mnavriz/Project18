package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

WebElement webElement;

    public LoginPage() {PageFactory.initElements(driver, this);}

    @FindBy(name = "email")
    private WebElement Username;

    @FindBy(name = "password")
    private WebElement Password;

    @FindBy(name = "submit")
    private WebElement Submit;


    public void findElementAndSendKeysFunction(String element, String text) {
        switch (element) {
            case "Username":
                webElement = Username;
                break;
            case "Password":
                webElement = Password;
                break;
        }
        sendKeysFunction(webElement, text);
    }

    public void findElementAndClickFunction(String element) {
        switch (element) {
            case "Submit":
                webElement = Submit;
                break;
        }
        clickFunction(webElement);
    }

}
