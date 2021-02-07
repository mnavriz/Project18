package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class loginPom extends BaseClass {
    public WebDriver driver;

    public loginPom() {

        PageFactory.initElements(driver, this);
    }


}
