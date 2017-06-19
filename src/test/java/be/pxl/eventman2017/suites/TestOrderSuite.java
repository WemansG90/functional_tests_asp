package be.pxl.eventman2017.suites;

import be.pxl.eventman2017.administrator.AdminCompanyOverviewPageClass;
import be.pxl.eventman2017.administrator.AdminCreateEventClass;
import be.pxl.eventman2017.administrator.AdminEventDetailPageClass;
import be.pxl.eventman2017.administrator.AdminEventOverviewPageClass;
import be.pxl.eventman2017.common.LandingPageClass;
import be.pxl.eventman2017.visitor.VisitorRegistrationPageClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LandingPageClass.class,
        AdminEventOverviewPageClass.class,
        AdminEventDetailPageClass.class,
        AdminCompanyOverviewPageClass.class,
        AdminCreateEventClass.class,
        VisitorRegistrationPageClass.class
})
public class TestOrderSuite {
    //Empty holder for annotations

}
