package be.pxl.eventman2017.pageobjects.administrator;

import be.pxl.eventman2017.pageobjects.AbstractPage;
import com.cognifide.qa.bb.qualifier.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


@PageObject
public class AdminCompanyOverviewPage extends AbstractPage {

    @FindBy(
            css = "input[id=searchbox]"
    )
    private WebElement companySearchBox;

    @FindBy(
            css = "tr[role=row]"
    )
    private List<WebElement> tableRows;

    public WebElement getCompanySearchBox() {
        return companySearchBox;
    }

    public List<WebElement> getTableRows() {
        return tableRows;
    }

    public List<String> getTableRowData(WebElement row) {
        List<String> rowData = new ArrayList<>();
        List<WebElement> rowFields = row.findElements(By.cssSelector("td[role=gridcell]"));
        for (WebElement field : rowFields) {
            String result = field.getAttribute("innerText");
            rowData.add(result);
        }
        return rowData;
    }

    @Override
    public String getContentPath() {
        return "/Company";
    }
}
