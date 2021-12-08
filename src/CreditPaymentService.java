public class CreditPaymentService {
    public double calculate(long sum, long date) {

        long dates = 12 * date;
        final double percent = 9.99;
        double monthspercent = percent / (100 * 12);
        double payment = (long) (sum * monthspercent / (1 - (Math.pow((1 + monthspercent), -dates))));

        return payment;
    }
}
