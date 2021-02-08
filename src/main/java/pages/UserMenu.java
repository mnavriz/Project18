package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class UserMenu extends CommonMethods {
    WebElement webElement;

    public UserMenu() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "ul.sidebar-menu > li")
    public List<WebElement> menuBar;


    public void clickOnMenu(String element) {
        switch (element) {
            case "Dashboard":
                webElement = menuBar.get(0);
                break;
            case "ManageProfiles":
                webElement = menuBar.get(1);
                break;
            case "FavoritePromotions":
                webElement = menuBar.get(2);
                break;
            case "ManageCompany":
                webElement = menuBar.get(3);
                break;
            case "ManageBrand":
                webElement = menuBar.get(4);
                break;
            case "ManageStore":
                webElement = menuBar.get(5);
                break;
            case "ManageEmployee":
                webElement = menuBar.get(6);
                break;
            case "Message":
                webElement = menuBar.get(7);
                break;
        }
        clickFunction(webElement);
    }

}
