import managers.PageManager;
import org.junit.Assert;
import org.junit.Test;
import pageobject.*;

public class HomePageTest extends BaseTest {

    @Test
    public void gotoHomePage(){
        HomePage homePage = PageManager.getHomePage();
        Assert.assertTrue(homePage.navigateToHome());
    }

    @Test
    public void HomePageTitle(){
        HomePage homePage = PageManager.getHomePage();
        homePage.navigateToHome();
        Assert.assertTrue(homePage.pageTitle().contains("Amazon.com"));
    }

    @Test
    public void loadProductPage(){
        HomePage homePage = PageManager.getHomePage();
        homePage.navigateToHome();
        Assert.assertTrue(homePage.navigateToSiteDirectory());
        SiteDirectory siteLink = PageManager.getSiteDirectoryPage();
        Assert.assertTrue(siteLink.GoToProductPage("Musical Instruments"));
        MusicalInstrumentsPage instrumentLink = PageManager.getMusicalInstrumentsPage();
        Assert.assertTrue(instrumentLink.GotoGuitar());
        GuitarsPage GuitarLink = PageManager.getGuitarsPage();
        Assert.assertTrue(GuitarLink.GoToElectriGuitar());
    }
}
