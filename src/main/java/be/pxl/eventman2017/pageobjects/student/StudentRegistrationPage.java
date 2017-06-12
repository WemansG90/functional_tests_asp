package be.pxl.eventman2017.pageobjects.student;

import be.pxl.eventman2017.pageobjects.AbstractPage;
import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


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
            id ="School_Id_listbox"
    )
    private Select schoolDropDown;

    @FindBy(
            id="Education_Id_listbox"
    )
    private Select educationDropDown;

    @FindBy(
            css="input[id='Function']"
    )
    private WebElement functionField;

    @FindBy(
            css="button[type= 'submit'] "
    )
    private WebElement submitButton;

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

    public Select getSchoolDropDown() {
        return schoolDropDown;
    }

    public Select getEducationDropDown() {
        return educationDropDown;
    }

    public WebElement getFunctionField() {
        return functionField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    @Override
    public String getContentPath() {
        return "registration?e=1";
    }
}
