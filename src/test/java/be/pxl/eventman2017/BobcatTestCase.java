package be.pxl.eventman2017;

import com.cognifide.qa.bb.junit.Modules;
import com.google.inject.Inject;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;

@Modules(GuiceModule.class)
public abstract class BobcatTestCase {

  @Inject
  protected WebDriver driver;

  @Rule
  public TestRule watcher = new TestWatcher() {
    protected void starting(Description description) {
      System.out.println("Starting test: " + description.getMethodName());
    }
  };

  @Before
  public void setUp() throws Exception {
    WindowUtil.maximizeScreen(driver);
  }
}
