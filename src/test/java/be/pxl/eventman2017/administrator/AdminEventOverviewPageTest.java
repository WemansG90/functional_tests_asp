package be.pxl.eventman2017.administrator;

import be.pxl.eventman2017.BobcatTestCase;
import be.pxl.eventman2017.GuiceModule;
import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.TestRunner;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class AdminEventOverviewPageTest extends BobcatTestCase {

}
