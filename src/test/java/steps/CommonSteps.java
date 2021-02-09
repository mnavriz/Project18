package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.LoginPage;
import pages.ManageCompanyPage;
import pages.UserMenuPage;
import utils.BaseClass;

import java.util.List;

public class CommonSteps extends BaseClass {
    BasePage basePage = new BasePage();
    LoginPage loginPage = new LoginPage();
    UserMenuPage userMenuPage = new UserMenuPage();
    ManageCompanyPage manageCompanyPage = new ManageCompanyPage();

    @When("User sends the keys in {string}")
    public void user_sends_the_keys(String page, DataTable dataTable) {
        List<List<String>> AllElementsNameAndValue= dataTable.asLists(String.class);

        for(int i =0 ; i <AllElementsNameAndValue.size() ; i++){

            System.out.println(AllElementsNameAndValue.get(i).get(0));
            System.out.println(AllElementsNameAndValue.get(i).get(1));

            switch (page) {
                case "LoginPage":
                    loginPage.findElementAndSendKeysFunction(AllElementsNameAndValue.get(i).get(0) ,AllElementsNameAndValue.get(i).get(1));
                    break;
                case "ManageCompanyPage":
                    manageCompanyPage.findElementAndSendKeysFunction(AllElementsNameAndValue.get(i).get(0) ,AllElementsNameAndValue.get(i).get(1));
                    break;
            }
        }
    }


    @And("User clicks on {string}")
    public void userClicksOn(String page, DataTable dataTable) {
        List<String> allElements = dataTable.asList(String.class);
        for (int i = 0; i < allElements.size(); i++) {
            switch (page) {
                case "LoginPage":
                    loginPage.findElementAndClickFunction(allElements.get(i));
                    break;
                case "UserMenu":
                    userMenuPage.findElementAndClickFunction(allElements.get(i));
                    break;
                case "ManageCompanyPage":
                    manageCompanyPage.findElementAndClickFunction(allElements.get(i));
                    break;

            }
        }
    }


    @And("User uploads file")
    public void userUploadsFile(DataTable dataTable) {
        List<String> allElements = dataTable.asList(String.class);
        for (String allElement : allElements) {
            basePage.uploadFile(allElement);
        }
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
}
