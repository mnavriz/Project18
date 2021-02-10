package steps;


import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.UserMenuPage;
import utils.BaseClass;

public class LoginSteps extends BaseClass {
    WebDriver driver;
    LoginPage loginPage = new LoginPage();
    UserMenuPage userMenuPage = new UserMenuPage();

    @Given("User navigates to the asian-promotions website homepage")
    public void user_navigates_to_the_asian_promotions_website_homepage() {
        driver = BaseClass.setUp();
        driver.get("http://staging.asian-promotions.com/login");
        driver.manage().window().maximize();
    }


    @Then("User is logged in")
    public void user_is_logged_in() {

    }

}
