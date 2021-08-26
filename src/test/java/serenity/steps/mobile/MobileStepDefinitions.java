package serenity.steps.mobile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import serenity.steps.MobileSteps;

public class MobileStepDefinitions {

    @Steps
    MobileSteps mobileSteps;

    @Given("I search {string}")
    public void iSearch(String name) {
        mobileSteps.search(name);
    }

    @When("I navigate to search result details")
    public void iNavigateToSearchResultDetails() {
        mobileSteps.navigateToSearchResultDetails();
    }

    @Then("I verify first contact is {string}")
    public void iVerifyFirstContactIs(String name) {
        Assert.assertEquals(mobileSteps.getFirstContact(), name);
    }

    @Then("I verify contact name {string}")
    public void iVerifyContactName(String name) {
        Assert.assertEquals(mobileSteps.getContactName(), name);
    }
}
