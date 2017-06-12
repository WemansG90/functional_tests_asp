package be.pxl.eventman2017.pageobjects.student;

import be.pxl.eventman2017.pageobjects.AbstractPage;
import com.cognifide.qa.bb.qualifier.PageObject;
import com.sun.jna.platform.win32.WinNT;
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
            css="button[type= 'submit'] "
    )
    private WebElement submitButton;

    @Override
    public String getContentPath() {
        return "/registration?e=1";
    }
}
