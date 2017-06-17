package be.pxl.eventman2017.configuration;

import com.cognifide.qa.bb.provider.selenium.webdriver.WebDriverProvider;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.inject.Inject;
import javax.inject.Provider;

public class WebDriverWaitProvider implements Provider<WebDriverWait> {

  private WebDriverWait webDriverWait;

  @Inject
  public WebDriverWaitProvider(WebDriverProvider webDriverProvider) {
    webDriverWait = new WebDriverWait(webDriverProvider.get(), 60, 1000);
  }

  @Override
  public WebDriverWait get() {
    return webDriverWait;
  }
}
