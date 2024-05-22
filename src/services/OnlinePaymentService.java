package services;


import entities.Installment;

public interface OnlinePaymentService {

    double paymentFee(double amount);

    double interest(double amount, int months);

}
