package main.model.payment;

import java.util.Date;

import main.model.payment.PaymentModelType;

/**
 * 給付金額參數
 * 
 * @author TPI
 *
 */
public class LifePaymentAmountModel extends PaymentAmountModel{

	/**
	 * 保險金額
	 */
	private Double insuranceAmount;

	/**
	 * 當年度保額
	 */
	private Double currentYearInsuranceAmt;

	/**
	 * 保單年度
	 */
	private Integer policyYear;

	/**
	 * 保單價值準備金
	 */
	private Double policyValueAmount;

	/**
	 * 增值保額
	 */
	private Double increaseValueInsuranceAmt;

	/**
	 * 已給付失能保險金
	 */
	private Double paidDisabilityInsuranceAmt;

	/**
	 * 解約金
	 */
	private Double cashSurrenderValue;

	/**
	 * 所繳保費總額
	 */
	private Double paidTotalPremiumA;

	/**
	 * 已領取生存保險金總額
	 */
	private Double receiveTotalSurvivalInsurance;

	/**
	 * 躉繳保險費
	 */
	private Double singlePremium;

	/**
	 * 年繳保險費總和(額)
	 */
	private Double annualTotalInsurancePremium;

	/**
	 * 生存保險金
	 */
	private Double survivalInsurance;

	/**
	 * 保價係數
	 */
	private Double insuredCoefficient;

	/**
	 * 展期保額
	 */
	private Double rolloverInsuranceAmt;

	/**
	 * 已繳保費總額
	 */
	private Double paidTotalPremiumB;

	/**
	 * 未到期保費
	 */
	private Double unearnedPremium;

	/**
	 * 繳費年期
	 */
	private Integer premiumPaymentTerm;

	/**
	 * 前一次生存金發放保單周年日之年齡
	 */
	private Integer lastReceiveSurvivalInsuranceAge;

	/**
	 * 實際生存日數比例之生存保險金
	 */
	private Double survivalAmountOfActualSurvivalDays;

	/**
	 * 特別承保保費
	 */
	private Double specialUnderwritingPremium;

	/**
	 * 減額繳清保險金額重新計算之增額後保額
	 */
	private Double reducedPaidAmt;

	/**
	 * 所繳保費總額利息
	 */
	private Double totalPremiumInterest;

	/**
	 * 躉繳保險費利息
	 */
	private Double singlePremiumInterest;

	/**
	 * 保額倍數
	 */
	private Double multiple;

	/**
	 * 所繳保險費總額倍數
	 */
	private Double totalPremiumsPaidMultiple;

	/**
	 * 年繳保險費總額倍數
	 */
	private Double yearPremiumsPaidMultiple;

	/**
	 * 躉繳保險費倍數
	 */
	private Double singlePremiumMultiple;

	/**
	 * 增值回饋分享金
	 */
	private Double increaseValueAmt;

	/**
	 * 增額繳清保險金額
	 */
	private Double increaseInsuranceForPayOff;

	/**
	 * 住院醫療提前給付日額
	 */
	private Double accelerationProfitHospitalizationDailyAmount;

	/**
	 * 繳費年期利率
	 */
	private Double paymentAnnualRate;

	/**
	 * 繳費期滿利率
	 */
	private Double paymentExpireRate;

	/**
	 * 住院日數
	 */
	private Double inpatientDays;

	/**
	 * 已給付老年住院醫療提前給付保險金
	 */
	private Double receiveAccelerationProfitHospitalizationAmt;

	/**
	 * 主約保額
	 */
	private Double mainInsuranceAmount;

	/**
	 * 預定利率
	 */
	private Double assumedInterestRate;

	/**
	 * 已領取月數
	 */
	private Double receivedMonth;

	/**
	 * 前次生存發放日期
	 */
	private Date lastSurvivalPaymentDate;

	/**
	 * 下次生存發放日期
	 */
	private Date nextSurvivalPaymentDate;

	/**
	 * 死亡日期
	 */
	private Date dateOfDeath;

	/**
	 * 失能給付比例
	 */
	private Double disabledPayRatio;

