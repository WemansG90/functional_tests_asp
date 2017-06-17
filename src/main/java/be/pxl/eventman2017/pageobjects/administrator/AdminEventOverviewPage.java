package be.pxl.eventman2017.pageobjects.administrator;

import be.pxl.eventman2017.pageobjects.AbstractPage;
import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@PageObject
public class AdminEventOverviewPage extends AbstractPage{

    @FindBy(
            css = "div[ng-repeat*=upcoming]"
    )
    private List<WebElement> upcomingEventsList;

    @FindBy(
            css = "div[ng-repeat*=pastEvents]"
    )
    private List<WebElement> pastEventsList;

    @FindBy(
            css = "a[ng-click*=\"1\"] "
    )
    private WebElement upcomingEventsTab;

    @FindBy(
            css = "a[ng-click*=\"2\"] "
    )
    private WebElement pastEventsTab;

    @FindBy(
            css = "input[ng-model*='Upcoming']"
    )
    private WebElement upcomingSearch;

    @FindBy(
            css = "input[ng-model*='Past']"
    )
    private WebElement pastSearch;

    @FindBy(
            css= "button.add-event-button"
    )
    private WebElement createEventButton;

    public List<WebElement> getUpcomingEventsList() {
        return upcomingEventsList;
    }

    public List<WebElement> getPastEventsList() {
        return pastEventsList;
    }

    public WebElement getUpcomingEventsTab() {
        return upcomingEventsTab;
    }

    public WebElement getPastEventsTab() {
        return pastEventsTab;
    }

    public WebElement getUpcomingSearch() {
        return upcomingSearch;
    }

    public WebElement getPastSearch() {
        return pastSearch;
    }

    public WebElement getCreateEventButton() {
        return createEventButton;
    }

    @Override
    public String getContentPath() {
        return "/Event";
    }
}
