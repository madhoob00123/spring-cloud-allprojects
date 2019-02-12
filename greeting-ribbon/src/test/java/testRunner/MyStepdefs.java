package testRunner;

import cucumber.api.java8.En;

public class MyStepdefs implements En {
    public MyStepdefs() {
        Given("^the Greeting service$", () -> {
            System.out.println("statement inside given");

        });
        When("^application loads$", () -> {
            System.out.println("statement inside when");
        });
        Then("^it should return the Quote from fortune service$", () -> {
            System.out.println("statement inside then");
        });
    }
}
