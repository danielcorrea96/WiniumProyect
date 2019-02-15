package com.accenture.winiumproyect.step_definitions;


import com.accenture.winiumproyect.tasks.Add;
import com.accenture.winiumproyect.tasks.OpenApplication;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class AddNumbersStepDefinition {
	
	Actor daniel = Actor.named("Daniel");

	
	@Before
	public void setUp() {
		daniel.wasAbleTo(OpenApplication.abrirAppCal());
		daniel.can(BrowseTheWeb.with(OpenApplication.DRIVER));
	}
	
	@Given("^que un usuario quiere realizar una adicion en la calculadora de Windows$")
	public void queUnUsuarioQuiereRealizarUnaAdicionEnLaCalculadoraDeWindows() throws Exception {
		daniel.attemptsTo(Add.theApp());
		
	   
	}

	@When("^realiza la suma de (.*) mas (.*)$")
	public void realizaLaSumaDeMas(int arg1, int arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
	
	}

	@Then("^el usuario espera ver Se muestra (.*) como resultado$")
	public void elUsuarioEsperaVerSeMuestraComoResultado(int arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

}
