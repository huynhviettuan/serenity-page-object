package serenity.steps.web;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import serenity.steps.WebSteps;


public class WebStepDefinitions {

    @Steps
    WebSteps webSteps;

    @Given("User go to Login page")
    public void userGoToLoginPage() {
        webSteps.openURL("https://fado.vn/dang-nhap?redirect=https%3A%2F%2Ffado.vn%2F");
    }

    @When("User login with credentials {string} and {string}")
    public void userLoginWithCredentialsAnd(String email, String password) {
        webSteps.login(email,password);
    }

    @Then("System should displayed {string} message")
    public void systemShouldDisplayedMessage(String errorMessage) {
        Assert.assertEquals(errorMessage,webSteps.getLoginErrorMessage());
    }
}
