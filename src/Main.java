public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sum = 1_000_000;
        double period = 36;
        double percent = 9.99;
        double payment = (int) service.calculate(sum, period, percent);
        System.out.println("Сумма кредита = " + (int) sum + " руб. ");
        System.out.println("Срок кредита = " + (int) period + " мес. ");
        System.out.println("Процентная ставка = " + percent + " % ");
        System.out.println("Сумма ежемесячного платежа = " + (int) payment + " руб. ");
    }
}