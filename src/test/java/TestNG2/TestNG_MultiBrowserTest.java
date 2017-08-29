package TestNG2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class TestNG_MultiBrowserTest {

    private WebDriver driver;
    private String baseUrl;
    //static Logger log = Logger.getLogger(TestNG_DependentTests.class);

    @Parameters("browserType")

    @BeforeClass
    public void beforeClass(String browser) {

        if(browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Applications/selenium-2.53.1/chromedriver");
            driver = new ChromeDriver();
        }
        baseUrl = "https://www.expedia.com/";
        driver.get(baseUrl);
    }

    @Test
    public void searchFlights() {
        System.out.println("Test Method Ran");
    }

    @AfterClass
    public void afterClass() throws Exception {
        Thread.sleep(10000);
        driver.quit();
    }
}
