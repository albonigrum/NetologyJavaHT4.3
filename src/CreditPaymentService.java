public class CreditPaymentService {
    long calculate(long amountInRubles, long periodInYears, double interestRatePerYearInPercents) {
        double interestRatePerMonth = interestRatePerYearInPercents / 100 / 12;
        long periodInMonths = periodInYears * 12;
        double coefficientAnnuity = interestRatePerMonth * Math.pow(1 + interestRatePerMonth, periodInMonths) /
                (Math.pow(1 + interestRatePerMonth, periodInMonths) - 1);
        return (long)(amountInRubles * coefficientAnnuity);
    }
}
