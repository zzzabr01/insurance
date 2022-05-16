package main.model.payment;

public class PensionPaymentAmountModel extends PaymentAmountModel{

	/**
	 * 保單價值準備金
	 */
	private Double policyValueAmount;
	
	/**
	 * 年金
	 */
	private Double pension;
	
	/**
	 * 已繳保險費總額
	 */
	private Double totalPremiumsPaid;

	/**
	 * 未支領之年金餘額
	 */
	private Double unpaidPensionBalance;


	public PensionPaymentAmountModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getPolicyValueAmount() {
		return policyValueAmount;
	}

	public void setPolicyValueAmount(Double policyValueAmount) {
		this.policyValueAmount = policyValueAmount;
	}
	
	public Double getPension() {
		return pension;
	}

	public Double getTotalPremiumsPaid() {
		return totalPremiumsPaid;
	}

	public Double getUnpaidPensionBalance() {
		return unpaidPensionBalance;
	}

	public void setPension(Double pension) {
		this.pension = pension;
	}

	public void setTotalPremiumsPaid(Double totalPremiumsPaid) {
		this.totalPremiumsPaid = totalPremiumsPaid;
	}

	public void setUnpaidPensionBalance(Double unpaidPensionBalance) {
		this.unpaidPensionBalance = unpaidPensionBalance;
	}

	@Override
	public String obtainPaymentModelName() {
		return PaymentModelType.PENSION.label;
	}

	@Override
	public Class<? extends PaymentAmountModel> obtainClassType() {
		return PensionPaymentAmountModel.class;
	}

	
}
