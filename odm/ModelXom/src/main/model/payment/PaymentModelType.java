package main.model.payment;

public enum PaymentModelType {
	LIFE("lifeMethod."),INJURY("injuryMethod."),HEALTH("healthMethod."),
	COMPREHENSIVE("comprehensiveMethod."),ADDITIONAL("additionalMethod."),
	INVESTMENT("investmentMethod."),PENSION("pensionMethod.");
	
	public final String label;
	
	private PaymentModelType(String label) {
		this.label = label;
	}
}
