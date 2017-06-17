package be.pxl.eventman2017.suites;

import be.pxl.eventman2017.administrator.AdminCreateEventTest;
import be.pxl.eventman2017.student.StudentRegistrationPageTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdminCreateEventTest.class,
        StudentRegistrationPageTest.class
})
public class PostContentCreationSuite {
    //Empty holder for annotations
}
