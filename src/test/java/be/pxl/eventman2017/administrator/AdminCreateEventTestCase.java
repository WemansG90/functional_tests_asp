package be.pxl.eventman2017.administrator;

import be.pxl.eventman2017.GuiceModule;
import be.pxl.eventman2017.pageobjects.administrator.AdminCreateEventDialog;
import be.pxl.eventman2017.pageobjects.administrator.AdminEventOverviewPage;
import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.TestRunner;
import com.google.inject.Inject;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class AdminCreateEventTestCase extends AdminTestCase {

    @Inject
    private AdminEventOverviewPage adminEventOverviewPage;

    @Inject
    private AdminCreateEventDialog adminCreateEventDialog;
}
