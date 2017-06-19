package be.pxl.eventman2017.administrator;

import be.pxl.eventman2017.configuration.GuiceModule;
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
public class AdminEventOverviewPageClass extends AdminTestCase {

    @Inject
    private AdminEventOverviewPage adminEventOverviewPage;

    @Test
    public void testUpcomingEventListVisibleByDefault(){
        int eventSize = adminEventOverviewPage.getUpcomingEventsList().size();
        assertThat(eventSize,is(3));
    }

    @Test
    public void testChangeToPastEvents(){
        adminEventOverviewPage.getPastEventsTab().click();
        int eventSize = adminEventOverviewPage.getPastEventsList().size();
        assertThat(eventSize, is(1));
    }

    @Test
    public void testUpcomingEventSearch() {
        adminEventOverviewPage.getUpcomingSearch().sendKeys("christmas");
        String eventTitle = driver.findElement(By.cssSelector("div[ng-repeat*='upcoming'] h3.ng-binding")).getText();
        assertThat(eventTitle, is("Christmas Party"));
    }

    @Test
    public void testIfCreateEventButtonIsVisible(){
        assertThat(adminEventOverviewPage.getCreateEventButton().isDisplayed(),is(true));
    }


}