	public LifePaymentAmountModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(Double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public Double getCurrentYearInsuranceAmt() {
		return currentYearInsuranceAmt;
	}

	public void setCurrentYearInsuranceAmt(Double currentYearInsuranceAmt) {
		this.currentYearInsuranceAmt = currentYearInsuranceAmt;
	}

	public Integer getPolicyYear() {
		return policyYear;
	}

	public void setPolicyYear(Integer policyYear) {
		this.policyYear = policyYear;
	}

	public Double getPolicyValueAmount() {
		return policyValueAmount;
	}

	public void setPolicyValueAmount(Double policyValueAmount) {
		this.policyValueAmount = policyValueAmount;
	}

	public Double getIncreaseValueInsuranceAmt() {
		return increaseValueInsuranceAmt;
	}

	public void setIncreaseValueInsuranceAmt(Double increaseValueInsuranceAmt) {
		this.increaseValueInsuranceAmt = increaseValueInsuranceAmt;
	}

	public Double getPaidDisabilityInsuranceAmt() {
		return paidDisabilityInsuranceAmt;
	}

	public void setPaidDisabilityInsuranceAmt(Double paidDisabilityInsuranceAmt) {
		this.paidDisabilityInsuranceAmt = paidDisabilityInsuranceAmt;
	}

	public Double getCashSurrenderValue() {
		return cashSurrenderValue;
	}

	public void setCashSurrenderValue(Double cashSurrenderValue) {
		this.cashSurrenderValue = cashSurrenderValue;
	}

	public Double getPaidTotalPremiumA() {
		return paidTotalPremiumA;
	}

	public void setPaidTotalPremiumA(Double paidTotalPremiumA) {
		this.paidTotalPremiumA = paidTotalPremiumA;
	}

	public Double getReceiveTotalSurvivalInsurance() {
		return receiveTotalSurvivalInsurance;
	}

	public void setReceiveTotalSurvivalInsurance(Double receiveTotalSurvivalInsurance) {
		this.receiveTotalSurvivalInsurance = receiveTotalSurvivalInsurance;
	}

	public Double getSinglePremium() {
		return singlePremium;
	}

	public void setSinglePremium(Double singlePremium) {
		this.singlePremium = singlePremium;
	}

	public Double getAnnualTotalInsurancePremium() {
		return annualTotalInsurancePremium;
	}

	public void setAnnualTotalInsurancePremium(Double annualTotalInsurancePremium) {
		this.annualTotalInsurancePremium = annualTotalInsurancePremium;
	}

	public Double getSurvivalInsurance() {
		return survivalInsurance;
	}

	public void setSurvivalInsurance(Double survivalInsurance) {
		this.survivalInsurance = survivalInsurance;
	}

	public Double getInsuredCoefficient() {
		return insuredCoefficient;
	}

	public void setInsuredCoefficient(Double insuredCoefficient) {
		this.insuredCoefficient = insuredCoefficient;
	}

	public Double getRolloverInsuranceAmt() {
		return rolloverInsuranceAmt;
	}

	public void setRolloverInsuranceAmt(Double rolloverInsuranceAmt) {
		this.rolloverInsuranceAmt = rolloverInsuranceAmt;
	}

	public Double getPaidTotalPremiumB() {
		return paidTotalPremiumB;
	}

	public void setPaidTotalPremiumB(Double paidTotalPremiumB) {
		this.paidTotalPremiumB = paidTotalPremiumB;
	}

	public Double getUnearnedPremium() {
		return unearnedPremium;
	}

	public void setUnearnedPremium(Double unearnedPremium) {
		this.unearnedPremium = unearnedPremium;
	}

	public Integer getPremiumPaymentTerm() {
		return premiumPaymentTerm;
	}

	public void setPremiumPaymentTerm(Integer premiumPaymentTerm) {
		this.premiumPaymentTerm = premiumPaymentTerm;
	}

	public Integer getLastReceiveSurvivalInsuranceAge() {
		return lastReceiveSurvivalInsuranceAge;
	}

	public void setLastReceiveSurvivalInsuranceAge(Integer lastReceiveSurvivalInsuranceAge) {
		this.lastReceiveSurvivalInsuranceAge = lastReceiveSurvivalInsuranceAge;
	}

	public Double getSurvivalAmountOfActualSurvivalDays() {
		return survivalAmountOfActualSurvivalDays;
	}

	public void setSurvivalAmountOfActualSurvivalDays(Double survivalAmountOfActualSurvivalDays) {
		this.survivalAmountOfActualSurvivalDays = survivalAmountOfActualSurvivalDays;
	}

	public Double getSpecialUnderwritingPremium() {
		return specialUnderwritingPremium;
	}

	public void setSpecialUnderwritingPremium(Double specialUnderwritingPremium) {
		this.specialUnderwritingPremium = specialUnderwritingPremium;
	}

	public Double getReducedPaidAmt() {
		return reducedPaidAmt;
	}

	public void setReducedPaidAmt(Double reducedPaidAmt) {
		this.reducedPaidAmt = reducedPaidAmt;
	}

	public Double getTotalPremiumInterest() {
		return totalPremiumInterest;
	}

	public void setTotalPremiumInterest(Double totalPremiumInterest) {
		this.totalPremiumInterest = totalPremiumInterest;
	}

	public Double getSinglePremiumInterest() {
		return singlePremiumInterest;
	}

	public void setSinglePremiumInterest(Double singlePremiumInterest) {
		this.singlePremiumInterest = singlePremiumInterest;
	}

	public Double getMultiple() {
		return multiple;
	}

	public void setMultiple(Double multiple) {
		this.multiple = multiple;
	}

	public Double getTotalPremiumsPaidMultiple() {
		return totalPremiumsPaidMultiple;
	}

	public void setTotalPremiumsPaidMultiple(Double totalPremiumsPaidMultiple) {
		this.totalPremiumsPaidMultiple = totalPremiumsPaidMultiple;
	}

	public Double getSinglePremiumMultiple() {
		return singlePremiumMultiple;
	}

	public void setSinglePremiumMultiple(Double singlePremiumMultiple) {
		this.singlePremiumMultiple = singlePremiumMultiple;
	}

	public Double getIncreaseValueAmt() {
		return increaseValueAmt;
	}

	public void setIncreaseValueAmt(Double increaseValueAmt) {
		this.increaseValueAmt = increaseValueAmt;
	}

	public Double getIncreaseInsuranceForPayOff() {
		return increaseInsuranceForPayOff;
	}

	public void setIncreaseInsuranceForPayOff(Double increaseInsuranceForPayOff) {
		this.increaseInsuranceForPayOff = increaseInsuranceForPayOff;
	}

	public Double getAccelerationProfitHospitalizationDailyAmount() {
		return accelerationProfitHospitalizationDailyAmount;
	}

	public void setAccelerationProfitHospitalizationDailyAmount(Double accelerationProfitHospitalizationDailyAmount) {
		this.accelerationProfitHospitalizationDailyAmount = accelerationProfitHospitalizationDailyAmount;
	}

	public Double getPaymentAnnualRate() {
		return paymentAnnualRate;
	}

	public void setPaymentAnnualRate(Double paymentAnnualRate) {
		this.paymentAnnualRate = paymentAnnualRate;
	}

	public Double getPaymentExpireRate() {
		return paymentExpireRate;
	}

	public void setPaymentExpireRate(Double paymentExpireRate) {
		this.paymentExpireRate = paymentExpireRate;
	}

	public Double getInpatientDays() {
		return inpatientDays;
	}

	public void setInpatientDays(Double inpatientDays) {
		this.inpatientDays = inpatientDays;
	}

	public Double getReceiveAccelerationProfitHospitalizationAmt() {
		return receiveAccelerationProfitHospitalizationAmt;
	}

	public void setReceiveAccelerationProfitHospitalizationAmt(Double receiveAccelerationProfitHospitalizationAmt) {
		this.receiveAccelerationProfitHospitalizationAmt = receiveAccelerationProfitHospitalizationAmt;
	}

	public Double getMainInsuranceAmount() {
		return mainInsuranceAmount;
	}

	public void setMainInsuranceAmount(Double mainInsuranceAmount) {
		this.mainInsuranceAmount = mainInsuranceAmount;
	}

	public Double getAssumedInterestRate() {
		return assumedInterestRate;
	}

	public void setAssumedInterestRate(Double assumedInterestRate) {
		this.assumedInterestRate = assumedInterestRate;
	}

	public Double getReceivedMonth() {
		return receivedMonth;
	}

	public void setReceivedMonth(Double receivedMonth) {
		this.receivedMonth = receivedMonth;
	}

	public Date getLastSurvivalPaymentDate() {
		return lastSurvivalPaymentDate;
	}

	public void setLastSurvivalPaymentDate(Date lastSurvivalPaymentDate) {
		this.lastSurvivalPaymentDate = lastSurvivalPaymentDate;
	}

	public Date getNextSurvivalPaymentDate() {
		return nextSurvivalPaymentDate;
	}

	public void setNextSurvivalPaymentDate(Date nextSurvivalPaymentDate) {
		this.nextSurvivalPaymentDate = nextSurvivalPaymentDate;
	}

	public Date getDateOfDeath() {
		return dateOfDeath;
	}

	public void setDateOfDeath(Date dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public Double getDisabledPayRatio() {
		return disabledPayRatio;
	}

	public void setDisabledPayRatio(Double disabledPayRatio) {
		this.disabledPayRatio = disabledPayRatio;
	}

	public Double getYearPremiumsPaidMultiple() {
		return yearPremiumsPaidMultiple;
	}

	public void setYearPremiumsPaidMultiple(Double yearPremiumsPaidMultiple) {
		this.yearPremiumsPaidMultiple = yearPremiumsPaidMultiple;
	}
	
	public static LifePaymentAmountModel initLifePaymentAmountModel() {
		return new LifePaymentAmountModel();
	}

	@Override
	public String obtainPaymentModelName() {
		// TODO Auto-generated method stub
		return PaymentModelType.LIFE.label;
	}

	@Override
	public Class<? extends PaymentAmountModel> obtainClassType() {
		return LifePaymentAmountModel.class;
	}


	

}
