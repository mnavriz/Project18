package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;


public class BaseClass {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> browserName = new ThreadLocal<>();

    public static WebDriver setUp(){
        if(threadDriver.get()==null){
            setWebDriver(DriverFactory.createInstance(browserName.get()));
        }
        return threadDriver.get();
    }

    public static void setWebDriver(WebDriver driver){
        threadDriver.set(driver);
    }


    public static void tearDown() {

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }
    }
}
