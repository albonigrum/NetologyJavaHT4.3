public class CreditPaymentService {
    long calculate(long amountInRubles, long periodInYear, double interestRatePerYearInPercent) {
        double interestRatePerMonth = interestRatePerYearInPercent / 100 / 12;
        long periodInMonth = periodInYear * 12;
        double coefficientAnnuity = interestRatePerMonth * Math.pow(1 + interestRatePerMonth, periodInMonth) /
                (Math.pow(1 + interestRatePerMonth, periodInMonth) - 1);
        return (long)(amountInRubles * coefficientAnnuity);
    }
}
