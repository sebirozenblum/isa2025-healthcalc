package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	@Test
	@DisplayName("idealWeight lanza excepción si la altura es negativa")
	public void idealWeightAlturaNegativaLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		int height = -1;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.idealWeight(height, gender));
	}

	@Test
	@DisplayName("idealWeight lanza excepción si la altura es cero")
	public void idealWeightAlturaCeroLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		int height = 0;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.idealWeight(height, gender));
	}

	@Test
	@DisplayName("idealWeight lanza excepción si la altura es muy pequeña")
	public void idealWeightAlturaPequeñaLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		int height = 50;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.idealWeight(height, gender));
	}

	@Test
	@DisplayName("idealWeight lanza excepción si la altura es muy grande")
	public void idealWeightAlturaGrandeLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		int height = 500;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.idealWeight(height, gender));
	}

	@Test
	@DisplayName("idealWeight lanza excepción si el género no es válido")
	public void idealWeightGeneroInvalidoLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		int height = 100;
		char gender = 'a';

		// Assert
		assertThrows(Exception.class, () -> calc.idealWeight(height, gender));
	}

	@Test
	@DisplayName("idealWeight funciona correctamente con parámetros válidos (m)")
	public void idealWeightMasculinoFuncionaCorrectamente() throws Exception {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		int height = 178;
		char gender = 'm';

		// Act
		float res = calc.idealWeight(height, gender);

		// Assert
		assertEquals(71.0, res);

	}

	@Test
	@DisplayName("idealWeight funciona correctamente con parámetros válidos (w)")
	public void idealWeightFemeninoFuncionaCorrectamente() throws Exception {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		int height = 180;
		char gender = 'w';

		// Act
		float res = calc.idealWeight(height, gender);

		// Assert
		assertEquals(68.0, res);

	}

	@Test
	@DisplayName("basalMetabolicRate lanza excepción si la altura es negativa")
	public void basalMetabolicRateAlturaNegativaLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) 80.0;
		int height = -1;
		int age = 30;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.basalMetabolicRate(weight, height, age, gender));
	}

	@Test
	@DisplayName("basalMetabolicRate lanza excepción si la altura es cero")
	public void basalMetabolicRateAlturaCeroLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) 80.0;
		int height = 0;
		int age = 30;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.basalMetabolicRate(weight, height, age, gender));
	}

	@Test
	@DisplayName("basalMetabolicRate lanza excepción si la altura es negativa")
	public void basalMetabolicRateAlturaPequeñaLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) 80.0;
		int height = 10;
		int age = 30;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.basalMetabolicRate(weight, height, age, gender));
	}

	@Test
	@DisplayName("basalMetabolicRate lanza excepción si la altura es grande")
	public void basalMetabolicRateAlturaGrandeLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) 80.0;
		int height = 220;
		int age = 30;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.basalMetabolicRate(weight, height, age, gender));
	}

	@Test
	@DisplayName("basalMetabolicRate lanza excepción si el género no es válido")
	public void basalMetabolicRateGeneroInvalidoLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) 80.0;
		int height = 100;
		int age = 30;
		char gender = 'a';

		// Assert
		assertThrows(Exception.class, () -> calc.basalMetabolicRate(weight, height, age, gender));
	}

	@Test
	@DisplayName("basalMetabolicRate lanza excepción si el peso es negativo")
	public void basalMetabolicRatePesoNegativoLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) -10.0;
		int height = 100;
		int age = 30;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.basalMetabolicRate(weight, height, age, gender));
	}

	@Test
	@DisplayName("basalMetabolicRate lanza excepción si el peso es cero")
	public void basalMetabolicRatePesoCeroLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) 0.0;
		int height = 100;
		int age = 30;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.basalMetabolicRate(weight, height, age, gender));
	}

	@Test
	@DisplayName("basalMetabolicRate lanza excepción si el peso es muy grande")
	public void basalMetabolicRatePesoGrandeLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) 300.0;
		int height = 100;
		int age = 30;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.basalMetabolicRate(weight, height, age, gender));
	}

	@Test
	@DisplayName("basalMetabolicRate lanza excepción si la edad es negativa")
	public void basalMetabolicRateEdadNegativaLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) 100.0;
		int height = 100;
		int age = -1;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.basalMetabolicRate(weight, height, age, gender));
	}

	@Test
	@DisplayName("basalMetabolicRate lanza excepción si la edad es cero")
	public void basalMetabolicRateEdadCeroLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) 100.0;
		int height = 100;
		int age = 0;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.basalMetabolicRate(weight, height, age, gender));
	}

	@Test
	@DisplayName("basalMetabolicRate lanza excepción si la edad es muy grande")
	public void basalMetabolicRateEdadGrandeLanzaExcepcion() {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) 100.0;
		int height = 100;
		int age = 150;
		char gender = 'm';

		// Assert
		assertThrows(Exception.class, () -> calc.basalMetabolicRate(weight, height, age, gender));
	}

	@Test
	@DisplayName("basalMetabolicRate funciona correctamente con parámetros válidos (m)")
	public void basalMetabolicRateMasculinoFuncionaCorrectamente() throws Exception {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) 100.0;
		int height = 160;
		int age = 50;
		char gender = 'm';

		// Act
		float res = calc.basalMetabolicRate(weight, height, age, gender);

		// Assert
		assertEquals(1912, Math.round(res));

	}

	@Test
	@DisplayName("basalMetabolicRate funciona correctamente con parámetros válidos (w)")
	public void basalMetabolicRateFemeninoFuncionaCorrectamente() throws Exception {
		// Arrange
		HealthCalcImp calc = new HealthCalcImp();
		float weight = (float) 100.0;
		int height = 160;
		int age = 50;
		char gender = 'w';

		// Act
		float res = calc.basalMetabolicRate(weight, height, age, gender);

		// Assert
		assertEquals(1651, Math.round(res));

	}
}
