package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\Digital Suppliers\\second-workspace\\ContactListAppBDDFramework\\src\\test\\java\\feature\\LoginFunctionality.feature",
					glue="stepDefinition" , publish=true)
public class RunnerWithTestNG extends AbstractTestNGCucumberTests{

}
