public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        long amountInRubles;
        long periodInYears;
        double interestRatePerYearInPercent;

        amountInRubles = 1_000_000;
        periodInYears = 1;
        interestRatePerYearInPercent = 9.99;

        System.out.print("Ежемесячный платёж первый пример: ");
        System.out.println(creditPaymentService.calculate(amountInRubles, periodInYears, interestRatePerYearInPercent));

        amountInRubles = 1_000_000;
        periodInYears = 2;
        interestRatePerYearInPercent = 9.99;

        System.out.print("Ежемесячный платёж второй пример: ");
        System.out.println(creditPaymentService.calculate(amountInRubles, periodInYears, interestRatePerYearInPercent));

        amountInRubles = 1_000_000;
        periodInYears = 3;
        interestRatePerYearInPercent = 9.99;

        System.out.print("Ежемесячный платёж третий пример: ");
        System.out.println(creditPaymentService.calculate(amountInRubles, periodInYears, interestRatePerYearInPercent));

    }
}
