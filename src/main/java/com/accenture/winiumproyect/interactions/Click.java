package com.accenture.winiumproyect.interactions;

import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class Click {
	public String mask;
	
	public Click(String mask) {
		this.mask = mask;
	}
	
	public static Click mask(String mask) {
		return new Click(mask);
	}
	
	public  ClickOnTarget on (WebElement WebElement) {
		return instrumented(ClickOnTarget.class, WebElement, mask);
	}

}
