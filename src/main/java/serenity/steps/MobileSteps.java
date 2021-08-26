package serenity.steps;

import net.thucydides.core.annotations.Step;
import serenity.pages.mobile.ContactDetailPage;
import serenity.pages.mobile.ContactSearchPage;

public class MobileSteps {

    ContactSearchPage contactSearchPage;
    ContactDetailPage contactDetailPage;

    @Step
    public void search(String keyword) {
        contactSearchPage.search(keyword);
    }

    @Step
    public void navigateToSearchResultDetails() {
        contactSearchPage.navigateToSearchResultDetails();
    }

    @Step
    public String getContactName() {
        return contactDetailPage.getContactName();
    }

    @Step
    public String getFirstContact() {
        return contactSearchPage.getFirstContact();
    }
}
