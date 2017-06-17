package be.pxl.eventman2017.suites;

import be.pxl.eventman2017.administrator.AdminCompanyOverviewPageTest;
import be.pxl.eventman2017.administrator.AdminEventDetailPageTest;
import be.pxl.eventman2017.administrator.AdminEventOverviewPageTest;
import be.pxl.eventman2017.common.LandingPageTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LandingPageTest.class,
        AdminEventOverviewPageTest.class,
        AdminEventDetailPageTest.class,
        AdminCompanyOverviewPageTest.class,
})
public class PreContentCreationSuite {
    //Empty holder for annotations
}
