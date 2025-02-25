package healthcalc;


public class HealthCalcImp implements HealthCalc {

    @Override
    public float idealWeight(int height, char gender) throws Exception {

        float IW;

        if (gender == 'M') {
            IW = height - 100 - (height - 150) / 4;
        }

        else {
            IW = height - 100 - (height - 150) / (float) 2.5;
        }

        return IW;

    }

    @Override
    public float basalMetabolicRate(float weight, int height, int age, char gender) throws Exception {
        float BMR;

        if (gender == 'M') {
            BMR = (float) (88.362 + 13.397 * weight + 4.799 * height - 5.677 * age);
        }

        else {
            BMR = (float) (447.593 + 9.247 * weight + 3.098 * height - 4.330 * age);
        }

        return BMR;
    }

}