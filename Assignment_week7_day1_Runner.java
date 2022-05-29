package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/features/Assignment_Week7_day2_CreateLead.feature",
		"src/test/java/features/Assignment_Week7_day2_DeleteLead.feature",
		"src/test/java/features/Assignment_Week7_day2_MergeLead.feature",
		"src/test/java/features/Assignment_Week7_day2_EditLead.feature",
		"src/test/java/features/Assignment_Week7_day2_DuplicateLead.feature" }, glue = "steps", monochrome = true, publish = true, 
		tags = "@sanity or @smoke")
public class Assignment_week7_day1_Runner extends AbstractTestNGCucumberTests {

}
