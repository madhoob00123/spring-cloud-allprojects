package testRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features ="/home/cdelabs/workspace/spring-cloud-pleasedontdelete/greeting-ribbon/src/test/repository/feature/myfeature.feature",
        //glue = "/home/cdelabs/workspace/spring-cloud-pleasedontdelete/greeting-ribbon/src/test/java/testRunner/MyStepdefs.java",
        plugin = {"pretty", "html:target/cucumber"}

        )
public class TestRunner {
}
