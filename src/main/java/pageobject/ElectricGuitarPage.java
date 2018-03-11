package pageobject;

import managers.DriverActionManager;
import org.openqa.selenium.WebDriver;

/**
 * This page class holds methods for the Electric Guitar product
 */
public class ElectricGuitarPage extends BasePage {
    private WebDriver driver;

    public ElectricGuitarPage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToElectricGuitarPage(){
        DriverActionManager.goTo("https://www.amazon.com/b/ref=lp_11971241_ln_0?node=11971381&ie=UTF8&qid=1520743672");
    }
}
