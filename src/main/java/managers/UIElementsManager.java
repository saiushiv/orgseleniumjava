package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

/**
 * This class holds the methods to perform various actions to control and get access of the UI elements
 * on the webpage using the selenium webdriver
 */
public class UIElementsManager {
    private static WebDriver driver = WebDriverManager.getDriver();
    private static int timeout = 20;

    /**
     * Access the webelement using its id
     * @param id
     * @return
     */
    public static WebElement getById(String id){
        WebElement element = null;
        try{

            (new WebDriverWait(driver,timeout))
                        .until(ExpectedConditions.visibilityOf(driver.findElement(By.id(id))));
            element = driver.findElement(By.id(id));
        }catch(Exception e){
            throw e;
        }
        return element;
    }

    /**
     * Access the webelement using its class
     * @param cl
     * @return
     */
    public static WebElement getByClass(String cl){
        WebElement element = null;
        try{
            (new WebDriverWait(driver,timeout))
                    .until(ExpectedConditions.visibilityOf(driver.findElement(By.className(cl))));
            element = driver.findElement(By.className(cl));
        }catch(Exception e){
            throw e;
        }
        return element;
    }

    /**
     * Access the webelement using its hyper link text
     * @param linkText
     * @return
     */
    public static WebElement getByLinkText(String linkText){
        WebElement element = null;
        try{
            (new WebDriverWait(driver,timeout))
                    .until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(linkText))));
            element = driver.findElement(By.linkText(linkText));
        }catch(Exception e){
            throw e;
        }
        return element;
    }

    /**
     * Access the webelement using its xpath
     * @param xpath
     * @return
     */
    public static WebElement getByXpath(String xpath){
        WebElement element = null;
        try{
            (new WebDriverWait(driver,timeout))
                    .until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
            element = driver.findElement(By.xpath(xpath));
        }catch(Exception e){
            throw e;
        }
        return element;
    }
}
