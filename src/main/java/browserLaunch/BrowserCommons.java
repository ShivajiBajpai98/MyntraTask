// Adding a product in a cart.


package browserLaunch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import properties.PropertyManager;

public class BrowserCommons {
    public static WebDriver webDriver;


    // Launch the browser

    public static void launchBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver(firefoxOptions);
        } else if (browser.equalsIgnoreCase("Edge")) {

            WebDriverManager.edgedriver().setup();
            webDriver = new EdgeDriver();
        }

    }


    // Launch the website
    public static void navigateUrl() {
        String urls = PropertyManager.getInstance().getAppManageURL();
        webDriver.get(urls);
    }
    // Maximize the Window of website


    public static void windowMaximize() {
        webDriver.manage().window().maximize();
    }
    // exit from browser


    public static void exitBrowser() {
        webDriver.close();
    }

}

