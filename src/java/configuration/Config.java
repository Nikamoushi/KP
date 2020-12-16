package configuration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stepDefinitions.MainClass;


public class Config {
    @Before
    static public void setupTimeout() {
        System.out.printf("CONFIG");
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        MainClass mainClass = new MainClass();
        mainClass.driver = driver;
    }

    @After
    public void afterClass() {
        new MainClass().driver.close();
    }
}
