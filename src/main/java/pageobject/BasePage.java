package pageobject;

import managers.DriverActionManager;

/**
 * This is base page class that holds the common methods required by all the pages classes
 */
public class BasePage {

    /**
     * This method gets the title of the webpage
     * @return String
     */
    public String pageTitle(){
        return DriverActionManager.currentPageTitle();
    }

    /**
     * This method searches the string in the page source of the webpage
     * @param searchText
     * @return boolean
     */
    public boolean searchPageSource(String searchText){
        if(DriverActionManager.pageSource().contains(searchText)){
            return true;
        }else{
            return false;
        }
    }
}
