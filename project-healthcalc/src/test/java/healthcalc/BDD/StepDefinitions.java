package healthcalc.BDD;

import main.java.healthcalc.HealthCalcImp;
import org.junit.jupiter.api.Assertions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private HealthCalcImp healthCalc;
    private String genero;
    private Integer altura;
    private float peso;
    private Integer edad;
    private float result;
    private boolean raiseException;

    @Before
    public void initialization() {
        healthCalc = null;
        result = (float) -1.0;
        raiseException = false;
    }

    @Given("tengo una calculadora de salud")
    public void tengo_una_calculadora_de_salud() {
        healthCalc = new HealthCalcImp();
    }

    @Given("un genero {string}")
    public void un_genero(String strGenero) {
        genero = strGenero;
    }

    @Given("una altura {int}")
    public void una_altura(Integer intAltura) {
        altura = intAltura;
    }

    @When("calculo el ideal weight")
    public void calculo_el_ideal_weight() throws Exception {
        result = healthCalc.idealWeight(altura, genero.charAt(0));
    }

    @Then("el sistema devuelve {double}")
    public void el_sistema_devuelve(Double double1) {
        float esperado = double1.floatValue();
        Assertions.assertEquals(esperado, result);
    }

    @When("calculo el ideal weight con altura igual a cero")
    public void calculo_el_ideal_weight_con_altura_igual_a_cero() {
        try {
            result = healthCalc.idealWeight(0, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @Then("el sistema lanza una Exception")
    public void el_sistema_lanza_una_exception() {
        Assertions.assertTrue(raiseException);
    }

    @When("calculo el ideal weight con altura negativa {int}")
    public void calculo_el_ideal_weight_con_altura_negativa(Integer intAltura) throws Exception {
        try {
            result = healthCalc.idealWeight(intAltura, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @When("calculo el ideal weight con altura positiva pequeña {int}")
    public void calculo_el_ideal_weight_con_altura_positiva_pequeña(Integer intAltura) throws Exception {
        try {
            result = healthCalc.idealWeight(intAltura, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @When("calculo el ideal weight con altura positiva grande {int}")
    public void calculo_el_ideal_weight_con_altura_positiva_grande(Integer intAltura) throws Exception {
        try {
            result = healthCalc.idealWeight(intAltura, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @When("calculo el ideal weight con genero no valido {string}")
    public void calculo_el_ideal_weight_con_genero_no_valido(String strGenero) {
        try {
            result = healthCalc.idealWeight(altura, strGenero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @Given("un peso {double}")
    public void un_peso(Double doublePeso) {
        peso = doublePeso.floatValue();
    }

    @Given("una edad {int}")
    public void una_edad(Integer intEdad) {
        edad = intEdad;
    }

    @When("calculo el BMR")
    public void calculo_el_bmr() throws Exception {
        result = Math.round(healthCalc.basalMetabolicRate(peso, altura, edad, genero.charAt(0)));
    }

    @When("calculo el BMR con altura negativa {int}")
    public void calculo_el_bmr_con_altura_negativa(Integer intAltura) throws Exception {
        try {
            result = healthCalc.basalMetabolicRate(peso, intAltura, edad, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @When("calculo el BMR con altura igual a cero")
    public void calculo_el_bmr_con_altura_igual_a_cero() {
        try {
            result = healthCalc.basalMetabolicRate(peso, 0, edad, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @When("calculo el BMR con altura positiva pequeña {int}")
    public void calculo_el_bmr_con_altura_positiva_pequeña(Integer intAltura) {
        try {
            result = healthCalc.basalMetabolicRate(peso, intAltura, edad, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @When("calculo el BMR con altura positiva grande {int}")
    public void calculo_el_bmr_con_altura_positiva_grande(Integer intAltura) {
        try {
            result = healthCalc.basalMetabolicRate(peso, intAltura, edad, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @When("calculo el BMR con genero no valido {string}")
    public void calculo_el_bmr_con_genero_no_valido(String strGenero) {
        try {
            result = healthCalc.idealWeight(altura, strGenero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @When("calculo el BMR con peso igual a cero")
    public void calculo_el_bmr_con_peso_igual_a_cero() {
        try {
            result = healthCalc.basalMetabolicRate(0, altura, edad, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @When("calculo el BMR con peso negativo {int}")
    public void calculo_el_bmr_con_peso_negativo(Integer intPeso) {
        try {
            result = healthCalc.basalMetabolicRate(intPeso, altura, edad, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @When("calculo el BMR con peso positivo grande {int}")
    public void calculo_el_bmr_con_peso_positivo_grande(Integer intPeso) {
        try {
            result = healthCalc.basalMetabolicRate(intPeso, altura, edad, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

    @When("calculo el BMR con edad igual a cero")
    public void calculo_el_bmr_con_edad_igual_a_cero() {
        try {
            result = healthCalc.basalMetabolicRate(peso, altura, 0, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }
    @When("calculo el BMR con edad negativa {int}")
    public void calculo_el_bmr_con_edad_negativa(Integer intEdad) {
        try {
            result = healthCalc.basalMetabolicRate(peso, altura, intEdad, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }
    @When("calculo el BMR con edad positiva grande {int}")
    public void calculo_el_bmr_con_edad_positiva_grande(Integer intEdad) {
        try {
            result = healthCalc.basalMetabolicRate(peso, altura, intEdad, genero.charAt(0));
        } catch (Exception e) {
            raiseException = true;
        }
    }

}




