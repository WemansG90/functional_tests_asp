package be.pxl.eventman2017.student;

import be.pxl.eventman2017.pageobjects.AbstractPage;
import com.cognifide.qa.bb.qualifier.PageObject;

@PageObject
public class StudentRegistrationPageTest extends AbstractPage {



    @Override
    public String getContentPath() {
        return "/registration?e=1";
    }
}
