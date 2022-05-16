package main.model.payment;

import main.model.payment.PaymentModelType;

public class HealthPaymentAmountModel extends PaymentAmountModel{

	/**
	 * 保險金額
	 */
	private Double insuranceAmount = 0.0;

	/**
	 * 累計已給付之各項保險金
	 */
	private Double cumulativelyPaidInsuranceAmount = 0.0;

	/**
	 * 單位投保數 (投保單位數)
	 */
	private Double agreementInsuredUnits = 0.0;

	/**
	 * 罹患癌症保險金（原位癌）
	 */
	private Double haveCancerInsuranceAmount = 0.0;

	/**
	 * 各項保險金給付總額
	 */
	private Double totalAmountEachInsuranceAmount = 0.0;

	/**
	 * 在家療養日數
	 */
	private Double daysOfRecuperationAtHome = 0.0;

	/**
	 * 住院日額
	 */
	private Double hospitalIncome = 0.0;
	
	
	/**
	 * 住院日額倍數
	 */
	private Double hospitalIncomeMultiple = 0.0;


	/**
	 * 急診實際醫療費用
	 */
	private Double actualEmergencyCost = 0.0;

	/**
	 * 實際緊急醫療轉送費用
	 */
	private Double actualEmergencyTransportAmount = 0.0;

	/**
	 * 投保等級之外科手術費用限額比例
	 */
	private Double insuranceLevelOfSurgicalCostLimitRatio = 0.0;

	/**
	 * 已收保險費
	 */
	private Double receivedInsuranceAmount = 0.0;

	/**
	 * 豁免保險費前仍交付之主契約及本附約保費
	 */
	private Double insuranceAmountOfmainAndAccessoryContractBeforeExempted = 0.0;

	/**
	 * 應豁免而未豁免之保費(不含本附約)
	 */
	private Double shouldBeExemptedInsuranceAmount = 0.0;

	/**
	 * 利息(年利率為0.025)
	 */
	private Double interest = 0.0;

	/**
	 * 投保單位之特定手術醫療保險金額
	 */
	private Double agreementInsuredUnitsOfSpecialSurgeryAmount = 0.0;

	/**
	 * 外科手術次數
	 */
	private Double numberOfSurgicalOperations = 0.0;

	/**
	 * 住院手術次數
	 */
	private Double numberOfInHospital = 0.0;

	/**
	 * 住院日數
	 */
	private Double inpatientDays = 0.0;

	/**
	 * 門診日數
	 */
	private Double outpatientDays = 0.0;

	/**
	 * 門診次數
	 */
	private Double numberOfOutpatient = 0.0;

	/**
	 * 門診或住院期間治療次數
	 */
	private Double numberOfTreatmentInHospital = 0.0;

	/**
	 * 門診放射線次數
	 */
	private Double numberOfOutpatientRadiation = 0.0;

	/**
	 * 門診化療次數
	 */
	private Double numberOfOutpatientChemotherapy = 0.0;

	/**
	 * 門診手術次數
	 */
	private Double numberOfOutpatientSurgery = 0.0;

	/**
	 * 實際病房費用
	 */
	private Double actualWardCost = 0.0;

	/**
	 * 實際醫療費用
	 */
	private Double actualMedicalCost = 0.0;

	/**
	 * 實際外科手術費用
	 */
	private Double actualSurgeryCost = 0.0;

	/**
	 * 已給付輕度重大疾病保險金
	 */
	private Double paidMildCriticalIllnessInsuranceAmount = 0.0;

	/**
	 * 實際門診手術醫療費用
	 */
	private Double actualOutpatientSurgeryCost = 0.0;

	/**
	 * 給付比例
	 */
	private Double paymentRatio = 0.0;

	/**
	 * 保額倍數
	 */
	private Double multiple = 0.0;

	/**
	 * 燒燙傷病房日數
	 */
	private Double burnWardDays = 0.0;

	/**
	 * 加護病房日數
	 */
	private Double iCUDays = 0.0;
	
	/**
	 * 當期未到期保費
	 */
	private Double currentUnexpiredPremiums = 0.0 ;
	 
	/**
	 * 失能器材購置保險金 
	 */
	private Double disabilityEquipmentPurchaseInsurance = 0.0;
	
	
	/**
	 * 健保給付倍數
	 */
	private Double heathInsuranceBenefitsMultiple = 0.0;
	
	/**
	 * 每單位金額
	 */
	private Double amountPerUnit = 0.0;
	
