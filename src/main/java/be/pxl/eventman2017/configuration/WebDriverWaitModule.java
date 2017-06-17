package be.pxl.eventman2017.configuration;

import com.google.inject.AbstractModule;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(WebDriverWait.class).toProvider(WebDriverWaitProvider.class);
  }
}
