package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Digital Suppliers\\second-workspace\\ContactListAppBDDFramework\\src\\test\\java\\feature\\LoginFunctionality.feature",
					glue="stepDefinition" , publish=true)
public class RunnerWithJunit {

}
