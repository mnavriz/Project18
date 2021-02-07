package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class LoginPage extends ParentClass {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

}
