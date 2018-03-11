package pageobject;

import managers.DriverActionManager;
import org.openqa.selenium.WebDriver;

/**
 * This page class holds methods for the search page that loads with the results for the searches keyword
 */

public class SearchPage extends BasePage{
    private WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }
}
