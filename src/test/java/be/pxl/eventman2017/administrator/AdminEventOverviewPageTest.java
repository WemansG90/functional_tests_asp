package be.pxl.eventman2017.administrator;

import be.pxl.eventman2017.GuiceModule;
import be.pxl.eventman2017.pageobjects.administrator.AdminEventOverviewPage;
import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.TestRunner;
import com.google.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class AdminEventOverviewPageTest extends AdminTestCase {

    @Inject
    private AdminEventOverviewPage adminEventOverviewPage;

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
