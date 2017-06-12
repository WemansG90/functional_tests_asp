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

import javax.inject.Named;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class LandingPageTest extends BobcatTestCase {

    @Inject
    private LandingPage landingPage;

    @Inject
    @Named("site.adminlogin")
    private String adminLogin;

    @Inject
    @Named("site.adminpassword")
    private String adminPassword;

    @Inject
    @Named("site.companylogin")
    private String companyLogin;

    @Inject
    @Named("site.companypassword")
    private String companyPassword;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        landingPage.open();
    }

    @Test
    public void testAdministratorLogin(){
        landingPage.loginHelper(adminLogin,adminPassword);
        assertThat(landingPage.getAccountManagementButton().getText(), is("Hallo Admin Geoffrey!"));
    }

    @Test
    public void testCompanyLogin(){
        landingPage.loginHelper(companyLogin, companyPassword);
        assertThat(landingPage.getAccountManagementButton().getText(), is("Hallo Bedrijf A!"));
    }

    @Test
    public void testLogout(){
        landingPage.loginHelper(adminLogin,adminPassword);
        landingPage.getLogoutButton().click();
        assertThat(landingPage.getLoginButton().isDisplayed(), is(true));
    }

}
