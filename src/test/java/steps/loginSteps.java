package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.BaseClass;

import java.util.List;

public class loginSteps extends BaseClass {
    WebDriver driver;
    LoginPage loginPage = new LoginPage();

    @Given("User navigates to the asian-promotions website homepage")
    public void user_navigates_to_the_asian_promotions_website_homepage() {
        driver = BaseClass.setUp();
        driver.get("http://staging.asian-promotions.com/login");
        driver.manage().window().maximize();
    }

    @When("User sends the keys")
    public void user_sends_the_keys(DataTable dataTable) {
        List<List<String>> AllElementsNameAndValue= dataTable.asLists(String.class);

        for(int i =0 ; i <AllElementsNameAndValue.size() ; i++){

            System.out.println(AllElementsNameAndValue.get(i).get(0));
            System.out.println(AllElementsNameAndValue.get(i).get(1));

            loginPage.findElementAndSendKeysFunction(AllElementsNameAndValue.get(i).get(0) ,AllElementsNameAndValue.get(i).get(1));

        }
    }

    @Then("User is logged in")
    public void user_is_logged_in() {

    }


    @And("User clicks on")
    public void userClicksOn(DataTable dataTable) {
        List<String> allElements = dataTable.asList(String.class);
        for (int i = 0; i < allElements.size(); i++) {
            loginPage.findElementAndClickFunction(allElements.get(i));
            loginPage.waiting(2000);
        }
    }
}
