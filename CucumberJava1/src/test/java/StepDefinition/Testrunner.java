package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features1/Googlesearch.feature", glue={"StepDefinition"},
monochrome=true,
plugin={"pretty","html:target/Htmlreport/index.html",
 "json:target/Htmlreport/cucumber.json",
 "junit:target/Htmlreport/cucumber.xml"}
		)

public class Testrunner {

}
 	