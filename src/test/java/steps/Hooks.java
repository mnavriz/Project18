package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import utils.BaseClass;

public class Hooks {
    WebDriver driver;


    @Before
    public void start(){
        driver = BaseClass.setUp("chrome");
    }

    @After
    public void quit(){
        BaseClass.tearDown();
    }
}
