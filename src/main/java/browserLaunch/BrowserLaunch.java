package browserLaunch;


import datafile.Locators;
import datafile.SearchDetails;

public class BrowserLaunch {
    // @Test
    public static void launch() {
        BrowserCommons.launchBrowser("chrome");
        BrowserCommons.navigateUrl();
        BrowserCommons.windowMaximize();
        Locators.locators();
        SearchDetails.searchFirstItemDetails();

    }
}
