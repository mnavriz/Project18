package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.BaseClass;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        this.driver = BaseClass.setUp();
        wait = new WebDriverWait(driver,15);
    }

    //    Click on element method
    protected void clickFunction(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();

    }

    //    Send keys function
    protected void sendKeysFunction(WebElement element , String value){

        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);

    }

    //    Waiting until element become visible
    protected void waitUntilVisible(WebElement elementToWait){

        wait.until(ExpectedConditions.visibilityOf(elementToWait));

    }


    //    WaitForClickable
    protected void waitUntilClickable(WebElement elmentToWait){

//        wait until clickable is working as if the element is not visible
        wait.until(ExpectedConditions.elementToBeClickable(elmentToWait));
    }

    //  Verify element is contains specific text
    protected void ElementContainsText(WebElement element , String myText){

        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(myText));
    }

    protected void waiting(int howLong){
        try {
            Thread.sleep(howLong);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void scrollToElement(WebElement elementToScroll){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView();", elementToScroll);
    }

    protected void moveToElementAndClick(WebElement element){
        Actions actions = new Actions(BaseClass.setUp());
        scrollToElement(element);
        actions.moveToElement(element).click().perform();
    }

    public void uploadFile(String pathToFile){

        Robot robot = null;
        try {
            robot = new Robot();

        StringSelection stringSelection = new StringSelection(pathToFile);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

        waiting(500);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        waiting(500);
        robot.keyPress(KeyEvent.VK_ENTER);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

}
