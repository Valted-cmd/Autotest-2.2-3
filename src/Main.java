public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double payment = service.calculate(500000, 5);
        System.out.println(payment + " руб.");

        double payment2 = service.calculate(1000000, 1);
        System.out.println(payment2 + " руб.");

        double payment3 = service.calculate(1000000, 2);
        System.out.println(payment3 + " руб.");

        double payment4 = service.calculate(1000000, 3);
        System.out.println(payment4 + " руб.");
    }
}