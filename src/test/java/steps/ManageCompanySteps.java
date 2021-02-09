package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.ManageCompanyPage;
import utils.BaseClass;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ManageCompanySteps extends BaseClass {
    ManageCompanyPage manageCompanyPage = new ManageCompanyPage();
    @When("User selects the file")
    public void userSelectsTheFile() throws AWTException {
        Robot robot = new Robot();

        String pathToFile = "C:\\Users\\safe glazing\\Desktop\\autodesk.png";
        StringSelection stringSelection = new StringSelection(pathToFile);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);


        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
    }

    @And("User clicks")
    public void userClicks() {
        Actions actions = new Actions(BaseClass.setUp());
        actions.moveToElement(manageCompanyPage.CompanyImage).click().perform();
    }
}
