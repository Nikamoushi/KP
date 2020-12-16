package stepDefinitions;

import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import stepDefinitions.MainClass;

public class OpenURL extends MainClass {

    @Тогда("открыть сайт")
    public void open() {
        System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.quit();
    }
}
