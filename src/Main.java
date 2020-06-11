public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        long amountInRubles;
        long periodInYears;
        double interestRatePerYearInPercents;

        amountInRubles = 1_000_000;
        periodInYears = 1;
        interestRatePerYearInPercents = 9.99;

        System.out.print("Ежемесячный платёж первый пример: ");
        System.out.println(creditPaymentService.calculate(amountInRubles, periodInYears, interestRatePerYearInPercents));

        amountInRubles = 1_000_000;
        periodInYears = 2;
        interestRatePerYearInPercents = 9.99;

        System.out.print("Ежемесячный платёж второй пример: ");
        System.out.println(creditPaymentService.calculate(amountInRubles, periodInYears, interestRatePerYearInPercents));

        amountInRubles = 1_000_000;
        periodInYears = 3;
        interestRatePerYearInPercents = 9.99;

        System.out.print("Ежемесячный платёж третий пример: ");
        System.out.println(creditPaymentService.calculate(amountInRubles, periodInYears, interestRatePerYearInPercents));

    }
}
