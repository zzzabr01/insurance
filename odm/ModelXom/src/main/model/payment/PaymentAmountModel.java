package main.model.payment;

public abstract class PaymentAmountModel {

	public PaymentAmountModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public abstract String obtainPaymentModelName();
	
	public abstract Class<? extends PaymentAmountModel> obtainClassType();
}
