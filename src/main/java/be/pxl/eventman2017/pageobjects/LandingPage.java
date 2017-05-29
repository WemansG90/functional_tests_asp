package be.pxl.eventman2017.pageobjects;

import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class LandingPage extends AbstractPage{

    @FindBy(
            css = "#Email"
    )
    private WebElement userName;

    @FindBy(
            css = "#Password"
    )
    private WebElement passWord;

    @FindBy(
            css = "input.btn"
    )
    private WebElement loginButton;

    @FindBy(
            css = "a[href*=logoutForm]"
    )
    private WebElement logoutButton;

    public WebElement getUserNameInput() {
        return userName;
    }

    public WebElement getPassWordInput() {
        return passWord;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    @Override
    public String getContentPath() {
        return "";
    }

}
