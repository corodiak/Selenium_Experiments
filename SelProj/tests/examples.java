import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class examples {
    @Test
    public void site_header_is_on_home_page() {
        WebDriver browser;
        //Firefox's geckodriver *requires* you to specify its location.
//        System.setProperty("webdriver.gecko.driver", "d:\\Documents\\Programmieren\\Selenium\\geckodriver.exe");
//        browser = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "d:\\Documents\\Programmieren\\Selenium\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("http://saucelabs.com");
        WebElement header = browser.findElement(By.id("site-header"));
        assertTrue((header.isDisplayed()));
        browser.close();
    }
}