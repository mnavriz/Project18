package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageBrandPage extends BasePage {

    WebElement webElement;
    public ManageBrandPage() {PageFactory.initElements(driver, this);}

    @FindBy(name="company_id")
    public WebElement CompanyIdDropdown;

    @FindBy(name="brand_image")
    public WebElement BrandImageInput;

    @FindBy(name="brand_mission")
    public WebElement BrandMissionInput;

    @FindBy(name="brand_profile_information")
    public WebElement BrandProfileInfoInput;

    @FindBy(name="brand_name")
    public WebElement BrandNameInput;

    @FindBy(name="brand_tagline")
    public WebElement BrandTaglineInput;

    @FindBy(name="brand_website")
    public WebElement BrandWebsiteInput;

    @FindBy(name="public_visibility")
    public WebElement PublicVisibilityDropdown;

    @FindBy(name="submit")
    public WebElement SubmitButton;

    @FindBy(xpath = "//a[text()='Edit']")
    public WebElement EditButton;

    public void findElementAndSendKeysFunction(String element, String text) {
        switch (element) {
            case "BrandImageInput":
                webElement = BrandImageInput;
                break;
            case "BrandMissionInput":
                webElement = BrandMissionInput;
                break;
            case "BrandProfileInfoInput":
                webElement = BrandProfileInfoInput;
                break;
            case "BrandNameInput":
                webElement = BrandNameInput;
                break;
            case "BrandWebsiteInput":
                webElement = BrandWebsiteInput;
                break;
            case "BrandTaglineInput":
                webElement = BrandTaglineInput;
                break;


        }
        sendKeysFunction(webElement, text);
    }

    public void findElementAndClickFunction(String element) {
        switch (element) {
            case "SubmitButton":
                webElement = SubmitButton;
                break;
            case "EditButton":
                webElement = EditButton;
                break;

        }
        clickFunction(webElement);
    }

}
