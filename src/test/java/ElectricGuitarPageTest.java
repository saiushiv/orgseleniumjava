import managers.PageManager;
import org.junit.Assert;
import org.junit.Test;
import pageobject.ElectricGuitarPage;

public class ElectricGuitarPageTest extends BaseTest{

    @Test
    public void verifyPageElementsArePresent(){
        ElectricGuitarPage epage = PageManager.getElectricGuitarPage();
        epage.navigateToElectricGuitarPage();
        Assert.assertTrue("Element Not Found - Beginner Kits",epage.searchPageSource("Beginner Kits"));
        Assert.assertTrue("Element Not Found - Hollow & Semi-Hollow Body",epage.searchPageSource("Hollow &amp; Semi-Hollow Body"));
        Assert.assertTrue("Element Not Found - Lap & Pedal Steel Guitars",epage.searchPageSource("Lap &amp; Pedal Steel Guitars"));
        Assert.assertTrue("Element Not Found - Solid Body",epage.searchPageSource("Solid Body"));
    }
}
