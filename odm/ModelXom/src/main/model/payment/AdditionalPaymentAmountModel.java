package main.model.payment;

public class AdditionalPaymentAmountModel extends PaymentAmountModel{

	/**
	 * 保險金額
	 */
	private Double insuranceAmount = 0.0;

	/**
	 * 保額倍數
	 */
	private Double multiple = 0.0;

	/**
	 * 給付比例
	 */
	private Double paymentRatio = 0.0;

	/**
	 * 燒燙傷病房日額
	 */
	private Double dailyAmountOfBurnAndScaldWard = 0.0;

	/**
	 * 燒燙傷病房住院天數
	 */
	private Integer inpatientDaysForBurnAndScald = 0;

	/**
	 * 骨折別所定日數
	 */
	private Integer numberOfDaysSetByFracture = 0;

	/**
	 * 骨折別所定日數倍數
	 */
	private Double numberOfDaysSetByFractureMultiple = 0.0;

	/**
	 * 住院日數
	 */
	private Double inpatientDays = 0.0;

	/**
	 * 住院日額
	 */
	private Double hospitalIncome = 0.0;

	/**
	 * 加護病房日額
	 */
	private Double dailyAmountOfICU = 0.0;

	/**
	 * 加護病房住院天數
	 */
	private Integer inpatientDaysForICU = 0;

	/**
	 * 門診手術醫療費用
	 */
	private Double medicalExpensesOfOutpatientSurgery = 0.0;

	/**
	 * 住院前後門診保額
	 */
	private Double insuredAmountForOutpatientBeforeAndAfterTheHospitalization = 0.0;

	/**
	 * 門診日數
	 */
	private Integer outpatientDays = 0;

	/**
	 * 急診實際醫療費用
	 */
	private Double exactMedicalExpensesOfEmergency = 0.0;

	/**
	 * 實際醫療費用倍數
	 * 
	 */
	private Double actualMedicalExpenseMultiple = 0.0;

	public Double getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(Double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public Double getPaymentRatio() {
		return paymentRatio;
	}

	public void setPaymentRatio(Double paymentRatio) {
		this.paymentRatio = paymentRatio;
	}

	public Double getDailyAmountOfBurnAndScaldWard() {
		return dailyAmountOfBurnAndScaldWard;
	}

	public void setDailyAmountOfBurnAndScaldWard(Double dailyAmountOfBurnAndScaldWard) {
		this.dailyAmountOfBurnAndScaldWard = dailyAmountOfBurnAndScaldWard;
	}

	public Integer getInpatientDaysForBurnAndScald() {
		return inpatientDaysForBurnAndScald;
	}

	public void setInpatientDaysForBurnAndScald(Integer inpatientDaysForBurnAndScald) {
		this.inpatientDaysForBurnAndScald = inpatientDaysForBurnAndScald;
	}

	public Integer getNumberOfDaysSetByFracture() {
		return numberOfDaysSetByFracture;
	}

	public void setNumberOfDaysSetByFracture(Integer numberOfDaysSetByFracture) {
		this.numberOfDaysSetByFracture = numberOfDaysSetByFracture;
	}

	public Double getHospitalIncome() {
		return hospitalIncome;
	}

	public void setHospitalIncome(Double hospitalIncome) {
		this.hospitalIncome = hospitalIncome;
	}

	public Double getDailyAmountOfICU() {
		return dailyAmountOfICU;
	}

	public void setDailyAmountOfICU(Double dailyAmountOfICU) {
		this.dailyAmountOfICU = dailyAmountOfICU;
	}

	public Integer getInpatientDaysForICU() {
		return inpatientDaysForICU;
	}

	public void setInpatientDaysForICU(Integer inpatientDaysForICU) {
		this.inpatientDaysForICU = inpatientDaysForICU;
	}

	public Double getMedicalExpensesOfOutpatientSurgery() {
		return medicalExpensesOfOutpatientSurgery;
	}

	public void setMedicalExpensesOfOutpatientSurgery(Double medicalExpensesOfOutpatientSurgery) {
		this.medicalExpensesOfOutpatientSurgery = medicalExpensesOfOutpatientSurgery;
	}

	public Double getInsuredAmountForOutpatientBeforeAndAfterTheHospitalization() {
		return insuredAmountForOutpatientBeforeAndAfterTheHospitalization;
	}

	public void setInsuredAmountForOutpatientBeforeAndAfterTheHospitalization(
			Double insuredAmountForOutpatientBeforeAndAfterTheHospitalization) {
		this.insuredAmountForOutpatientBeforeAndAfterTheHospitalization = insuredAmountForOutpatientBeforeAndAfterTheHospitalization;
	}

	public Integer getOutpatientDays() {
		return outpatientDays;
	}

	public void setOutpatientDays(Integer outpatientDays) {
		this.outpatientDays = outpatientDays;
	}

	public Double getExactMedicalExpensesOfEmergency() {
		return exactMedicalExpensesOfEmergency;
	}

	public void setExactMedicalExpensesOfEmergency(Double exactMedicalExpensesOfEmergency) {
		this.exactMedicalExpensesOfEmergency = exactMedicalExpensesOfEmergency;
	}

	public Double getInpatientDays() {
		return inpatientDays;
	}

	public void setInpatientDays(Double inpatientDays) {
		this.inpatientDays = inpatientDays;
	}

	public Double getActualMedicalExpenseMultiple() {
		return actualMedicalExpenseMultiple;
	}

	public void setActualMedicalExpenseMultiple(Double actualMedicalExpenseMultiple) {
		this.actualMedicalExpenseMultiple = actualMedicalExpenseMultiple;
	}

	public Double getMultiple() {
		return multiple;
	}

	public void setMultiple(Double multiple) {
		this.multiple = multiple;
	}

	public Double getNumberOfDaysSetByFractureMultiple() {
		return numberOfDaysSetByFractureMultiple;
	}

	public void setNumberOfDaysSetByFractureMultiple(Double numberOfDaysSetByFractureMultiple) {
		this.numberOfDaysSetByFractureMultiple = numberOfDaysSetByFractureMultiple;
	}

	@Override
	public String obtainPaymentModelName() {
		return PaymentModelType.ADDITIONAL.label;
	}

	@Override
	public Class<? extends PaymentAmountModel> obtainClassType() {
		return AdditionalPaymentAmountModel.class;
	}

}
