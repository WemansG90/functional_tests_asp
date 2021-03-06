package be.pxl.eventman2017.pageobjects.student;

import be.pxl.eventman2017.pageobjects.AbstractPage;
import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@PageObject
public class StudentRegistrationPage extends AbstractPage{

    @FindBy(
            id = "FirstName"
    )
    private WebElement firstName;

    @FindBy(
            id="LastName"
    )
    private WebElement lastName;

    @FindBy(
            id="Email"
    )
    private WebElement emailAddress;

    @FindBy(
            id = "PhoneNumber"
    )
    private WebElement phoneNumber;

    @FindBy(
            css = "input[value='Student']"
    )
    private WebElement studentRadioButton;

    @FindBy(
            css = "input[value='Professional']"
    )
    private WebElement proRadioButton;

    @FindBy(
            css = "input[value='Other']"
    )
    private WebElement otherRadioButton;

    @FindBy(
            css ="span[aria-owns='School_Id_listbox']"
    )
    private WebElement schoolDropDown;

    @FindBy(
            css="span[aria-owns='Education_Id_listbox']"
    )
    private WebElement courseDropDown;

    @FindBy(
            css = "div[class=type-not-visitor] label"
    )
    private WebElement nonStudentInputLabel;

    @FindBy(
            css="input[id='Function']"
    )
    private WebElement nonStudentInputField;

    @FindBy(
            css="button[type= 'submit'] "
    )
    private WebElement submitButton;

    @FindBy(
            css = "div[class~='k-upload']"
    )
    private WebElement kendoUploadWidget;

    @FindBy(
            css = "div[class~='event-title']"
    )
    private WebElement eventName;


    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmailAddress() {
        return emailAddress;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getStudentRadioButton() {
        return studentRadioButton;
    }

    public WebElement getProRadioButton() {
        return proRadioButton;
    }

    public WebElement getOtherRadioButton() {
        return otherRadioButton;
    }

    public WebElement getSchoolDropDown() {
        return schoolDropDown;
    }

    public WebElement getCourseDropDown() {
        return courseDropDown;
    }

    public WebElement getNonStudentInputField() {
        return nonStudentInputField;
    }

    public WebElement getNonStudentInputLabel() {
        return nonStudentInputLabel;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getKendoUploadWidget() {
        return kendoUploadWidget;
    }

    public WebElement getEventName() {
        return eventName;
    }

    @Override
    public String getContentPath() {
        return "registration?e=1";
    }
}
