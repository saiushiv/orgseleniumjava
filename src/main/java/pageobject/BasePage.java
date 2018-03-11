package pageobject;

import managers.DriverActionManager;

public class BasePage {

    public String pageTitle(){
        return DriverActionManager.currentPageTitle();
    }

    public boolean searchPageSource(String searchText){
        if(DriverActionManager.pageSource().contains(searchText)){
            return true;
        }else{
            return false;
        }
    }
}
