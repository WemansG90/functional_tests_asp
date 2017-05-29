package be.pxl.eventman2017.common;

import be.pxl.eventman2017.BobcatTestCase;
import be.pxl.eventman2017.GuiceModule;
import be.pxl.eventman2017.pageobjects.LandingPage;
import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.TestRunner;
import com.google.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import javax.inject.Named;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class LandingPageTest extends BobcatTestCase {

    @Inject
    private LandingPage landingPage;

    @Inject
    @Named("site.adminlogin")
    private String adminUsername;

    @Inject
    @Named("site.adminpassword")
    private String adminPassword;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        landingPage.open();
    }

    @Test
    public void testAdministratorLogin(){
        loginHelper(adminUsername,adminPassword);
        assertThat(driver.findElement(By.cssSelector("a[href=\"/Manage\"]")).getText(), is("Hello Admin Geoffrey!"));
    }

    @Test
    public void testLogout(){
        loginHelper(adminUsername,adminPassword);
        landingPage.getLogoutButton().click();
        assertThat(landingPage.getLoginButton().isDisplayed(), is(true));
    }

    private void loginHelper(String login, String password) {
        landingPage.getUserNameInput().sendKeys(login);
        landingPage.getPassWordInput().sendKeys(password);
        landingPage.getLoginButton().click();
    }


}
