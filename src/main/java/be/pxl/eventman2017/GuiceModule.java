package be.pxl.eventman2017;

import com.cognifide.qa.bb.logging.ReporterModule;
import com.cognifide.qa.bb.modules.CoreModule;
import com.google.inject.AbstractModule;

/**
 * Your Guice module.
 * <p/>
 * The two modules that are installed here are probably the minimum that you'll want to have in your
 * project.
 * <p/>
 * CoreModule -- all core functionality, like scope PageObjects or FrameSwitcher. ReporterModule --
 * reporting functionality, including reporting rule and HTML report.
 */
public class GuiceModule extends AbstractModule {
  @Override
  protected void configure() {
    if (System.getProperty("configuration.paths") == null) {
      System.setProperty("configuration.paths", "src/main/config/local;src/main/config/common");
    }
    install(new CoreModule());
    install(new ReporterModule());
  }
}
