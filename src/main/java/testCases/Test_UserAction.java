package testCases;

import browserLaunch.BrowserLaunch;
import datafile.Locators;
import function_resuable.UserAction;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_UserAction {

    @BeforeClass
    void launch() {
        BrowserLaunch.launch();
        // UserAction.isElementPresent(By.xpath());

    }


    @Test(priority = 1)
    void searchBox() {

        boolean text_Box_result = UserAction.searchTextBox(By.xpath(Locators.search_TextBox_Rel_Xpath));
        System.out.println("Text_Box_result :" + text_Box_result);
    }

    @Test(priority = 2)
    void searchButton() {
        boolean search_Button = UserAction.searchTextBox(By.xpath(Locators.search_Button));
        System.out.println("Search_button_result :" + search_Button);

    }
}