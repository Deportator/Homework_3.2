public class BmiService {

    public double calculate(double height, double weight) {
        double x = height * height;
        double Bmi = weight / x;

        return Bmi;
    }
}
