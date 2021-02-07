package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseClass;

public class ParentClass {
    WebDriver driver;
    WebDriverWait wait;

    public ParentClass() {
        this.driver = BaseClass.setUp();
        wait = new WebDriverWait(driver,10);
    }
}
