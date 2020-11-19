public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();

        double weight = 62;

        double height = 180;

        double BodyMassIndex = service.calculate(weight, height);
        System.out.printf("Индекс массы тела %.2f", BodyMassIndex);
    }
}