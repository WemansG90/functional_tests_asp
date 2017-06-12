package be.pxl.eventman2017.administrator;

import be.pxl.eventman2017.BobcatTestCase;
import be.pxl.eventman2017.GuiceModule;
import be.pxl.eventman2017.pageobjects.LandingPage;
import be.pxl.eventman2017.pageobjects.administrator.AdminEventOverviewPage;
import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.TestRunner;
import com.google.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import javax.inject.Named;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class AdminEventOverviewPageTest extends BobcatTestCase {

    @Inject
    private LandingPage landingPage;

    @Inject
    private AdminEventOverviewPage adminEventOverviewPage;

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
        landingPage.loginHelper(adminUsername,adminPassword);
    }

    @Test
    public void testUpcomingEventListVisibleByDefault() throws Exception{
        int eventSize = adminEventOverviewPage.getUpcomingEventsList().size();
        assertThat(eventSize,is(4));
    }

    @Test
    public void testChangeToPastEvents()throws Exception{
        adminEventOverviewPage.getPastEventsTab().click();
        int eventSize = adminEventOverviewPage.getPastEventsList().size();
        assertThat(eventSize, is(1));
    }

    @Test
    public void testUpcomingEventSearch() throws Exception{
        adminEventOverviewPage.getUpcommingSearch().sendKeys("christmas");
        String eventTitle = driver.findElement(By.cssSelector("div[ng-repeat*='upcoming'] h3.ng-binding")).getText();
        assertThat(eventTitle, is("Christmas Party"));
    }


}
