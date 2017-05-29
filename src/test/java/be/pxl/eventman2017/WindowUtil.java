package be.pxl.eventman2017;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class WindowUtil {
  public static void maximizeScreen(WebDriver driver) {
    WebDriver.Window window = driver.manage().window();
    window.setPosition(new Point(0, 0));
    window.setSize(new Dimension(1920, 1080));
  }
}
