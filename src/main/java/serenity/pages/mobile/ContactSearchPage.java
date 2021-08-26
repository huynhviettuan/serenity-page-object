package serenity.pages.mobile;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import serenity.CommonPage;


public class ContactSearchPage extends CommonPage {

    @FindBy(id = "main_search")
    WebElementFacade searchField;

    @FindBy(xpath = "//android.widget.TextView[@text='Sara Alston']")
    WebElementFacade firstSearchResultName;

    public void search(String name) {
        searchField.click();
        searchField.sendKeys(name);
    }


    public void navigateToSearchResultDetails() {
        firstSearchResultName.click();
    }

    public String getFirstContact() {
        return firstSearchResultName.getText();
    }

    public void select(String name) {
        element("//android.widget.TextView[@text='{0}']",name).click();
    }
}
