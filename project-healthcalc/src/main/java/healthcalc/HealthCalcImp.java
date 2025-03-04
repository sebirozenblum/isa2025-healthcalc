package healthcalc;

public class HealthCalcImp implements HealthCalc {

    @Override
    public float idealWeight(int height, char gender) throws Exception {

        float IW;

        if (height < 80 || height > 210) {
            throw new Exception("La altura debe estar dentro de un rango adecuado (80-210)");
        }

        if (gender != 'w' && gender != 'm') {
            throw new Exception("Se debe introducir un género válido (m/w)");
        }

        else {
            if (gender == 'm') {
                IW = height - 100 - (height - 150) / 4;
            }

            else {
                IW = (float) (height - 100 - (height - 150) / 2.5);
            }

        }

        return IW;

    }

    @Override
    public float basalMetabolicRate(float weight, int height, int age, char gender) throws Exception {
        float BMR;

        if (gender != 'w' && gender != 'm') {
            throw new Exception("Se debe introducir un género válido (m/w)");
        }

        if (height < 80 || height > 210) {
            throw new Exception("La altura debe estar dentro de un rango adecuado (150-210)");
        }

        if (weight <= 0 || weight > 200) {
            throw new Exception("El peso debe estar dentro de un rango adecuado (0-200)");
        }

        if (age <= 0 || age > 105) {
            throw new Exception("La edad debe estar dentro de un rango adecuado");
        }

        else {
            if (gender == 'm') {
                BMR = (float) (88.362 + 13.397 * weight + 4.799 * height - 5.677 * age);
            }

            else {
                BMR = (float) (447.593 + 9.247 * weight + 3.098 * height - 4.330 * age);
            }

        }

        return BMR;
    }

}