package main.model.payment;

public class InjuryPaymentAmountModel extends PaymentAmountModel{
	/**
	 * 住院天數
	 */
	private Double inpatientDays;
	
	/**
	 * 骨折別所定日數
	 */
	private Double dayOfFractureType;
	
	/**
	 * 傷害醫療保險金日額
	 */
	private Double accidentHealthIndemnify;
	
	/**
	 * 傷害醫療保險金限額
	 */
	private Double medicalReimbursement;
	
	/**
	 * 約定單位投保數
	 */
	private Double agreementInsuredUnits;
	
	/**
	 * 住院天數(ICU病房)
	 */
	private Double inpatientDaysInICU;
	
	/**
	 * 住院天數(非ICU病房)
	 */
	private Double inpatientDaysInWard;
	
	/**
	 * 實際醫療費用
	 */
	private Double actualMedicalExpense;
	
	/**
	 * 保險金額
	 */
	private Double insuranceAmount;
	
	/**
	 * 附加保額
	 */
	private Double expenseLoading;
	
	/**
	 * 每日住院醫療日額
	 */
	private Double dailyHospitalBenefit;
	
	/**
	 * 住院實際醫療費用
	 */
	private Double actualHospitalBenefit;
	
	/**
	 * 實際緊急醫療轉送費用
	 */
	private Double actualEmergencyTransportAmount;
	
	/**
	 * 固定給付金額
	 */
	private Double fixedPaymentAmount;
	
	/**
	 * 門診天數
	 */
	private Double outpatientDays;
	
	/**
	 * 每日門診醫療日額
	 */
	private Double dailyOutpatientBenefit;
	
	/**
	 * 門診實際醫療費用
	 */
	private Double actualOutpatientBenefit;
	
	/**
	 * 保額倍數
	 */
	private Double multiple;
	
	/**
	 * 附加保額倍數
	 */
	private Double additionInsAmtMultiple;
	
	/**
	 * 每單位金額
	 */
	private Double amountPerUnit;
	
	/**
	 * 實際醫療費倍數
	 */
	private Double actualMedicalExpenseMultiple;
	
	/**
	 * 傷害醫療保險金日額倍數
	 */
	private Double injuryInsuranceDailyMultiple;
	
	/**
	 * 傷害醫療保險金限額倍數
	 */
	private Double injuryInsuranceLimitMultiple;
	
	/**
	 * 骨折別所定日數倍數
	 */
	private Double multipleOfFractureDay;
	
	/**
	 * 失能給付比例
	 */
	private Double disabledPaymentRatio;
	

	public InjuryPaymentAmountModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Double getInpatientDays() {
		return inpatientDays;
	}

	public void setInpatientDays(Double inpatientDays) {
		this.inpatientDays = inpatientDays;
	}

	public Double getDayOfFractureType() {
		return dayOfFractureType;
	}

	public void setDayOfFractureType(Double dayOfFractureType) {
		this.dayOfFractureType = dayOfFractureType;
	}

	public Double getAccidentHealthIndemnify() {
		return accidentHealthIndemnify;
	}

	public void setAccidentHealthIndemnify(Double accidentHealthIndemnify) {
		this.accidentHealthIndemnify = accidentHealthIndemnify;
	}

	public Double getMedicalReimbursement() {
		return medicalReimbursement;
	}

	public void setMedicalReimbursement(Double medicalReimbursement) {
		this.medicalReimbursement = medicalReimbursement;
	}

	public Double getAgreementInsuredUnits() {
		return agreementInsuredUnits;
	}

	public void setAgreementInsuredUnits(Double agreementInsuredUnits) {
		this.agreementInsuredUnits = agreementInsuredUnits;
	}

	public Double getInpatientDaysInICU() {
		return inpatientDaysInICU;
	}

	public void setInpatientDaysInICU(Double inpatientDaysInICU) {
		this.inpatientDaysInICU = inpatientDaysInICU;
	}

	public Double getInpatientDaysInWard() {
		return inpatientDaysInWard;
	}

	public void setInpatientDaysInWard(Double inpatientDaysInWard) {
		this.inpatientDaysInWard = inpatientDaysInWard;
	}

	public Double getActualMedicalExpense() {
		return actualMedicalExpense;
	}

