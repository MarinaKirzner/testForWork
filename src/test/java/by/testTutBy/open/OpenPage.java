package by.testTutBy.open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.xpath;

public class OpenPage {

    WebDriver driver;
    WebDriverWait webDriverWait;

    public OpenPage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver,10);
    }

    @FindBy(xpath = "//a[contains(text(),'Афиша')]")
    private WebElement afisha;

    @FindBy(xpath = "//a[contains(text(),'Онлайн-кинотеатры')]")
    private WebElement onlineCinema;

    @FindBy(xpath = "//button/span[1]")
    private WebElement selectGenre;

    @FindBy(xpath = "//ul[@class='dropdown-menu inner selectpicker']//li[@rel='0']")
    private WebElement selectComedy;


    public void open() {
        //Open tut.by
        driver.get("https://www.tut.by/");
        afisha.click();
        onlineCinema.click();
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                xpath("//div[contains(@class,'b-events-filter m-online-filter js-online-params')]")));
    }

    public void openOnlineCinema() {
        //Open page Online-cinema
        driver.get("https://afisha.tut.by/online-cinema/");
        //open page Serial
        driver.get("https://afisha.tut.by/online-cinema/serial/");
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                xpath("//div[contains(@class,'b-events-filter m-online-filter js-online-params')]")));

    }

    public void openAnimation() {
        //Open page Animation
        driver.get("https://afisha.tut.by/online-cinema/animation/");
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                xpath("//div[contains(@class,'b-events-filter m-online-filter js-online-params')]")));
    }

    public void clickGenre() {
        //Click Жанры
        selectGenre.click();
        //Click Комедия
        selectComedy.click();
        //Click Жанры
        selectGenre.click();
    }

    public WebElement getSelectGenre() {
        return selectGenre;
    }


}
