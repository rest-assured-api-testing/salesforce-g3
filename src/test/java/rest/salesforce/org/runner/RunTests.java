package rest.salesforce.org.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@CucumberOptions(
        glue = {"rest.salesforce.org"},
        features = {"src/test/resources/features"}
)
public class RunTests extends AbstractTestNGCucumberTests{
    @BeforeTest
    public void beforeExecution() {
        System.out.println("----------- Before Execution -----------");
    }
    @AfterTest
    public void afterExecution() {
        System.out.println("----------- After Execution -----------");
    }
}
