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
Then Verifico ingreso exitoso


@tag2
Scenario Outline: Title of your scenario outline
Given  I want to write a step with <name>
When I check for the <vlaue> in step
Then I verify the <status> in step

Examples:
  |name|value|status|
  |name1|5   |succes|
  |name2|7   |Fail  |