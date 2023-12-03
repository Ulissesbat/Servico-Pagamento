package service;

public interface OnlinePaymentService {

	double PaymentFee(double amount);
	double Interest (double amount, int months);
}
