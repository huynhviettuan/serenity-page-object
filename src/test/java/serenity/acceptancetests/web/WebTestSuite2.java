package serenity.acceptancetests.web;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/web/register.feature", glue="serenity/steps/web")
public class WebTestSuite2 {}
