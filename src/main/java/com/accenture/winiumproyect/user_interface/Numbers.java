package com.accenture.winiumproyect.user_interface;

import org.openqa.selenium.WebElement;

import com.accenture.winiumproyect.tasks.OpenApplication;

import net.serenitybdd.core.annotations.findby.By;


public class Numbers {

	public static WebElement BOTON_1 = OpenApplication.DRIVER.findElement(By.name("Tres"));
	public static WebElement BOTONMENOS = OpenApplication.DRIVER.findElement(By.name("Menos"));
	public static WebElement BOTON_2 = OpenApplication.DRIVER.findElement(By.name("Dos"));
	public static WebElement BOTONIGUAL = OpenApplication.DRIVER.findElement(By.name("Es igual a"));
	
}
