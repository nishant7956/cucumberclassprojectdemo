package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty","html:target/cucumber.html"},
		features="C:\\Users\\itsti\\eclipse-workspace\\cucupomproject\\src\\test\\resources\\FeatureFiles\\Login.feature",
		glue="firstMAvenproject",
		//tags="not @Test1",
		monochrome=true
		)
public class TestRunner {

	
}
