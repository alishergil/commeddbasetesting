package meddbase.pages;

import meddbase.DriverFactory;

public class HomePage extends DriverFactory {

    //homepageUrl
    public String getHomePageUrl() {
        return driver.getCurrentUrl();
    }

}
