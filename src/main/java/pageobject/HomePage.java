package pageobject;

import managers.DriverActionManager;
import managers.UIElementsManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This class holds the methods to manipulate the Amazon.com homepage
 */
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

    /**
     * This method searches product using the search bar on the home page
     * @param productName
     */
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
            String directoryLinkXpath = "//span[text()='Departments']";
            WebElement pageLink = UIElementsManager.getByXpath(directoryLinkXpath);
            DriverActionManager.click(pageLink);
            return true;
        }catch (Exception e){
            throw e;
        }
    }
}
