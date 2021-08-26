package serenity.pages.web;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import serenity.CommonPage;

public class LoginPage extends CommonPage {

    @FindBy(css = "#auth-block__form-group__email")
    WebElementFacade txtEmail;

    @FindBy(css = "input[name='password']")
    WebElementFacade txtPassword;

    @FindBy(xpath = "//button[contains(text(),'Đăng nhập')]")
    WebElementFacade btnLogin;

    @FindBy(css = "div .-alert-danger")
    WebElementFacade msgError;

    public void login(String email, String password) {
        txtEmail.waitUntilVisible();
        txtEmail.type(email);
        txtPassword.type(password);
        btnLogin.click();
    }

    public String getErrorMessage() {
        msgError.waitUntilVisible();
        return msgError.getText();
    }

}
