package com.choucair.formacion.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;



public class ColorlibMenuPage extends PageObject{
//Menu Forms
	@FindBy(xpath="//*[@id='menu']/li[6]/a")
	public WebElement menuForms;
	
	//submenu form general
	@FindBy(xpath="//*[@id='menu']/li[6]/ul/li[1]/a")
	public WebElement menuFormGeneral;
	
	
	//submenu form validation
	@FindBy(xpath="//*[@id='menu']/li[6]/ul/li[2]/a")
	public WebElement menuFormValidation;
	
	//form validation label informativo 
	@FindBy(xpath="//*[@id='content']/div/div/div[1]/div/div/header/h5")
	public WebElement lblFormValidation;
	
	public void menuFormValidation() {
		
		menuForms.click();
		menuFormValidation.click();
		String strMensaje=lblFormValidation.getText();
		assertThat(strMensaje, containsString("Popup Validation"));
		
	}
	
}
