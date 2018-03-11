package pageobject;

import managers.WebDriverManager;
import managers.PageManager;

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