	public HealthPaymentAmountModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(Double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public Double getCumulativelyPaidInsuranceAmount() {
		return cumulativelyPaidInsuranceAmount;
	}

	public void setCumulativelyPaidInsuranceAmount(Double cumulativelyPaidInsuranceAmount) {
		this.cumulativelyPaidInsuranceAmount = cumulativelyPaidInsuranceAmount;
	}

	public Double getAgreementInsuredUnits() {
		return agreementInsuredUnits;
	}

	public void setAgreementInsuredUnits(Double agreementInsuredUnits) {
		this.agreementInsuredUnits = agreementInsuredUnits;
	}

	public Double getHaveCancerInsuranceAmount() {
		return haveCancerInsuranceAmount;
	}

	public void setHaveCancerInsuranceAmount(Double haveCancerInsuranceAmount) {
		this.haveCancerInsuranceAmount = haveCancerInsuranceAmount;
	}

	public Double getTotalAmountEachInsuranceAmount() {
		return totalAmountEachInsuranceAmount;
	}

	public void setTotalAmountEachInsuranceAmount(Double totalAmountEachInsuranceAmount) {
		this.totalAmountEachInsuranceAmount = totalAmountEachInsuranceAmount;
	}

	public Double getDaysOfRecuperationAtHome() {
		return daysOfRecuperationAtHome;
	}

	public void setDaysOfRecuperationAtHome(Double daysOfRecuperationAtHome) {
		this.daysOfRecuperationAtHome = daysOfRecuperationAtHome;
	}

	public Double getHospitalIncome() {
		return hospitalIncome;
	}

	public void setHospitalIncome(Double hospitalIncome) {
		this.hospitalIncome = hospitalIncome;
	}

	public Double getActualEmergencyCost() {
		return actualEmergencyCost;
	}

	public void setActualEmergencyCost(Double actualEmergencyCost) {
		this.actualEmergencyCost = actualEmergencyCost;
	}

	public Double getActualEmergencyTransportAmount() {
		return actualEmergencyTransportAmount;
	}

	public void setActualEmergencyTransportAmount(Double actualEmergencyTransportAmount) {
		this.actualEmergencyTransportAmount = actualEmergencyTransportAmount;
	}

	public Double getInsuranceLevelOfSurgicalCostLimitRatio() {
		return insuranceLevelOfSurgicalCostLimitRatio;
	}

	public void setInsuranceLevelOfSurgicalCostLimitRatio(Double insuranceLevelOfSurgicalCostLimitRatio) {
		this.insuranceLevelOfSurgicalCostLimitRatio = insuranceLevelOfSurgicalCostLimitRatio;
	}

	public Double getReceivedInsuranceAmount() {
		return receivedInsuranceAmount;
	}

	public void setReceivedInsuranceAmount(Double receivedInsuranceAmount) {
		this.receivedInsuranceAmount = receivedInsuranceAmount;
	}

	public Double getInsuranceAmountOfmainAndAccessoryContractBeforeExempted() {
		return insuranceAmountOfmainAndAccessoryContractBeforeExempted;
	}

	public void setInsuranceAmountOfmainAndAccessoryContractBeforeExempted(
			Double insuranceAmountOfmainAndAccessoryContractBeforeExempted) {
		this.insuranceAmountOfmainAndAccessoryContractBeforeExempted = insuranceAmountOfmainAndAccessoryContractBeforeExempted;
	}

	public Double getShouldBeExemptedInsuranceAmount() {
		return shouldBeExemptedInsuranceAmount;
	}

	public void setShouldBeExemptedInsuranceAmount(Double shouldBeExemptedInsuranceAmount) {
		this.shouldBeExemptedInsuranceAmount = shouldBeExemptedInsuranceAmount;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Double getAgreementInsuredUnitsOfSpecialSurgeryAmount() {
		return agreementInsuredUnitsOfSpecialSurgeryAmount;
	}

	public void setAgreementInsuredUnitsOfSpecialSurgeryAmount(Double agreementInsuredUnitsOfSpecialSurgeryAmount) {
		this.agreementInsuredUnitsOfSpecialSurgeryAmount = agreementInsuredUnitsOfSpecialSurgeryAmount;
	}

	public Double getNumberOfInHospital() {
		return numberOfInHospital;
	}

	public void setNumberOfInHospital(Double numberOfInHospital) {
		this.numberOfInHospital = numberOfInHospital;
	}

	public Double getInpatientDays() {
		return inpatientDays;
	}

	public void setInpatientDays(Double inpatientDays) {
		this.inpatientDays = inpatientDays;
	}

	public Double getOutpatientDays() {
		return outpatientDays;
	}

	public void setOutpatientDays(Double outpatientDays) {
		this.outpatientDays = outpatientDays;
	}

	public Double getNumberOfOutpatient() {
		return numberOfOutpatient;
	}

	public void setNumberOfOutpatient(Double numberOfOutpatient) {
		this.numberOfOutpatient = numberOfOutpatient;
	}

	public Double getNumberOfTreatmentInHospital() {
		return numberOfTreatmentInHospital;
	}

	public void setNumberOfTreatmentInHospital(Double numberOfTreatmentInHospital) {
		this.numberOfTreatmentInHospital = numberOfTreatmentInHospital;
	}

	public Double getActualWardCost() {
		return actualWardCost;
	}

	public void setActualWardCost(Double actualWardCost) {
		this.actualWardCost = actualWardCost;
	}

	public Double getActualMedicalCost() {
		return actualMedicalCost;
	}

	public void setActualMedicalCost(Double actualMedicalCost) {
		this.actualMedicalCost = actualMedicalCost;
	}

	public Double getActualSurgeryCost() {
		return actualSurgeryCost;
	}

	public void setActualSurgeryCost(Double actualSurgeryCost) {
		this.actualSurgeryCost = actualSurgeryCost;
	}

	public Double getPaidMildCriticalIllnessInsuranceAmount() {
		return paidMildCriticalIllnessInsuranceAmount;
	}

	public void setPaidMildCriticalIllnessInsuranceAmount(Double paidMildCriticalIllnessInsuranceAmount) {
		this.paidMildCriticalIllnessInsuranceAmount = paidMildCriticalIllnessInsuranceAmount;
	}

	public Double getActualOutpatientSurgeryCost() {
		return actualOutpatientSurgeryCost;
	}

	public void setActualOutpatientSurgeryCost(Double actualOutpatientSurgeryCost) {
		this.actualOutpatientSurgeryCost = actualOutpatientSurgeryCost;
	}

	public Double getPaymentRatio() {
		return paymentRatio;
	}

	public void setPaymentRatio(Double paymentRatio) {
		this.paymentRatio = paymentRatio;
	}

	public Double getMultiple() {
		return multiple;
	}

	public void setMultiple(Double multiple) {
		this.multiple = multiple;
	}

	public Double getBurnWardDays() {
		return burnWardDays;
	}

	public void setBurnWardDays(Double burnWardDays) {
		this.burnWardDays = burnWardDays;
	}

	public Double getiCUDays() {
		return iCUDays;
	}

	public void setiCUDays(Double iCUDays) {
		this.iCUDays = iCUDays;
	}

	public Double getCurrentUnexpiredPremiums() {
		return currentUnexpiredPremiums;
	}

	public void setCurrentUnexpiredPremiums(Double currentUnexpiredPremiums) {
		this.currentUnexpiredPremiums = currentUnexpiredPremiums;
	}

	public Double getDisabilityEquipmentPurchaseInsurance() {
		return disabilityEquipmentPurchaseInsurance;
	}

	public void setDisabilityEquipmentPurchaseInsurance(Double disabilityEquipmentPurchaseInsurance) {
		this.disabilityEquipmentPurchaseInsurance = disabilityEquipmentPurchaseInsurance;
	}

	public Double getNumberOfSurgicalOperations() {
		return numberOfSurgicalOperations;
	}

	public Double getNumberOfOutpatientRadiation() {
		return numberOfOutpatientRadiation;
	}

	public Double getNumberOfOutpatientChemotherapy() {
		return numberOfOutpatientChemotherapy;
	}

	public Double getNumberOfOutpatientSurgery() {
		return numberOfOutpatientSurgery;
	}

	public void setNumberOfSurgicalOperations(Double numberOfSurgicalOperations) {
		this.numberOfSurgicalOperations = numberOfSurgicalOperations;
	}

	public void setNumberOfOutpatientRadiation(Double numberOfOutpatientRadiation) {
		this.numberOfOutpatientRadiation = numberOfOutpatientRadiation;
	}

	public void setNumberOfOutpatientChemotherapy(Double numberOfOutpatientChemotherapy) {
		this.numberOfOutpatientChemotherapy = numberOfOutpatientChemotherapy;
	}

	public void setNumberOfOutpatientSurgery(Double numberOfOutpatientSurgery) {
		this.numberOfOutpatientSurgery = numberOfOutpatientSurgery;
	}

	public Double getHospitalIncomeMultiple() {
		return hospitalIncomeMultiple;
	}

	public void setHospitalIncomeMultiple(Double hospitalIncomeMultiple) {
		this.hospitalIncomeMultiple = hospitalIncomeMultiple;
	}

	public Double getHeathInsuranceBenefitsMultiple() {
		return heathInsuranceBenefitsMultiple;
	}

	public void setHeathInsuranceBenefitsMultiple(Double heathInsuranceBenefitsMultiple) {
		this.heathInsuranceBenefitsMultiple = heathInsuranceBenefitsMultiple;
	}

	public Double getAmountPerUnit() {
		return amountPerUnit;
	}

	public void setAmountPerUnit(Double amountPerUnit) {
		this.amountPerUnit = amountPerUnit;
	}

	@Override
	public String obtainPaymentModelName() {
		// TODO Auto-generated method stub
		return PaymentModelType.HEALTH.label;
	}

	@Override
	public Class<? extends PaymentAmountModel> obtainClassType() {
		// TODO Auto-generated method stub
		return HealthPaymentAmountModel.class;
	}

}
