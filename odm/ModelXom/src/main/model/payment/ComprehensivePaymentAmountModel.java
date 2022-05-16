package main.model.payment;

public class ComprehensivePaymentAmountModel extends PaymentAmountModel{

	/**
	 * 保額
	 */
	private Double insuranceAmount = 0.0;
	
	/**
	 * 保額倍數
	 */
	private Double multiple = 0.0;
	
	/**
	 * 特定處置倍數表
	 */
	private Double specificTreatmentMultiple = 0.0;
	
	/**
	 * 失能給付比例
	 */
	private Double disabledPayRatio = 0.0;
	
	
	/**
	 * 已領「意外傷害一至六級殘廢安養保險金」
	 */
	private Double oneToSixDisabilityPensionAlreadyReceive = 0.0;
	
	/**
	 * 已給付失能保險金
	 */
	private Double paidDisabilityInsuranceAmt = 0.0;
	
	/**
	 * 所繳保費總額
	 */
	private Double paidTotalPremium = 0.0;
	
	/**
	 * 所繳保費總額倍數
	 */
	private Double totalPremiumsPaidMultiple = 0.0;
	
	/**
	 * 傷害險及健康險部分之解約金
	 */
	private Double cashSurrenderValueForHealthAndInjuryInsurance = 0.0;
	
	/**
	 * 傷害險部分之解約金
	 */
	private Double cashSurrenderValueForInjuryInsurance = 0.0;
	
	/**
	 * 手術給付倍數
	 */
	private Double surgeryPaymentMultiple = 0.0;
	
	/**
	 * 住院日額
	 */
	private Double hospitalIncome = 0.0;
	
	/**
	 * 住院日額倍數
	 */
	private Double hospitalIncomeMultiple = 0.0;
	
	
	/**
	 * 未到期保費
	 */
	private Double unearnedPremium = 0.0;
	
	
	/**
	 * 本次申請之保險金總額
	 */
	private Double paymentAmountOfApplyThisTime = 0.0;
	
	/**
	 * 住院日數
	 */
	private Double inpatientDays = 0.0;
	
	/**
	 * 門診日數
	 */
	private Integer outpatientDays = 0;
	
	/**
	 * 安寧病房日數
	 */
	private Integer hospiceDays = 0;
	
	/**
	 * 燒燙傷病房日數
	 */
	private Integer burnWardDays = 0;
	
	/**
	 * 加護病房日數
	 */
	private Integer icuDays = 0;
	
	
	/**
	 * 各項保險金給付總額
	 */
	private Double totalAmountEachInsuranceAmount = 0.0;
	
	
	/**
	 * 無理賠紀錄期間之增額比率
	 */
	private Double incrementRatioOfNoClaimRecord = 0.0;
	
	
	/**
	 * 單位日額
	 */
	private Double dailyUnitIncome = 0.0;
	
	
	/**
	 * 單位日額倍數
	 */
	private Double dailyUnitMultiple = 0.0;
	
	/**
	 * 基本保險金額
	 */
	private Double basicInsuranceAmount = 0.0;
	
	/**
	 * 累計增加保險金額
	 */
	private Double totalIncreaseInsuranceAmount = 0.0;
	
	
	/**
	 * 年繳保險費總和(額)
	 */
	private Double annualTotalInsurancePremium = 0.0;
	
	/**
	 * 年繳保險費總和(額)倍數
	 */
	private Double annualTotalPremiumPaidMultiple = 0.0;
	
	/**
	 * 已領取生存保險金總額
	 */
	private Double receiveTotalSurvivalInsurance = 0.0;
	
	/**
	 * 當年度保額
	 */
	private Double currentYearInsuranceAmt = 0.0;
	
	/**
	 * 當年度保額倍數
	 */
	private Double currentYearInsuranceAmtMultiple = 0.0;
	
	/**
	 * 完全失能扶助保險金(倍數)
	 */
	private Double totallyDisabilitySupportMultiple = 0.0;
	
	/**
	 * 保單價值準備金
	 */
	private Double policyValueAmount = 0.0;
	
	
	/**
	 * 躉繳保險費倍數
	 */
	private Double singlePremiumMultiple = 0.0;
	
	/**
	 * 繳費年期利率
	 */
	private Double paymentAnnualRate = 0.0;
	
	/**
	 * 繳費期滿利率
	 */
	private Double paymentExpireRate = 0.0;
	
	/**
	 * 利息
	 */
	private Double interest = 0.0;
	
	/**
	 * 給付期間
	 */
	private Double durationOfPayment = 0.0;
	
	/**
	 * 貼現利率
	 */
	private Double discountRate = 0.0;
	
	/**
	 * 骨折別所定日數倍數
	 */
	private Double multipleOfFractureDay = 0.0;

	public ComprehensivePaymentAmountModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getInsuranceAmount() {
		return insuranceAmount;
	}

	public Double getMultiple() {
		return multiple;
	}

