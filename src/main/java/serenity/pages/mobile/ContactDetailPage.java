package serenity.pages.mobile;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import serenity.CommonPage;

public class ContactDetailPage extends CommonPage {

    @FindBy(id = "detail_name")
    private WebElementFacade contactName;

    public String getContactName() {
        return contactName.getText();
    }

}
