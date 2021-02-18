package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserMenuPage extends BasePage {
    WebElement webElement;

    public UserMenuPage() {PageFactory.initElements(driver,this); }

    @FindBy(css = "ul.sidebar-menu > li")
    public List<WebElement> menuBar;


    public void findElementAndClickFunction(String element) {
        switch (element) {
            case "Dashboard":
                webElement = menuBar.get(0);
                break;
            case "HPU_Dashboard":
                webElement = menuBar.get(1);
                break;
            case "ManageProfiles":
                webElement = menuBar.get(2);
                break;
            case "FavoritePromotions":
                webElement = menuBar.get(3);
                break;
            case "ManageCompany":
                webElement = menuBar.get(4);
                break;
            case "ManageBrand":
                webElement = menuBar.get(5);
                break;
            case "ManageStore":
                webElement = menuBar.get(6);
                break;
            case "ManageAdds":
                webElement = menuBar.get(7);
                break;
            case "LegalAgreement":
                webElement = menuBar.get(8);
                break;
            case "ManageOrders":
                webElement = menuBar.get(9);
                break;
            case "Payments":
                webElement = menuBar.get(10);
                break;
            case "ManageEmployee":
                webElement = menuBar.get(11);
                break;
            case "Message":
                webElement = menuBar.get(12);
                break;
        }
        clickFunction(webElement);
    }


    public void findElementAndSendKeysFunction(String element, String text) {

    }


}
