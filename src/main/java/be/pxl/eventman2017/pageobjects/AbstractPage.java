package be.pxl.eventman2017.pageobjects;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    @Inject
    @Named("site.url")
    private String siteUrl;
    @Inject
    private WebDriver webDriver;

    public AbstractPage() {
    }

    public abstract String getContentPath();

    public void open() {
        this.webDriver.get(this.getFullUrl());
    }

    public String getFullUrl() {return this.siteUrl + this.getContentPath();
    }

}
