package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class LoginPage extends BasePage implements Page {
    private HashMap<String, WebElement> map = new HashMap<>();
    public LoginPage() {
        PageFactory.initElements(driver, this);
        initMap();
    }

    @FindBy(name = "email")
    private WebElement Username;

    @FindBy(name = "password")
    private WebElement Password;

    @FindBy(name = "submit")
    private WebElement Submit;

    public void initMap(){
        map.put("Username", Username);
        map.put("Password", Password);
        map.put("Submit", Submit);
    }


    // ===========================All methods to be listed here ======================
    @Override
    public void findElementAndClickFunction(String element)
    {
        clickFunction(getWebElement(map, element));
    }

    @Override
    public void findElementAndSendKeysFunction(String element, String text)
    {
        sendKeysFunction(getWebElement(map,element), text);
    }

    @Override
    public void selectFromDropDownByRandomIndex(String element)
    {
        selectDropDown(getWebElement(map,element));

    }

    @Override
    public void selectFromDropDownByName(String nameToSelect, String element)
    {
        selectDropDown(nameToSelect, getWebElement(map,element));
    }

}
