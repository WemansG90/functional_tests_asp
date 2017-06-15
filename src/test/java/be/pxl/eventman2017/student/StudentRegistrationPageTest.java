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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(TestRunner.class)
@Modules(GuiceModule.class)
public class StudentRegistrationPageTest extends BobcatTestCase {

    @Inject
    private StudentRegistrationPage studentRegistrationPage;

    private static final List<String> SCHOOL_LIST = Arrays.asList("Hogeschool PXL", "Katholieke Hogeschool Limburg", "Universiteit Hasselt");
    private static final List<String> COURSE_LIST = Arrays.asList("IT Opleiding", "IT 2 Opleiding", "Lerarenopleiding");
    private static final String PROFILE_URL = "http://pxl.lepside.be/registration?e=1&r=e2b95ca5-1152-e711-80c2-0003ff433c1c";
    private static final List<String> TEST_PROFILE_DATA = Arrays.asList("Coffee", "Pot", "Not@Tea", "2324-7168", "HTCPCP", "2017 Jobs");

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        studentRegistrationPage.open();
    }

    @Test
    public void testThatFirstNameIsRequired() {
        assertThat(studentRegistrationPage.getFirstName().getAttribute("required"), is("true"));
    }

    @Test
    public void testThatLastNameIsRequired() {
        assertThat(studentRegistrationPage.getLastName().getAttribute("required"), is("true"));
    }

    @Test
    public void testThatEmailIsRequired() {
        assertThat(studentRegistrationPage.getEmailAddress().getAttribute("required"), is("true"));
    }

    @Test
    public void testThatEmailIsEmailField() {
        assertThat(studentRegistrationPage.getEmailAddress().getAttribute("type"), is("email"));
    }

    @Test
    public void testStudentSchoolsDropdown() {
        studentRegistrationPage.getStudentRadioButton().click();
        studentRegistrationPage.getSchoolDropDown().click();
        assertThat(getKendoDropDownOptions("ul[id=School_Id_listbox] li"), is(SCHOOL_LIST));
    }

    @Test
    public void testStudentCourseDropdown() {
        studentRegistrationPage.getStudentRadioButton().click();
        studentRegistrationPage.getCourseDropDown().click();
        assertThat(getKendoDropDownOptions("ul[id=Education_Id_listbox] li"), is(COURSE_LIST));
    }

    @Test
    public void testEmployedFunctionTextBoxIsPresent() {
        studentRegistrationPage.getProRadioButton().click();
        assertThat(studentRegistrationPage.getNonStudentInputLabel().getAttribute("innerText"), is("Functie"));
        assertThat(studentRegistrationPage.getNonStudentInputField().isDisplayed(), is(true));
    }

    @Test
    public void testOthersTextBoxIsPresent() {
        studentRegistrationPage.getOtherRadioButton().click();
        assertThat(studentRegistrationPage.getNonStudentInputLabel().getAttribute("innerText"), is("Omschrijving"));
        assertThat(studentRegistrationPage.getNonStudentInputField().isDisplayed(), is(true));
    }

    @Test
    public void testRegistrationPageUpdates() {
        registerStudentHelper("Jane", "Doe", "Jane@Doe");
        assertThat(studentRegistrationPage.getSubmitButton().getAttribute("innerText"), is("Update mijn gegevens"));
        assertThat(studentRegistrationPage.getKendoUploadWidget().isDisplayed(), is(true));
    }

    @Test
    public void testUniqueProfileUrl() {
        driver.get(PROFILE_URL);
        assertThat(getProfileData(), is(TEST_PROFILE_DATA));
    }

    private List<String> getProfileData() {
        List<String> profileInfo = Arrays.asList(
                studentRegistrationPage.getFirstName().getAttribute("value"),
                studentRegistrationPage.getLastName().getAttribute("value"),
                studentRegistrationPage.getEmailAddress().getAttribute("value"),
                studentRegistrationPage.getPhoneNumber().getAttribute("value"),
                studentRegistrationPage.getNonStudentInputField().getAttribute("value"),
                studentRegistrationPage.getEventName().getText()
        );
        return profileInfo;
    }

    private void registerStudentHelper(String firstName, String lastName, String email) {
        studentRegistrationPage.getFirstName().sendKeys(firstName);
        studentRegistrationPage.getLastName().sendKeys(lastName);
        studentRegistrationPage.getEmailAddress().sendKeys(email);
        studentRegistrationPage.getSubmitButton().click();
    }

    private List<String> getKendoDropDownOptions(String selector) {
        List<WebElement> options = driver.findElements(By.cssSelector(selector));
        List<String> optionText = new ArrayList<String>();
        for (WebElement o : options) {
            optionText.add(o.getAttribute("innerText"));
        }
        return optionText;
    }

}