	public void setActualMedicalExpense(Double actualMedicalExpense) {
		this.actualMedicalExpense = actualMedicalExpense;
	}

	public Double getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(Double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public Double getExpenseLoading() {
		return expenseLoading;
	}

	public void setExpenseLoading(Double expenseLoading) {
		this.expenseLoading = expenseLoading;
	}

	public Double getDailyHospitalBenefit() {
		return dailyHospitalBenefit;
	}

	public void setDailyHospitalBenefit(Double dailyHospitalBenefit) {
		this.dailyHospitalBenefit = dailyHospitalBenefit;
	}

	public Double getActualHospitalBenefit() {
		return actualHospitalBenefit;
	}

	public void setActualHospitalBenefit(Double actualHospitalBenefit) {
		this.actualHospitalBenefit = actualHospitalBenefit;
	}

	public Double getActualEmergencyTransportAmount() {
		return actualEmergencyTransportAmount;
	}

	public void setActualEmergencyTransportAmount(Double actualEmergencyTransportAmount) {
		this.actualEmergencyTransportAmount = actualEmergencyTransportAmount;
	}

	public Double getFixedPaymentAmount() {
		return fixedPaymentAmount;
	}

	public void setFixedPaymentAmount(Double fixedPaymentAmount) {
		this.fixedPaymentAmount = fixedPaymentAmount;
	}

	public Double getOutpatientDays() {
		return outpatientDays;
	}

	public void setOutpatientDays(Double outpatientDays) {
		this.outpatientDays = outpatientDays;
	}

	public Double getDailyOutpatientBenefit() {
		return dailyOutpatientBenefit;
	}

	public void setDailyOutpatientBenefit(Double dailyOutpatientBenefit) {
		this.dailyOutpatientBenefit = dailyOutpatientBenefit;
	}

	public Double getActualOutpatientBenefit() {
		return actualOutpatientBenefit;
	}

	public void setActualOutpatientBenefit(Double actualOutpatientBenefit) {
		this.actualOutpatientBenefit = actualOutpatientBenefit;
	}

	public Double getMultiple() {
		return multiple;
	}

	public void setMultiple(Double multiple) {
		this.multiple = multiple;
	}

	public Double getAdditionInsAmtMultiple() {
		return additionInsAmtMultiple;
	}

	public void setAdditionInsAmtMultiple(Double additionInsAmtMultiple) {
		this.additionInsAmtMultiple = additionInsAmtMultiple;
	}

	public Double getAmountPerUnit() {
		return amountPerUnit;
	}

	public void setAmountPerUnit(Double amountPerUnit) {
		this.amountPerUnit = amountPerUnit;
	}

	public Double getActualMedicalExpenseMultiple() {
		return actualMedicalExpenseMultiple;
	}

	public void setActualMedicalExpenseMultiple(Double actualMedicalExpenseMultiple) {
		this.actualMedicalExpenseMultiple = actualMedicalExpenseMultiple;
	}

	public Double getInjuryInsuranceDailyMultiple() {
		return injuryInsuranceDailyMultiple;
	}

	public void setInjuryInsuranceDailyMultiple(Double injuryInsuranceDailyMultiple) {
		this.injuryInsuranceDailyMultiple = injuryInsuranceDailyMultiple;
	}

	public Double getInjuryInsuranceLimitMultiple() {
		return injuryInsuranceLimitMultiple;
	}

	public void setInjuryInsuranceLimitMultiple(Double injuryInsuranceLimitMultiple) {
		this.injuryInsuranceLimitMultiple = injuryInsuranceLimitMultiple;
	}

	public Double getMultipleOfFractureDay() {
		return multipleOfFractureDay;
	}

	public void setMultipleOfFractureDay(Double multipleOfFractureDay) {
		this.multipleOfFractureDay = multipleOfFractureDay;
	}


	public Double getDisabledPaymentRatio() {
		return disabledPaymentRatio;
	}


	public void setDisabledPaymentRatio(Double disabledPaymentRatio) {
		this.disabledPaymentRatio = disabledPaymentRatio;
	}


	@Override
	public String obtainPaymentModelName() {
		return PaymentModelType.INJURY.label;
	}


	@Override
	public Class<? extends PaymentAmountModel> obtainClassType() {
		// TODO Auto-generated method stub
		return InjuryPaymentAmountModel.class;
	}
	
}
