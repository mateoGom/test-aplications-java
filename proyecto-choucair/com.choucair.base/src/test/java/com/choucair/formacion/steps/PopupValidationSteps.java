package com.choucair.formacion.steps;
import net.thucydides.core.annotations.Step;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

public class PopupValidationSteps {

	ColorlibLoginPage colorlibLoginPage;
	ColorlibMenuPage colorlibMenuPage;
	@Step
	public void login_colorlib(String strUsuario, String strPassword ) {
		// a. Abrir el navegador con la url de prueba
		colorlibLoginPage.open();
		/*
		 * b. Ingresar ususario demo
		 * c. Ingresar password demo
		 * d. Click en boton sign in
		 
		 * */
		colorlibLoginPage.IngresarDatos(strUsuario,strPassword);
		colorlibLoginPage.VerificaHome();
		
		
		
		 
	}
	@Step
	public void ingresar_form_validation() {
		colorlibMenuPage.menuFormValidation();
	}
}
