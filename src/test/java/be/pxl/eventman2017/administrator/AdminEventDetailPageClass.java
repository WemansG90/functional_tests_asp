package be.pxl.eventman2017.administrator;

import be.pxl.eventman2017.configuration.GuiceModule;
import be.pxl.eventman2017.pageobjects.common.EventDetailPage;
import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.TestRunner;
import com.google.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class AdminEventDetailPageClass extends AdminTestCase {

    @Inject
    private EventDetailPage eventDetailPage;

    private static final String EXPECTED_EVENT_DATE = "donderdag, 21 december 2017 21:00";

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        eventDetailPage.setSpecificPath(4);
        eventDetailPage.open();
    }

    @Test
    public void testThatEventDetailPageHasImage() {
        assertThat(eventDetailPage.getEventImage().isDisplayed(), is(true));
    }

    @Test
    public void testThatEventDetailPageHasName() {
        assertThat(eventDetailPage.getEventName().isDisplayed(), is(true));
    }

    @Test
    public void testThatEventDetailPageHasDateDetails() {
        assertThat(eventDetailPage.getEventDetails().get(0).getAttribute("innerText"), is(EXPECTED_EVENT_DATE));
    }

    @Test
    public void testThatEventDetailPageHasAddressDetails(){
        assertThat(eventDetailPage.getEventDetails().get(1).getAttribute("innerText"), is("C-Mine, C-Mine 10, 3600 Genk"));
    }


}
