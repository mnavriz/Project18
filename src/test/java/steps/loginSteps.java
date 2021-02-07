package steps;


import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class loginSteps {
    WebDriver driver;

    @Given("I navigate to the {string}")
    public void iNavigateToThe(String url) {
        driver = BaseClass.setUp("chrome");
    }

    @When("I login username as {string} and password as {string}")
    public void i_login_username_as_and_password_as(String string, String string2) {

    }

    @Then("Check if I am logged in")
    public void check_if_i_am_logged_in() {

    }



}
