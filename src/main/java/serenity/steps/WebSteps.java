package serenity.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenity.CommonPage;
import serenity.pages.web.LoginPage;

public class WebSteps extends ScenarioSteps {

    CommonPage commonPage;
    LoginPage loginPage;

    @Step
    public void openURL(String url) {
        commonPage.openAt(url);
    }

    @Step
    public void login(String email, String password) {
        loginPage.login(email,password);
    }

    @Step
    public String getLoginErrorMessage() {
        return loginPage.getErrorMessage();
    }
}
