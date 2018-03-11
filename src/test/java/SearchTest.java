import managers.PageManager;
import org.junit.Assert;
import org.junit.Test;
import pageobject.ElectricGuitarPage;
import pageobject.HomePage;
import pageobject.SearchPage;

public class SearchTest extends BaseTest{

    @Test
    public void useSearchBar(){
        HomePage homePage = PageManager.getHomePage();
        homePage.navigateToHome();
        homePage.searchProduct("Electric Guitar");
        SearchPage sPage = PageManager.getSearchPage();
        Assert.assertTrue("Not the right search page",sPage.pageTitle().contains("Electric Guitar"));
    }

    @Test
    public void verifySearchReturnRightResult(){
        HomePage homePage = PageManager.getHomePage();
        homePage.navigateToHome();
        homePage.searchProduct("Electric Guitar");
        SearchPage sPage = PageManager.getSearchPage();
        Assert.assertTrue("Not the right search page",sPage.searchPageSource("Full Size Blue Electric Guitar with Amp, Case and Accessories Pack Beginner Starter Package"));
        ElectricGuitarPage epage = PageManager.getElectricGuitarPage();
        epage.navigateToElectricGuitarPage();
        Assert.assertTrue("Search result and Page Items do no match",epage.searchPageSource("Full Size Blue Electric Guitar with Amp, Case and Accessories Pack Beginner Starter Package"));
    }
}
