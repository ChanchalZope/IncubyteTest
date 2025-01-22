package TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import CoreLogic.CommonLogics;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/Features",
		glue={"StepDefinitions"},		
		monochrome = true,		
		dryRun = false
	//	tags = "@Signup"
		)

public class RunTest extends AbstractTestNGCucumberTests{


    @BeforeClass
    public void setUp() {      
        CommonLogics.initializeDriver();
    }

    @AfterClass
    public void tearDown() {
    	CommonLogics.quit();    
    }
}
