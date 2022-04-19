package operations;


import browserLaunch.BrowserCommons;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class SearchFirstItemAndAddToCart {


    public static void searchFirstItem(By by, String firstItem) {
        BrowserCommons.webDriver.findElement(by).clear();
        BrowserCommons.webDriver.findElement(by).sendKeys(firstItem);
        BrowserCommons.webDriver.findElement(By.xpath("//header/div[2]/div[3]/a[1]")).click();
    }

    public static void clickItem(By by) throws InterruptedException {
        BrowserCommons.webDriver.findElement(by).click();

        // Thread.sleep(20000);

        String url = BrowserCommons.webDriver.getCurrentUrl();
        System.out.println(url);


        String tab = BrowserCommons.webDriver.getWindowHandle();
        // System.out.println(tab);


        Set<String> tabs = BrowserCommons.webDriver.getWindowHandles();
        System.out.println(tabs);

        Iterator<String> iterator = tabs.iterator();
        String parentTab = iterator.next();
        String childTab = iterator.next();

        BrowserCommons.webDriver.switchTo().window(childTab);

        Thread.sleep(20000);
        // BrowserCommons.webDriver.findElement(By.xpath("//body/div[@id='mountRoot']/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[4]/div[1]/div[1]")).click();


      //  BrowserCommons.webDriver.findElement(By.xpath("//span[contains(text(),'Bag')]")).click();


    }

    public static void selectSize( By by) throws InterruptedException {
        Thread.sleep(20000);
        BrowserCommons.webDriver.findElement(by).click();

        // List<WebElement> elements = BrowserCommons.webDriver.findElements(By.xpath("//body/div[@id='mountRoot']/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[2]/div[2]/div[*]"));
        // System.out.println("Number of elements:" +elements.size());

        // for (int i=0; i<elements.size();i++){
        //System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
        //  }
    }

    public static void addToCart(By by) {

        // WebDriverWait wait=new WebDriverWait(BrowserCommons.webDriver,30);


        // Wait till the element is not visible

        // WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[3]/div[1]/div[1]")));

        BrowserCommons.webDriver.findElement(by).click();
    }
 public static  void  viewCart(By by)
 {
     BrowserCommons.webDriver.findElement(by).click();

 }
}
