public class MainBmi {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;

        double BmiService = service.calculate(weight, height);
        System.out.println("Индекс массы тела:" + BmiService);

    }
}
