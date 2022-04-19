package testCases;

import browserLaunch.BrowserLaunch;
import datafile.Locators;
import datafile.SearchDetails;
import operations.SearchFirstItemAndAddToCart;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_SearchFirstItemAndAddToCart {

    @BeforeClass
    void browser() {
        BrowserLaunch.launch();
    }

    @Test(priority = 1)
    void searchItem() {

        SearchFirstItemAndAddToCart.searchFirstItem(By.xpath(Locators.search_TextBox_Rel_Xpath), SearchDetails.first_Name);

        // SearchFirstItemAndAddToCart.selectSize();

    }

    @Test(priority = 2)
    void clickItem() throws InterruptedException {
        SearchFirstItemAndAddToCart.clickItem(By.xpath(Locators.click_Item));


    }

 @Test(priority = 3, enabled = false)
    void selectSize() throws InterruptedException {

        SearchFirstItemAndAddToCart.selectSize(By.xpath(Locators.select_Size));
    }


    @Test(priority = 4)
    void addToCart()
    {
        SearchFirstItemAndAddToCart.addToCart(By.xpath(Locators.add_Cart));

    }

    @Test(priority = 5)
    void viewCart()
    {
        SearchFirstItemAndAddToCart.viewCart(By.xpath(Locators.view_cart));
    }
}
