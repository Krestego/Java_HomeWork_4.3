public class CreditPaymentService {
    double calculate(double sum, double period, double percent) {
        double loanrate = percent / 12 / 100;
        double coefficient = loanrate * Math.pow((1 + loanrate), period) / (Math.pow((1 + loanrate), period) - 1);
        double result = coefficient * sum;
        return (int) result;
    }
}
