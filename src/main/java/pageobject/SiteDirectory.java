package pageobject;

import managers.DriverActionManager;
import managers.UIElementsManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * This page class holds methods for the site directory page
 */

public class SiteDirectory {
    private WebDriver driver;

    public SiteDirectory(WebDriver driver){
        this.driver = driver;
    }

    public boolean GoToProductPage(String productName){
        try{
            WebElement pageLink = UIElementsManager.getByLinkText(productName);
            DriverActionManager.click(pageLink);
            return true;
        }catch (Exception e){
         throw e;
        }
    }

}
