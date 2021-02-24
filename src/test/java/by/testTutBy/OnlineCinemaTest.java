package by.testTutBy;

import by.testTutBy.open.OpenPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class OnlineCinemaTest extends WebDriverSettings{

    @Test(description = "Test Films")
    public void testFilms() {

        OpenPage openPage = PageFactory.initElements(driver, OpenPage.class);
        openPage.open();
        openPage.clickGenre();

        //Check
        while (true){
            WebElement elements = null;
            try {
                elements = driver.findElement(By.xpath("//li[@class='p-next']//a[@class='p-inside']"));

                //Search quantity of cells
                List<WebElement> cellsElementsLists = driver.findElements(
                        By.xpath("//div[@class='events-block online-movies']/ul/li"));

                //Check Genre
                for (WebElement cellsElement: cellsElementsLists) {
                    if (!cellsElement.getText().contains(openPage.getSelectGenre().getText())) {
                        System.out.println(cellsElement.getText());
                    }
                }

                //Clear list
                cellsElementsLists.clear();

                //Click
                String title = elements.getAttribute("title");
                if (title.equals("Следующая страница →")) {
                    elements.click();
                }
                title = null;
            } catch (Exception e) {
                elements = driver.findElement(By.xpath("//span[@class='p-inside']"));

                //Search quantity of cells
                List<WebElement> cellsElementsLists = driver.findElements(
                        By.xpath("//div[@class='events-block online-movies']/ul/li"));

                //Check Genre
                for (WebElement cellsElement: cellsElementsLists) {
                    if (!cellsElement.getText().contains(openPage.getSelectGenre().getText())) {
                        System.out.println(cellsElement.getText());
                    }
                }

                //Clear list
                cellsElementsLists.clear();

                break;
            }

        }

    }

    @Test(description = "Test Serial")
    public void testSerial() {

        OpenPage openPage = PageFactory.initElements(driver, OpenPage.class);
        openPage.openOnlineCinema();
        openPage.clickGenre();

        //Check
        while (true){
            WebElement elements = null;
            try {
                elements = driver.findElement(By.xpath("//li[@class='p-next']//a[@class='p-inside']"));

                //Search quantity of cells
                List<WebElement> cellsElementsLists = driver.findElements(
                        By.xpath("//div[@class='events-block online-movies']/ul/li"));

                //Check Genre
                for (WebElement cellsElement: cellsElementsLists) {
                    if (!cellsElement.getText().contains(openPage.getSelectGenre().getText())) {
                        System.out.println(cellsElement.getText());
                    }
                }

                //Clear list
                cellsElementsLists.clear();

                //Click
                String title = elements.getAttribute("title");
                if (title.equals("Следующая страница →")) {
                    elements.click();
                }
                title = null;
            } catch (Exception e) {
                elements = driver.findElement(By.xpath("//span[@class='p-inside']"));

                //Search quantity of cells
                List<WebElement> cellsElementsLists = driver.findElements(
                        By.xpath("//div[@class='events-block online-movies']/ul/li"));

                //Check Genre
                for (WebElement cellsElement: cellsElementsLists) {
                    if (!cellsElement.getText().contains(openPage.getSelectGenre().getText())) {
                        System.out.println(cellsElement.getText());
                    }
                }

                //Clear list
                cellsElementsLists.clear();

                break;
            }

        }

    }

    @Test(description = "Test Animation")
    public void testAnimation() {

        OpenPage openPage = PageFactory.initElements(driver, OpenPage.class);
        openPage.openAnimation();
        openPage.clickGenre();

        //Check
        while (true){
            WebElement elements = null;
            try {
                elements = driver.findElement(By.xpath("//li[@class='p-next']//a[@class='p-inside']"));

                //Search quantity of cells
                List<WebElement> cellsElementsLists = driver.findElements(
                        By.xpath("//div[@class='events-block online-movies']/ul/li"));

                //Check Genre
                for (WebElement cellsElement: cellsElementsLists) {
                    if (!cellsElement.getText().contains(openPage.getSelectGenre().getText())) {
                        System.out.println(cellsElement.getText());
                    }
                }

                //Clear list
                cellsElementsLists.clear();

                //Click
                String title = elements.getAttribute("title");
                if (title.equals("Следующая страница →")) {
                    elements.click();
                }
                title = null;
            } catch (Exception e) {
                elements = driver.findElement(By.xpath("//span[@class='p-inside']"));

                //Search quantity of cells
                List<WebElement> cellsElementsLists = driver.findElements(
                        By.xpath("//div[@class='events-block online-movies']/ul/li"));

                //Check Genre
                for (WebElement cellsElement: cellsElementsLists) {
                    if (!cellsElement.getText().contains(openPage.getSelectGenre().getText())) {
                        System.out.println(cellsElement.getText());
                    }
                }

                //Clear list
                cellsElementsLists.clear();

                break;
            }

        }

    }

}
