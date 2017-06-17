package be.pxl.eventman2017.suites;

import be.pxl.eventman2017.administrator.AdminCreateEventTest;
import be.pxl.eventman2017.administrator.AdminEventDetailPageTest;
import be.pxl.eventman2017.administrator.AdminEventOverviewPageTest;
import be.pxl.eventman2017.common.LandingPageTest;
import be.pxl.eventman2017.pageobjects.administrator.AdminCompanyOverviewPage;
import be.pxl.eventman2017.student.StudentRegistrationPageTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LandingPageTest.class,
        AdminEventOverviewPageTest.class,
        AdminEventDetailPageTest.class,
        AdminCreateEventTest.class,
        AdminCompanyOverviewPage.class,
        StudentRegistrationPageTest.class
})
public class TestOrderSuite {
    //Empty holder for annotations

}
