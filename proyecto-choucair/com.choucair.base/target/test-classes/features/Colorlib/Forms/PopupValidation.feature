@Regresion
  Feature: Formulaario popup validation
    El usuario dede poder ingresar al formulario los datos requeridos.
    Cada campo del formulario realiza validaciones de obligatoriedad,
    longitud y formato, el sistema debe presentar la validaciones respectivas
    para cada campo a traves in globo informatico

  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario popup validaton,
    no se presenta ningun mensaje de validacion

		Given Autentico en colorlob con usuario "demo" y clave "demo"
		And Ingreso a la  funcionalidad Forms Validation
		When Diligencio formulario Popup Validation
		|Required|Select|MultipleS1|MultipleS2|Url                  |Email           |Password1|Password2|MinSize|MaxSize|Number|IP         |Date      |DateEarlier|
		|Valor1  |Golf  |Tennis    |Golf      |http://www.valor1.com|valor1@gmail.com|valor1   |valor1   |123456 |123456 |-99.99|200.200.5.4|2018-01-22|2012/09/12 |
		
		Then Verifico ingreso exitoso

	@CasoAlterno
	Scenario: Diligenciamiento con errores del formulario Popup validation,
						se presenta Globo informativo indicando error en el diligenciamiento de alguno de los campos.
	
		Given Autentico en colorlob con usuario "demo" y clave "demo"
		And Ingreso a la  funcionalidad Forms Validation
		When Diligencio formulario Popup Validation
		|Required|Select|MultipleS1|MultipleS2|Url                  |Email           |Password1|Password2|MinSize|MaxSize|Number|IP         |Date      |DateEarlier|
		|  |Golf  |Tennis    |Golf      |http://www.valor1.com|valor1@gmail.com|valor1   |valor1   |123456 |123456 |-99.99|200.200.5.4|2018-01-22|2012/09/12 |
		| valor1 |Choose a sport  |Tennis    |Golf      |http://www.valor1.com|valor1@gmail.com|valor1   |valor1   |123456 |123456 |-99.99|200.200.5.4|2018-01-22|2012/09/12 |
		
		
		Then Verificar que se presente Globo Informativo de validacion

