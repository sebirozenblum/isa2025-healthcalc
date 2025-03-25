package healthcalc.Modelo;

/**
 * Calculator of some health parameters of persons.
 * 
 * @author ISA
 *
 */
public interface HealthCalc {
	
	/**
	 * Calculate the ideal weight (IW) of a person following the Lorentz formula:
	 * For men: IW = height - 100 - (height - 150) / 4)
	 * For women: IW = height - 100 - (height - 150) / 2.5)
	 *
	 * @param height 	Height of the person (cm).
	 * @param gender	Gender of the person ('m' or 'w').
	 * @return 		 	The ideal weight of the person (kg).
	 * @throws Exception 
	 */
	public float idealWeight(int height, char gender) throws Exception;
	
	/**
	 * Calculate the Basal Metabolic Rate (BMR) of a person with the Harris-Benedict formula:
	 * For men: BMR = 88.362 + 13.397 * weight + 4.799 * height - 5.677 * age
	 * For women: BMR = 447.593 + 9.247 * weight + 3.098 * height - 4.330 * age
	 *
	 * @param weight	Weight of the person (kg).
	 * @param height 	Height of the person (cm).
	 * @param age		Age of the person.
	 * @param gender	Gender of the person ('m' or 'w').
	 * @return	  		The Basal Metabolic Rate of the person (kcal/day).
	 * @throws Exception
	 */
	public float basalMetabolicRate(float weight, int height, int age, char gender) throws Exception;
}
