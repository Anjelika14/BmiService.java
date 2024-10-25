public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.64;
        int weight = 47;

        double Index = service.calculate(height, weight);

        System.out.println("Индекс массы тела:" + Math.round(Index));
    }
}
