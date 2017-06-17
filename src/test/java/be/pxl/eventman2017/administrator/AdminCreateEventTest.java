package be.pxl.eventman2017.administrator;

import be.pxl.eventman2017.configuration.GuiceModule;
import be.pxl.eventman2017.pageobjects.administrator.AdminCreateEventDialog;
import be.pxl.eventman2017.pageobjects.administrator.AdminEventOverviewPage;
import be.pxl.eventman2017.pageobjects.common.EventDetailPage;
import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.TestRunner;
import com.google.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class AdminCreateEventTest extends AdminTestCase {

    @Inject
    private AdminEventOverviewPage adminEventOverviewPage;

    @Inject
    private EventDetailPage eventDetailPage;

    @Inject
    private AdminCreateEventDialog adminCreateEventDialog;
    private static Calendar staticCalendar = Calendar.getInstance();
    private static final String EVENT_NAME = "test-event" + new SimpleDateFormat("yy-MM-dd-hh-mm-ss").format(staticCalendar.getTime());
    private static final String EVENT_DATE = "2017-05-31" + new SimpleDateFormat("hh:mm").format(staticCalendar.getTime());

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        adminEventOverviewPage.getCreateEventButton().click();
    }

    @Test
    public void testThatEventCanBeCreated() {
        fillOutEventCreationFieldsHelper();
        adminCreateEventDialog.getSubmitButton().click();
        wait.until(ExpectedConditions.visibilityOf(eventDetailPage.getEventImage()));
        assertThat(eventDetailPage.getEventName().getAttribute("innerText"), is(EVENT_NAME));
    }

    @Test
    public void testThatEventCreationCanBeCancelled() {
        fillOutEventCreationFieldsHelper();
        adminCreateEventDialog.getCancelButton().click();
        assertThat(adminEventOverviewPage.getUpcomingEventsTab().isDisplayed(), is(true));
    }

    //Builder pattern would clean this up
    private void fillOutEventCreationFieldsHelper() {
        adminCreateEventDialog.getNameInput().sendKeys(EVENT_NAME);
        adminCreateEventDialog.getStartDateInput().sendKeys(EVENT_DATE);
        adminCreateEventDialog.getDescriptionInput().sendKeys("A Description");
        adminCreateEventDialog.getStreetInput().sendKeys("a Street");
        adminCreateEventDialog.getStreetNumberInput().sendKeys("666");
        adminCreateEventDialog.getZipCodeInput().sendKeys("0000");
        adminCreateEventDialog.getCityInput().sendKeys("a City");
        adminCreateEventDialog.getLocationInput().sendKeys("A Place");
    }
}
