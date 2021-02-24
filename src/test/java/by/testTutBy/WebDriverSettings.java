package by.testTutBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverSettings {

    public WebDriver driver;
    public WebDriverWait webDriverWait;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","c:\\ChromeWebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, 10);
    }

    @AfterClass
    public void close() {
        if(driver != null){
            driver.close();
            driver.quit();}
    }
}
