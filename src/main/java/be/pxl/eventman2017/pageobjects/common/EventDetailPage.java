package be.pxl.eventman2017.pageobjects.common;

import be.pxl.eventman2017.pageobjects.AbstractPage;
import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@PageObject
public class EventDetailPage extends AbstractPage{

    @FindBy(
            css="img[id=eventLogo]"
    )
    private WebElement eventImage;

    @FindBy(
            css="div h3"
    )
    private WebElement eventName;

    @FindBy(
            css="div p"
    )
    private List<WebElement> eventDetails;

    @FindBy(
            css="span[id=editEvent]"
    )
    private WebElement editEventButton;

    @FindBy(
            css="span[id=removeEvent]"
    )
    private WebElement removeEventButton;

    @FindBy(
            css="span[id=uploadcsv]"
    )
    private WebElement uploadCSVButton;


    private static String specificPath;

    public WebElement getEventImage() {
        return eventImage;
    }

    public WebElement getEventName() {
        return eventName;
    }

    public List<WebElement> getEventDetails() {
        return eventDetails;
    }

    public WebElement getEditEventButton() {
        return editEventButton;
    }

    public WebElement getRemoveEventButton() {
        return removeEventButton;
    }

    public WebElement getUploadCSVButton() {
        return uploadCSVButton;
    }

    public void setSpecificPath(int eventID){
        specificPath = "/Event/Event?id=" + eventID;
    }

    @Override
    public String getContentPath() {
        return specificPath;
    }
}
