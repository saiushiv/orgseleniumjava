package pageobject;

import managers.DriverActionManager;
import managers.UIElementsManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This page class holds methods for the Musical Instruments product
 */
public class MusicalInstrumentsPage {
    private WebDriver driver;

    public MusicalInstrumentsPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean GotoGuitar(){
        try{
            String guitarLinkXpath = "//span[text()='Guitars']";
            WebElement pageLink = UIElementsManager.getByXpath(guitarLinkXpath);
            DriverActionManager.click(pageLink);
            return true;
        }catch (Exception e){
            throw e;
        }
    }
}
