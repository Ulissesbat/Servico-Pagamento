package service;

public class PaypalService implements OnlinePaymentService {

	@Override
	public double PaymentFee(double amount) {
	
		return amount * 0.02;
	}

	@Override
	public double Interest(double amount, int months) {
		
		return amount * 0.01 * months;
	}

}
