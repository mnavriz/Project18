package steps;


import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class loginSteps extends BaseClass {
    WebDriver driver;

    @Given("I navigate to the asian-promotions website homepage")
    public void i_navigate_to_the_asian_promotions_website_homepage() {
        driver = BaseClass.setUp();
        driver.get("http://staging.asian-promotions.com");
        driver.manage().window().maximize();

    }

    @When("I login username as {string} and password as {string}")
    public void i_login_username_as_and_password_as(String string, String string2) {

    }

    @Then("Check if I am logged in")
    public void check_if_i_am_logged_in() {

    }


}
