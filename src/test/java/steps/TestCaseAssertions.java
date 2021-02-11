package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class TestCaseAssertions {


    @Then("User verifies the test case in {string}")
    public void userVerifiesTheTestCaseIn(String page, DataTable dataTable) {
        List<String> allElements = dataTable.asList(String.class);



    }
}
