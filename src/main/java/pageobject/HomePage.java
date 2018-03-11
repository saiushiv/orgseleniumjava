package pageobject;

import managers.DriverActionManager;
import managers.UIElementsManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public boolean navigateToHome(){
        try{
            DriverActionManager.goTo("https://www.amazon.com/");
            return true;
        }catch (Exception e){
            throw e;
        }
    }

    public void searchProduct(String productName){
        try{
            WebElement searchTxtBox = UIElementsManager.getById("twotabsearchtextbox");
            DriverActionManager.enterText(searchTxtBox,productName);
            WebElement searchButton = UIElementsManager.getByClass("nav-input");
            DriverActionManager.click(searchButton);
        }catch (Exception e){
            throw e;
        }
    }

    public boolean navigateToSiteDirectory(){
        try{
            WebElement pageLink = UIElementsManager.getByClass("nav-line-2");
            DriverActionManager.click(pageLink);
            return true;
        }catch (Exception e){
            throw e;
        }
    }
}
