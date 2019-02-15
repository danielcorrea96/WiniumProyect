package com.accenture.winiumproyect.tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.net.URL;
import static com.accenture.winiumproyect.model.enums.Path.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class OpenApplication implements Task {
	public static Robot ROBOT;
	public static WiniumDriver DRIVER;
	

	private static void  espera(int i) {
		try {
			Thread.sleep((long)i*1000);
		} catch (InterruptedException e) {
		    Thread.currentThread().interrupt();
		}
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			ROBOT = new Robot();
			Runtime.getRuntime().exec(PATH_WINIUM.getCode());
			DesktopOptions options = new DesktopOptions();
			options.setApplicationPath(PATH_CALC.getCode());
			DRIVER = new WiniumDriver(new URL(RUTA_CONF_WINIUM.getCode()), options);
			espera(3);
		}  catch (IOException | AWTException e) {
		}
		
	}
	
	public static OpenApplication abrirAppCal() {
		return instrumented(OpenApplication.class);
	}

}
