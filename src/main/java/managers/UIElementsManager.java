package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class UIElementsManager {
    private static WebDriver driver = WebDriverManager.getDriver();
    private static int timeout = 20;

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
