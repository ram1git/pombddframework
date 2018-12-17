package runner;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = { "classpath:features/product.feature" }, glue = {
		"classpath:stepdefinition.first"
		 }, plugin = {"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt","junit:target/cucumber-results.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-report.html"},tags={"@flipkarthomepage"})

public class Homepagerunner extends AbstractTestNGCucumberTests {
	
	@AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("C:\\Users\\Admin\\workspace\\bddtrkeye\\extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows OS");
        Reporter.setTestRunnerOutput("Sample test runner output message");
        Reporter.setSystemInfo("environment", "QA");
        Reporter.setSystemInfo("HostName", "Ananth");
	
	}
}
