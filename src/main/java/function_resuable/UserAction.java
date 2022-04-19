package function_resuable;


import browserLaunch.BrowserCommons;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class UserAction {


    // check page is present or not return and returns true or false
    public static boolean isElementPresent(By by) {
        try {
            // String by1=PropertyManager.getInstance().getIsElementPresent_Xpath();
            BrowserCommons.webDriver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {

            System.out.println("Locator(web element) is not present");
            return false;
        }
    }

    //  return website page title
    public static String getTitle() {
        return BrowserCommons.webDriver.getTitle();
    }


    public static boolean searchTextBox(By by) {

        if (isElementPresent(by)) {
            try {
                BrowserCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("search Text box present");
                return false;
            }
        } else
            System.out.println("search is not present");
        return false;
    }

    public static boolean searchButton(By by) {

        if (isElementPresent(by)) {
            try {
                BrowserCommons.webDriver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("search Text box present");
                return false;
            }
        } else
            System.out.println("search is not present");
        return false;
    }
}