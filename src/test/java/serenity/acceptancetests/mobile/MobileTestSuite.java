package serenity.acceptancetests.mobile;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/mobile/", glue="serenity/steps/mobile")
public class MobileTestSuite {
}
