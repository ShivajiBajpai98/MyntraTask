package testCases;

import browserLaunch.BrowserLaunch;
import function_resuable.UserAction;
import org.testng.annotations.Test;
import verifySteps.VerifyTitle;

public class Test_Title {
    @Test
    void test() {
        BrowserLaunch.launch();
        String expectedTitle = UserAction.getTitle();
        System.out.println("Expected Title" + " : " + expectedTitle);
        VerifyTitle.verifyPageTitle(expectedTitle);
    }
}
