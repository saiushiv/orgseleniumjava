package pageobject;

import managers.DriverActionManager;

/**
 * This is bas page class that holds the common methods required by all the pages classes
 */
public class BasePage {

    /**
     * This method gets the title of the webpage
     * @return
     */
    public String pageTitle(){
        return DriverActionManager.currentPageTitle();
    }

    /**
     * This method searches the string in the page source of the webpage
     * @param searchText
     * @return
     */
    public boolean searchPageSource(String searchText){
        if(DriverActionManager.pageSource().contains(searchText)){
            return true;
        }else{
            return false;
        }
    }
}
