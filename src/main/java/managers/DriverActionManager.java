package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


/**
 * This class holds the methods to perform various actions on the webpage using the selenium webdriver
 */
public class DriverActionManager{
    private static WebDriver driver = WebDriverManager.getDriver();
    private static int timeout = 20;

    /**
     * This method commands webdriver to perform click action on the webelement
     * @param w
     */
    public static void click(WebElement w){
        try{
            if(w.isDisplayed()){
                w.click();
            }else{
                (new WebDriverWait(driver,timeout))
                        .until(ExpectedConditions.elementToBeClickable(w));
            }
        }catch(Exception e){
            throw e;
        }
    }

    /**
     * This method commands webdriver to perform enterText on the webelement
     * @param w
     * @param s
     */
    public static ExpectedCondition<Boolean>enterText(WebElement w,String s){
        try{
            (new WebDriverWait(driver,timeout))
                        .until(ExpectedConditions.visibilityOf(w));
            w.sendKeys(s);
            return ExpectedConditions.textToBePresentInElementValue(w,s);
        }catch(Exception e){
            throw e;
        }
    }

    /**
     * This method commands webdriver to navigate to the given url
     * @param url
     */
    public static void goTo(String url){
        try{
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.navigate().to(url);
        }catch (Exception e){
            throw e;
        }
    }

    /**
     * This method commands webdriver to get the page source of the webpage
     *
     */
    public static String pageSource(){
        try{
            String source = driver.getPageSource();
            return source;
        }catch (Exception e){
            throw e;
        }
    }

    /**
     * This method commands webdriver to get the webpage title
     *
     */
    public static String currentPageTitle(){
        try{
            String title = driver.getTitle();
            return title;
        }catch (Exception e){
            throw e;
        }
    }

    /**
     * This method commands the driver to close all its instances and quit
     *
     */
    public static void quit(){
        driver.quit();
    }
}

