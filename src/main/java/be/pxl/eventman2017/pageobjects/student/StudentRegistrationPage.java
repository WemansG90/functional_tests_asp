package be.pxl.eventman2017.pageobjects.student;

import be.pxl.eventman2017.pageobjects.AbstractPage;
import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class StudentRegistrationPage extends AbstractPage{

//    @FindBy()
//    private WebElement

    @Override
    public String getContentPath() {
        return "/registration?e=1";
    }
}
