package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utils.BaseClass;

@CucumberOptions(

        features = {"src/test/java/featureFiles"},
        glue = {"steps"},
        dryRun = false

)

public class ParallelRunner extends AbstractTestNGCucumberTests {
        @BeforeClass
        @Parameters("browser")
        public void beforeMethod(String browser){
            BaseClass.browserName.set(browser);
        }
}
