package entities;

import services.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {

    private static final Double FEE_PERCENTAGE = 0.02;
    private static final Double MONTHLY_INTEREST = 0.01;

    @Override
    public double paymentFee(double amount) {
        return amount * FEE_PERCENTAGE;
    }

    @Override
    public double interest(double amount, int months) {
        return amount * MONTHLY_INTEREST * months;
    }
}
