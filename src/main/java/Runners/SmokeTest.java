package Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        plugin={"html:target/cucumber-report",
                "json:target/cucumber.json"
        }   ,

       tags="@SmokeTest,@RegressionTest", // OR
      //  tags= "@SmokeTest","@RegressionTest", //AND
       // tags="~@SmokeTest"  // ignore the smoke tests

       // tags="@RegressionTest, ~@SmokeTest"

        features = {"src/test/java"},

        glue = {"stepDefinition"},

        dryRun = false

)
public class SmokeTest extends AbstractTestNGCucumberTests {
}
