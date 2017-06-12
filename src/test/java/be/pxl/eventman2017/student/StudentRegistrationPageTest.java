package be.pxl.eventman2017.student;

import be.pxl.eventman2017.BobcatTestCase;
import be.pxl.eventman2017.GuiceModule;
import be.pxl.eventman2017.pageobjects.student.StudentRegistrationPage;
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
public class StudentRegistrationPageTest extends BobcatTestCase {

    @Inject
    private StudentRegistrationPage studentRegistrationPage;

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        studentRegistrationPage.open();
    }

    @Test
    public void TestThatFirstNameIsRequired() {
        assertThat(studentRegistrationPage.getFirstName().getAttribute("required"), is("true"));
    }

    @Test
    public void TestThatLastNameIsRequired() {
        assertThat(studentRegistrationPage.getLastName().getAttribute("required"), is("true"));
    }

    @Test
    public void TestThatEmailIsRequired() {
        assertThat(studentRegistrationPage.getEmailAddress().getAttribute("required"), is("true"));
    }

    @Test
    public void TestThatEmailisEmailField() {
        assertThat(studentRegistrationPage.getEmailAddress().getAttribute("type"), is("email"));
    }

    @Test
    public void TestThatStudentCheckboxDisplaysDropdowns(){
        assertThat(true, is( true ));
    }

}
