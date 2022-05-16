package main.model.payment;

public class InvestmentPaymentAmountModel extends PaymentAmountModel{

	/**
	 * 保險金額
	 */
	private Double insuranceAmount;

	/**
	 * 保額倍數
	 */
	private Double multiple;

	/**
	 * 保單價值準備金
	 */
	private Double policyValueAmount;


	/**
	 * 保單帳戶價值
	 */
	private Double policyAccountValue;

	/**
	 * 按日數比例計算已扣除之未到期保險成本給付
	 */
	private Double deductUnearnedPremiumByDays;

	/**
	 * 身故日確定日之次一個保單週月日起溢收之保險成本
	 */
	private Double deathOverflowInsuranceCost;

	/**
	 * 完全殘廢診斷確定日之次一個保單週月日起溢收之保險成本
	 */
	private Double totallyDisabilityOverflowInsuranceCost;

	/**
	 * 未支領之年金餘額
	 */
	private Double unpaidPensionBalance;

	/**
	 * 承保幣別
	 */
	private String currency;

	public InvestmentPaymentAmountModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(Double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public Double getMultiple() {
		return multiple;
	}

	public void setMultiple(Double multiple) {
		this.multiple = multiple;
	}

	public Double getPolicyValueAmount() {
		return policyValueAmount;
	}

	public void setPolicyValueAmount(Double policyValueAmount) {
		this.policyValueAmount = policyValueAmount;
	}

	public Double getPolicyAccountValue() {
		return policyAccountValue;
	}

	public void setPolicyAccountValue(Double policyAccountValue) {
		this.policyAccountValue = policyAccountValue;
	}

	public Double getDeductUnearnedPremiumByDays() {
		return deductUnearnedPremiumByDays;
	}

	public void setDeductUnearnedPremiumByDays(Double deductUnearnedPremiumByDays) {
		this.deductUnearnedPremiumByDays = deductUnearnedPremiumByDays;
	}

	public Double getDeathOverflowInsuranceCost() {
		return deathOverflowInsuranceCost;
	}

	public void setDeathOverflowInsuranceCost(Double deathOverflowInsuranceCost) {
		this.deathOverflowInsuranceCost = deathOverflowInsuranceCost;
	}

	public Double getTotallyDisabilityOverflowInsuranceCost() {
		return totallyDisabilityOverflowInsuranceCost;
	}

	public void setTotallyDisabilityOverflowInsuranceCost(Double totallyDisabilityOverflowInsuranceCost) {
		this.totallyDisabilityOverflowInsuranceCost = totallyDisabilityOverflowInsuranceCost;
	}

	public Double getUnpaidPensionBalance() {
		return unpaidPensionBalance;
	}

	public void setUnpaidPensionBalance(Double unpaidPensionBalance) {
		this.unpaidPensionBalance = unpaidPensionBalance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String obtainPaymentModelName() {
		return PaymentModelType.INVESTMENT.label;
	}

	@Override
	public Class<? extends PaymentAmountModel> obtainClassType() {
		return InvestmentPaymentAmountModel.class;
	}

}
