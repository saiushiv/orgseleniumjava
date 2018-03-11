package pageobject;

import managers.DriverActionManager;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{
    private WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }
}
