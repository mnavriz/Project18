package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utils.BaseClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CommonSteps extends BaseClass {
    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    UserMenuPage userMenuPage = new UserMenuPage();
    ManageCompanyPage manageCompanyPage = new ManageCompanyPage();
    ManageBrandPage manageBrandPage = new ManageBrandPage();

    @When("User sends the keys in {string}")
    public void user_sends_the_keys(String page, DataTable dataTable) {
        List<List<String>> AllElementsNameAndValue= dataTable.asLists(String.class);


        for(int i =0 ; i <AllElementsNameAndValue.size() ; i++){

            System.out.println(AllElementsNameAndValue.get(i).get(0));
            System.out.println(AllElementsNameAndValue.get(i).get(1));

            switch (page) {
                case "loginPage":
                    loginPage.findElementAndSendKeysFunction(AllElementsNameAndValue.get(i).get(0) ,AllElementsNameAndValue.get(i).get(1));
                    break;
                case "ManageCompanyPage":
                    manageCompanyPage.findElementAndSendKeysFunction(AllElementsNameAndValue.get(i).get(0) ,AllElementsNameAndValue.get(i).get(1));
                    break;
                case "ManageBrandPage":
                    manageBrandPage.findElementAndSendKeysFunction(AllElementsNameAndValue.get(i).get(0) ,AllElementsNameAndValue.get(i).get(1));
                    break;
            }
        }

    }


    @And("User clicks on {string}")
    public void userClicksOn(String page, DataTable dataTable) {
        List<String> allElements = dataTable.asList(String.class);

        for (int i = 0; i < allElements.size(); i++) {
            switch (page) {
                case "loginPage":
                    loginPage.findElementAndClickFunction(allElements.get(i));
                    break;
                case "UserMenu":
                    userMenuPage.findElementAndClickFunction(allElements.get(i));
                    break;
                case "ManageCompanyPage":
                    manageCompanyPage.findElementAndClickFunction(allElements.get(i));
                    break;
                case "ManageBrandPage":
                    manageBrandPage.findElementAndClickFunction(allElements.get(i));
                    break;


            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    @And("User uploads file")
    public void userUploadsFile(DataTable dataTable) {
        List<String> allElements = dataTable.asList(String.class);
        for (String allElement : allElements) {
            basePage.uploadFile(allElement);
        }
        basePage.waiting(1000);
    }

    @And("User hover overs the element and clicks on {string}")
    public void userHoverOversTheElementAndClicksOn(String page, DataTable dataTable) {
        List<String> allElements = dataTable.asList(String.class);
        for (int i = 0; i < allElements.size(); i++) {
            switch (page) {
                case "ManageCompanyPage":
                    manageCompanyPage.moveToElementAndClickFunction(allElements.get(i));
                    break;
            }
        }
    }

    @And("Selecting drop down")
    public void selectingDropDown() {
        basePage.waiting(2000);
        basePage.selectDropDownByName("Hide",manageCompanyPage.VisibilityDropDown);
    }
}
