package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }
}
