package be.pxl.eventman2017.hooks;

import com.google.inject.Inject;
import cucumber.api.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

/**
 * A helper class that will maximize window
 */
public class WindowMaximize {

	@Inject
	private WebDriver webDriver;

	@Before
	public void maximize() {
    WebDriver.Window window = webDriver.manage().window();
    window.setPosition(new Point(0, 0));
    window.setSize(new Dimension(1920, 1080));
	}
}
