package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target\\cucumber-reports1.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@CHQApositive",

        dryRun = false



)

public class Runner {

}