	public Double getSpecificTreatmentMultiple() {
		return specificTreatmentMultiple;
	}

	public Double getDisabledPayRatio() {
		return disabledPayRatio;
	}

	public Double getOneToSixDisabilityPensionAlreadyReceive() {
		return oneToSixDisabilityPensionAlreadyReceive;
	}

	public Double getPaidDisabilityInsuranceAmt() {
		return paidDisabilityInsuranceAmt;
	}

	public Double getPaidTotalPremium() {
		return paidTotalPremium;
	}

	public Double getSurgeryPaymentMultiple() {
		return surgeryPaymentMultiple;
	}

	public Double getHospitalIncome() {
		return hospitalIncome;
	}

	public Double getHospitalIncomeMultiple() {
		return hospitalIncomeMultiple;
	}

	public Double getUnearnedPremium() {
		return unearnedPremium;
	}

	public Double getPaymentAmountOfApplyThisTime() {
		return paymentAmountOfApplyThisTime;
	}

	public Double getInpatientDays() {
		return inpatientDays;
	}

	public Integer getOutpatientDays() {
		return outpatientDays;
	}

	public Integer getHospiceDays() {
		return hospiceDays;
	}

	public Integer getBurnWardDays() {
		return burnWardDays;
	}

	public Integer getIcuDays() {
		return icuDays;
	}

	public Double getTotalAmountEachInsuranceAmount() {
		return totalAmountEachInsuranceAmount;
	}

	public Double getIncrementRatioOfNoClaimRecord() {
		return incrementRatioOfNoClaimRecord;
	}

	public Double getDailyUnitMultiple() {
		return dailyUnitMultiple;
	}

	public Double getBasicInsuranceAmount() {
		return basicInsuranceAmount;
	}

	public Double getTotalIncreaseInsuranceAmount() {
		return totalIncreaseInsuranceAmount;
	}

	public Double getAnnualTotalInsurancePremium() {
		return annualTotalInsurancePremium;
	}

	public Double getAnnualTotalPremiumPaidMultiple() {
		return annualTotalPremiumPaidMultiple;
	}

	public Double getReceiveTotalSurvivalInsurance() {
		return receiveTotalSurvivalInsurance;
	}

	public Double getCurrentYearInsuranceAmt() {
		return currentYearInsuranceAmt;
	}

	public Double getCurrentYearInsuranceAmtMultiple() {
		return currentYearInsuranceAmtMultiple;
	}

	public Double getTotallyDisabilitySupportMultiple() {
		return totallyDisabilitySupportMultiple;
	}

	public Double getPolicyValueAmount() {
		return policyValueAmount;
	}

