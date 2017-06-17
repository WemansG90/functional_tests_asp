package be.pxl.eventman2017.administrator;

import be.pxl.eventman2017.BobcatTestCase;
import be.pxl.eventman2017.GuiceModule;
import be.pxl.eventman2017.pageobjects.LandingPage;
import com.cognifide.qa.bb.junit.Modules;
import com.google.inject.Inject;
import org.junit.Before;

import javax.inject.Named;


@Modules(GuiceModule.class)
public abstract class AdminTestCase extends BobcatTestCase {

    @Inject
    @Named("site.adminlogin")
    private String adminUsername;

    @Inject
    @Named("site.adminpassword")
    private String adminPassword;

    @Inject
    private LandingPage landingPage;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        landingPage.open();
        landingPage.loginHelper(adminUsername,adminPassword);
    }

}
