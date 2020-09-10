package com.cts.runner;


	
	import cucumber.api.CucumberOptions; 
	import net.serenitybdd.cucumber.CucumberWithSerenity; 
	import org.junit.runner.RunWith;

	@RunWith(CucumberWithSerenity.class) 
	@CucumberOptions( 
			features = "src/test/resources/resources/api.feature" ,
			glue={"steps"}, 
			plugin={"pretty", "html:cucumberReport/cucumber-html-report","json:cucumberReport/cucumber-report.json"},
			tags={"@Functionaltest"}
			)




public class Runs {

}