	public void setInsuranceAmount(Double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public void setMultiple(Double multiple) {
		this.multiple = multiple;
	}

	public void setSpecificTreatmentMultiple(Double specificTreatmentMultiple) {
		this.specificTreatmentMultiple = specificTreatmentMultiple;
	}

	public void setDisabledPayRatio(Double disabledPayRatio) {
		this.disabledPayRatio = disabledPayRatio;
	}

	public void setOneToSixDisabilityPensionAlreadyReceive(Double oneToSixDisabilityPensionAlreadyReceive) {
		this.oneToSixDisabilityPensionAlreadyReceive = oneToSixDisabilityPensionAlreadyReceive;
	}

	public void setPaidDisabilityInsuranceAmt(Double paidDisabilityInsuranceAmt) {
		this.paidDisabilityInsuranceAmt = paidDisabilityInsuranceAmt;
	}

	public void setPaidTotalPremium(Double paidTotalPremium) {
		this.paidTotalPremium = paidTotalPremium;
	}


	public void setSurgeryPaymentMultiple(Double surgeryPaymentMultiple) {
		this.surgeryPaymentMultiple = surgeryPaymentMultiple;
	}

	public void setHospitalIncome(Double hospitalIncome) {
		this.hospitalIncome = hospitalIncome;
	}

	public void setHospitalIncomeMultiple(Double hospitalIncomeMultiple) {
		this.hospitalIncomeMultiple = hospitalIncomeMultiple;
	}

	public void setUnearnedPremium(Double unearnedPremium) {
		this.unearnedPremium = unearnedPremium;
	}


	public void setPaymentAmountOfApplyThisTime(Double paymentAmountOfApplyThisTime) {
		this.paymentAmountOfApplyThisTime = paymentAmountOfApplyThisTime;
	}

	public void setInpatientDays(Double inpatientDays) {
		this.inpatientDays = inpatientDays;
	}

	public void setOutpatientDays(Integer outpatientDays) {
		this.outpatientDays = outpatientDays;
	}

	public void setHospiceDays(Integer hospiceDays) {
		this.hospiceDays = hospiceDays;
	}

	public void setBurnWardDays(Integer burnWardDays) {
		this.burnWardDays = burnWardDays;
	}

	public void setIcuDays(Integer icuDays) {
		this.icuDays = icuDays;
	}

	public void setTotalAmountEachInsuranceAmount(Double totalAmountEachInsuranceAmount) {
		this.totalAmountEachInsuranceAmount = totalAmountEachInsuranceAmount;
	}

	public void setIncrementRatioOfNoClaimRecord(Double incrementRatioOfNoClaimRecord) {
		this.incrementRatioOfNoClaimRecord = incrementRatioOfNoClaimRecord;
	}

	public void setDailyUnitMultiple(Double dailyUnitMultiple) {
		this.dailyUnitMultiple = dailyUnitMultiple;
	}

	public void setBasicInsuranceAmount(Double basicInsuranceAmount) {
		this.basicInsuranceAmount = basicInsuranceAmount;
	}

	public void setTotalIncreaseInsuranceAmount(Double totalIncreaseInsuranceAmount) {
		this.totalIncreaseInsuranceAmount = totalIncreaseInsuranceAmount;
	}

	public void setAnnualTotalInsurancePremium(Double annualTotalInsurancePremium) {
		this.annualTotalInsurancePremium = annualTotalInsurancePremium;
	}

	public void setAnnualTotalPremiumPaidMultiple(Double annualTotalPremiumPaidMultiple) {
		this.annualTotalPremiumPaidMultiple = annualTotalPremiumPaidMultiple;
	}

	public void setReceiveTotalSurvivalInsurance(Double receiveTotalSurvivalInsurance) {
		this.receiveTotalSurvivalInsurance = receiveTotalSurvivalInsurance;
	}

	public void setCurrentYearInsuranceAmt(Double currentYearInsuranceAmt) {
		this.currentYearInsuranceAmt = currentYearInsuranceAmt;
	}

	public void setCurrentYearInsuranceAmtMultiple(Double currentYearInsuranceAmtMultiple) {
		this.currentYearInsuranceAmtMultiple = currentYearInsuranceAmtMultiple;
	}

	public void setTotallyDisabilitySupportMultiple(Double totallyDisabilitySupportMultiple) {
		this.totallyDisabilitySupportMultiple = totallyDisabilitySupportMultiple;
	}

	public void setPolicyValueAmount(Double policyValueAmount) {
		this.policyValueAmount = policyValueAmount;
	}

	public Double getDailyUnitIncome() {
		return dailyUnitIncome;
	}

	public void setDailyUnitIncome(Double dailyUnitIncome) {
		this.dailyUnitIncome = dailyUnitIncome;
	}

	public Double getTotalPremiumsPaidMultiple() {
		return totalPremiumsPaidMultiple;
	}

	public Double getSinglePremiumMultiple() {
		return singlePremiumMultiple;
	}

	public Double getPaymentAnnualRate() {
		return paymentAnnualRate;
	}

	public Double getPaymentExpireRate() {
		return paymentExpireRate;
	}

	public void setTotalPremiumsPaidMultiple(Double totalPremiumsPaidMultiple) {
		this.totalPremiumsPaidMultiple = totalPremiumsPaidMultiple;
	}

	public void setSinglePremiumMultiple(Double singlePremiumMultiple) {
		this.singlePremiumMultiple = singlePremiumMultiple;
	}

	public void setPaymentAnnualRate(Double paymentAnnualRate) {
		this.paymentAnnualRate = paymentAnnualRate;
	}

	public void setPaymentExpireRate(Double paymentExpireRate) {
		this.paymentExpireRate = paymentExpireRate;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Double getCashSurrenderValueForHealthAndInjuryInsurance() {
		return cashSurrenderValueForHealthAndInjuryInsurance;
	}

	public Double getCashSurrenderValueForInjuryInsurance() {
		return cashSurrenderValueForInjuryInsurance;
	}

	public void setCashSurrenderValueForHealthAndInjuryInsurance(Double cashSurrenderValueForHealthAndInjuryInsurance) {
		this.cashSurrenderValueForHealthAndInjuryInsurance = cashSurrenderValueForHealthAndInjuryInsurance;
	}

	public void setCashSurrenderValueForInjuryInsurance(Double cashSurrenderValueForInjuryInsurance) {
		this.cashSurrenderValueForInjuryInsurance = cashSurrenderValueForInjuryInsurance;
	}

	public Double getDurationOfPayment() {
		return durationOfPayment;
	}

	public Double getDiscountRate() {
		return discountRate;
	}

	public void setDurationOfPayment(Double durationOfPayment) {
		this.durationOfPayment = durationOfPayment;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}

	public Double getMultipleOfFractureDay() {
		return multipleOfFractureDay;
	}

	public void setMultipleOfFractureDay(Double multipleOfFractureDay) {
		this.multipleOfFractureDay = multipleOfFractureDay;
	}

	@Override
	public String obtainPaymentModelName() {
		return PaymentModelType.COMPREHENSIVE.label;
	}

	@Override
	public Class<? extends PaymentAmountModel> obtainClassType() {
		return ComprehensivePaymentAmountModel.class;
	}
	
	
}
