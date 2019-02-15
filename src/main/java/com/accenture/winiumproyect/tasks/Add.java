package com.accenture.winiumproyect.tasks;



import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.winiumproyect.interactions.Click;
import com.accenture.winiumproyect.user_interface.Numbers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


public class Add implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.mask("Boton 1").on(Numbers.BOTON_1), 
				Click.mask("Boton menos").on(Numbers.BOTONMENOS), 
				Click.mask("Boton 2").on(Numbers.BOTON_2),
				Click.mask("Boton igual").on(Numbers.BOTONIGUAL));
	
	}
	
	public static Add theApp() {		
		return instrumented(Add.class);
	}

}
