package com.accenture.winiumproyect.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features= "src/test/resources/features/AddNumbers.feature", 
		glue = {"com.accenture.winiumproyect.step_definitions"}
)
public class AddNumbers {

}
