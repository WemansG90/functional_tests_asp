package be.pxl.eventman2017;

import com.cognifide.qa.bb.qualifier.PageObject;
import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@PageObject
public class ElementFinder {

  @Inject
  private WebDriver webDriver;

  @Inject
  private WebDriverWait wait;

  public Optional<WebElement> findElementByCssSelector(final String cssSelector) {
    return Optional.ofNullable(wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssSelector))));
  }

  public Optional<WebElement> findElementByXpath(final String xpath) {
    return Optional.ofNullable(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))));
  }

  public boolean checkIfElementIsPresentWithoutTimeout(By locator) {
    try {
      wait.withTimeout(0, TimeUnit.SECONDS).until(ExpectedConditions.presenceOfElementLocated(locator));
      return true;
    } catch(TimeoutException ignored) {
      return false;
    }
  }
  public WebDriver getWebDriver() {
    return webDriver;
  }

  public void setWebDriver(WebDriver webDriver) {
    this.webDriver = webDriver;
  }
}
