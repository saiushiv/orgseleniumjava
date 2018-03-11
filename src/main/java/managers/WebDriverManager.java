package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * This class initializes the webdriver
 */
public class WebDriverManager {
    private static WebDriver driver;

    /**
     * This method sets the conditions for initializing the webdriver
     * @param type defines which driver to pick,whether chrome or firefox or ie
     * @param path location of the webdriver on the computer
     * @return WebDriver to be used
     */
    public static WebDriver startDriver(String type,String path){
        String pkg = new String();
        try{
            switch (type.toLowerCase()){
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--disable-infobars");
                    chromeOptions.addArguments("--start-maximized");
                    chromeOptions.addArguments("--incognito");
                    pkg = "webdriver.chrome.driver";
                    System.setProperty(pkg,path);
                    driver = new ChromeDriver(chromeOptions);

                    break;
                case "firefox":
                    break;
            }
        }catch (Exception e)
        {
            throw e;
        }
        return driver;
    }

    /**
     * Public getter method to get the instance of the driver
     * @return
     */
    public static WebDriver getDriver() {
        return driver;
    }
}
