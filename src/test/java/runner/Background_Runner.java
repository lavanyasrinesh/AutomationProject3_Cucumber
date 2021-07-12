package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="classpath:featureFiles",
		glue="steps",
		//tags= "@scenario2",
		monochrome=true,
		dryRun=false,
		plugin= {
			"pretty",
			"html:target/cucumber",
			"json:target/cucumber.json"
		}
		)
public class Background_Runner {

}
