public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.89;
        double weight = 75.;
        double Bmi = service.calculate(height, weight);
        System.out.println("Индекс массы тела: " + Bmi);

    }
}
