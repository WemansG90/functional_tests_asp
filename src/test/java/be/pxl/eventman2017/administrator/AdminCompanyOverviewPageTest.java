package be.pxl.eventman2017.administrator;

import be.pxl.eventman2017.GuiceModule;
import be.pxl.eventman2017.pageobjects.administrator.AdminCompanyOverviewPage;
import com.cognifide.qa.bb.junit.Modules;
import com.cognifide.qa.bb.junit.TestRunner;
import com.google.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class AdminCompanyOverviewPageTest extends AdminTestCase {

    @Inject
    private AdminCompanyOverviewPage adminCompanyOverviewPage;

    private static final String SEARCHQUERY = "Bedrijf A";
    private static final List<String> EXPECTED_RESULTS = Arrays.asList(
            "1", "1", "Bedrijf A", "Informatietechnologie (IT)", "Informatietechnologie (IT)",
            "C-Mine", "10", "3600", "Genk", "C-Mine", "jonathan.stefanski@student.pxl.be", "011 11 11 11"
    );

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        adminCompanyOverviewPage.open();
    }

    @Test
    public void testThatDefaultTableContentIsCorrect(){
        assertThat(adminCompanyOverviewPage.getTableRows().size(), is(7));
    }

    @Test
    public void testThatSearchFiltersTable(){
        adminCompanyOverviewPage.getCompanySearchBox().sendKeys(SEARCHQUERY);
        WebElement resultRow = adminCompanyOverviewPage.getTableRows().get(1);
        assertThat(adminCompanyOverviewPage.getTableRowData(resultRow),is(EXPECTED_RESULTS));
    }

}
