package pageobject;

import managers.WebDriverManager;
import managers.PageManager;

/**
 * This is the test context that helps in getting the webpage dynamically
 * STILL IN DEVELOPMENT
 */
public class TestContext {

    private WebDriverManager webDriverManager;
    private PageManager pageManager;

    public TestContext(){
        webDriverManager = new WebDriverManager();
       // pageManager = new PageManager(webDriverManager.getDriver());
    }

    public WebDriverManager getWebDriverManager() {
        return webDriverManager;
    }

    public PageManager getPageManager() {
        return pageManager;
    }
}
