package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pages.UserMenu;

import java.util.List;

public class UserMenuSteps {
    UserMenu userMenu = new UserMenu();

    @And("User clicks on MenuBar")
    public void userClicksOn(DataTable dataTable) {
        List<String> allElements = dataTable.asList(String.class);
        for (int i = 0; i < allElements.size(); i++) {
            userMenu.clickOnMenu(allElements.get(i));
            userMenu.waiting(2000);
        }
    }
}
