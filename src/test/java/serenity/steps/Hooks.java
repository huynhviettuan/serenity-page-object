package serenity.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    public Hooks() {
    }

    @Before(value = "@Web")
    public void setupScenarioWeb() {
        System.out.println("Setup Web Scenario");
    }

    @After(value = "@Web")
    public void teardownScenarioWeb() {
        System.out.println("Tear down Web Scenario");
    }

    @Before(value = "@Mobile")
    public void setupScenarioMobile() {
        System.out.println("Setup Mobile Scenario");
    }

    @After(value = "@Mobile")
    public void teardownScenarioMobile() {
        System.out.println("Tear down Mobile Scenario");
    }
}
