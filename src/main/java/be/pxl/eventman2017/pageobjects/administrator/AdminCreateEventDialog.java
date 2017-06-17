package be.pxl.eventman2017.pageobjects.administrator;

import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class AdminCreateEventDialog {

    @FindBy(
            css= "div input[id=Name]"
    )
    private WebElement nameInput;

    @FindBy(
            css= "div input[id=StartDate]"
    )
    private WebElement startDateInput;

    @FindBy(
            css= "div textarea[id=Description]"
    )
    private WebElement descriptionInput;

    @FindBy(
            css= "div input[id=Address_Street]"
    )
    private WebElement streetInput;

    @FindBy(
            css= "div input[id=Address_Number]"
    )
    private WebElement streetNumberInput;

    @FindBy(
            css= "div input[id=Address_Zip]"
    )
    private WebElement zipCodeInput;

    @FindBy(
            css= "div input[id=Address_City]"
    )
    private WebElement cityInput;

    @FindBy(
            css= "div input[id=Address_LocationName]"
    )
    private WebElement locationInput;

    @FindBy(
            css="div span.k-input"
    )
    private WebElement eventTypeDropdown;

    @FindBy(
            css="div button[id=eventSubmitBtn]"
    )
    private WebElement submitButton;

    @FindBy(
            css="div button.btn-default"
    )
    private WebElement cancelButton;

    public WebElement getNameInput() {
        return nameInput;
    }

    public WebElement getStartDateInput() {
        return startDateInput;
    }

    public WebElement getDescriptionInput() {
        return descriptionInput;
    }

    public WebElement getStreetInput() {
        return streetInput;
    }

    public WebElement getStreetNumberInput() {
        return streetNumberInput;
    }

    public WebElement getZipCodeInput() {
        return zipCodeInput;
    }

    public WebElement getCityInput() {
        return cityInput;
    }

    public WebElement getLocationInput() {
        return locationInput;
    }

    public WebElement getEventTypeDropdown() {
        return eventTypeDropdown;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getCancelButton() {
        return cancelButton;
    }
}
