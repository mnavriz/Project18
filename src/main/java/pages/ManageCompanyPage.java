package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ManageCompanyPage extends BasePage {

    WebElement webElement;

    public ManageCompanyPage() { PageFactory.initElements(driver, this);}

    @FindBy(name = "company_name")
    public WebElement CompanyName;

    @FindBy(name = "company_tagline")
    public WebElement CompanyTagline;

    @FindBy(name = "company_website")
    public WebElement CompanyWebsite;

    @FindBy(name = "company_profile_information")
    public WebElement CompanyProfileInformation;

    @FindBy(name = "company_image")
    public WebElement CompanyImage;

    @FindBy(name = "company_mission")
    public WebElement CompanyMission;

    @FindBy(name = "company_registration_no")
    public WebElement CompanyRegistrationNo;

    @FindBy(name = "public_visibility")
    public WebElement VisibilityDropDown;

    @FindBy(name = "submit")
    public WebElement SaveButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement SearchInputField;

    @FindBy(linkText = "Delete")
    public WebElement DeleteButton;

    @FindBy(linkText = "Details")
    public WebElement DetailsButton;

    public void findElementAndSendKeysFunction(String element, String text) {
        switch (element) {
            case "CompanyName":
                webElement = CompanyName;
                break;
            case "CompanyTagline":
                webElement = CompanyTagline;
                break;
            case "CompanyWebsite":
                webElement = CompanyWebsite;
                break;
            case "CompanyProfileInformation":
                webElement = CompanyProfileInformation;
                break;
            case "CompanyMission":
                webElement = CompanyMission;
                break;
            case "CompanyRegistrationNo":
                webElement = CompanyRegistrationNo;
                break;
            case "SearchInputField":
                webElement = SearchInputField;
                break;
            case "CompanyImage":
                webElement = CompanyImage;
                break;
        }
        sendKeysFunction(webElement, text);
    }

    public void findElementAndClickFunction(String element) {
        switch (element) {
            case "CompanyImage":
                webElement = CompanyImage;
                break;
            case "SaveButton":
                webElement = SaveButton;
                break;
            case "DeleteButton":
                webElement = DeleteButton;
                break;
            case "DetailsButton":
                webElement = DetailsButton;
                break;
        }
        clickFunction(webElement);
    }

    public void moveToElementAndClickFunction(String element) {

        switch (element) {
            case "CompanyImage":
                webElement = CompanyImage;
                break;

        }
        moveToElementAndClick(webElement);
    }

}
