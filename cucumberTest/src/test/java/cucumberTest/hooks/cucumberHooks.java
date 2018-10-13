package cucumberTest.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.Collection;
import java.util.Properties;

public class cucumberHooks {
    public static WebDriver driver = null;
    private static  Scenario scn = null;

    @Before("@browser")
    public void browserSetup(Scenario scenario){
        Properties props = System.getProperties();
        scn = scenario;

        if (hasTag("chrome")) {
            props.setProperty("webdriver.chrome.driver", "d:\\Documents\\Programmieren\\Selenium\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
        }
        if (hasTag("firefox")) {
                props.setProperty("webdriver.gecko.driver", "d:\\Documents\\Programmieren\\Selenium\\geckodriver.exe");
                driver = new FirefoxDriver();
        }
    }

    private boolean hasTag(String tagName) {
        return scn.getSourceTagNames().stream().anyMatch(tag -> {
            return tag.contains(tagName);
        });
    }

    @After("@browser")
    public void closeBrowser() {
        driver.quit();
    }
}
