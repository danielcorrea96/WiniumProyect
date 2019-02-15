package com.accenture.winiumproyect.interactions;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class ClickOnTarget implements Interaction {

	private WebElement element;
	private String mask;
	public ClickOnTarget(WebElement element, String mask) {
		this.element = element;
		this.mask = mask;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
			element.click();
	}
	
	
	public static ClickOnTarget is (WebElement element, String mask) {
		return instrumented(ClickOnTarget.class, element, mask);
	}

}
