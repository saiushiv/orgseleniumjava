package managers;

import org.openqa.selenium.WebDriver;
import pageobject.*;

/**
 * This class is responsible for creating objects of the respective pages
 */
public class PageManager {
    private static WebDriver driver;
    private static HomePage homePage;
    private static ElectricGuitarPage electricGuitarPage;
    private static SiteDirectory siteDirectory;
    private static SearchPage searchPage;
    private static MusicalInstrumentsPage musicalInstrumentsPage;
    private static GuitarsPage guitarsPage;

    public PageManager(WebDriverManager driver){
        this.driver = driver.getDriver();
    }

    public static HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public static ElectricGuitarPage getElectricGuitarPage(){
        return (electricGuitarPage == null) ? electricGuitarPage = new ElectricGuitarPage(driver) : electricGuitarPage;
    }

    public static SearchPage getSearchPage(){
        return (searchPage == null) ? searchPage = new SearchPage(driver) : searchPage;
    }

    public static SiteDirectory getSiteDirectoryPage(){
        return (siteDirectory == null) ? siteDirectory = new SiteDirectory(driver) : siteDirectory;
    }

    public static MusicalInstrumentsPage getMusicalInstrumentsPage(){
        return (musicalInstrumentsPage == null) ? musicalInstrumentsPage = new MusicalInstrumentsPage(driver) : musicalInstrumentsPage;
    }

    public static GuitarsPage getGuitarsPage(){
        return (guitarsPage == null) ? guitarsPage = new GuitarsPage(driver) : guitarsPage;
    }
}
