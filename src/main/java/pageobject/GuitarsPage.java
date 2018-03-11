package pageobject;

import managers.DriverActionManager;
import managers.UIElementsManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This page class holds methods for the Guitar product
 */
public class GuitarsPage {
    private WebDriver driver;

    public GuitarsPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean GoToElectriGuitar(){
        try{
            String guitarLinkXpath = "//span[text()='Electric Guitars']";
            WebElement pageLink = UIElementsManager.getByXpath(guitarLinkXpath);
            DriverActionManager.click(pageLink);
            return true;
        }catch (Exception e){
            throw e;
        }
    }
}
