package main.model;

public class HealthInsurance extends CommonModel {

	/**
	 * 事故原因
	 */
	private String causeOfAccident = "";

	/**
	 * 死亡
	 */
	private boolean isDeath = false;

	/**
	 * 住院
	 */
	private boolean isHospitalized = false;

	/**
	 * 原位癌
	 */
	private boolean cancerInSitu = false;

	/**
	 * 一般手術
	 */
	private boolean generalSurgery = false;

	/**
	 * 受監護宣告尚未撤銷者
	 */
	private boolean declarationOfGuardian = false;

	/**
	 * 符合失能附表
	 */
	private boolean isDisability = false;

	/**
	 * 加護病房
	 */
	private boolean iCU = false;

	/**
	 * 燒燙傷病房
	 */
	private boolean isBurnWard = false;

	/**
	 * 出院
	 */
	private boolean dischargeFromTheHospital = false;

	/**
	 * 符合特定手術
	 */
	private boolean complianceSpecialSurgery = false;

	/**
	 * 符合重大手術
	 */
	private boolean complianceMajorSurgery = false;

	/**
	 * 未經健保給付
	 */
	private boolean withoutHealthInsurancePayment = false;

	/**
	 * 門診
	 */
	private boolean outpatient = false;

	/**
	 * 急診
	 */
	private boolean emergency = false;

	/**
	 * 緊急醫療轉送
	 */
	private boolean emergencyMedicalTransfer = false;

	/**
	 * 長期照顧
	 */
	private boolean longTermCare = false;

	/**
	 * 定期申請
	 */
	private boolean regularCare = false;


	/**
	 * 骨折狀態
	 */
	private String fractureStatus = "";

	/**
	 * 曾入住加護或燒燙傷病房
	 */
	private boolean haveBeenInICUAndBurnAndScalds = false;

	/**
	 * 住院期間
	 */
	private String duringHospitalization = "";

	/**
	 * 放射線治療
	 */
	private boolean radiationTherapy = false;

	/**
	 * 化學治療
	 */
	private boolean chemotherapy = false;

	/**
	 * 手術
	 */
	private boolean surgery = false;

	/**
	 * 外科處理
	 */
	private boolean surgicalTreatment = false;

	/**
	 * 住院治療
	 */
	private boolean hospitalization = false;

	/**
	 * 門診治療
	 */
	private boolean outpatientTreatment = false;

	/**
	 * 義肢裝設
	 */
	private boolean prostheticInstallation = false;

	/**
	 * 義齒裝設
	 */
	private boolean dentureInstallation = false;

	/**
	 * 乳房重建
	 */
	private boolean breastReconstruction = false;

	/**
	 * 骨髓移植
	 */
	private boolean boneMarrowTransplant = false;

	/**
	 * 符合重大疾病
	 */
	private boolean isMajorDisease = false;

	/**
	 * 符合重大燒燙傷
	 */
	private boolean isBurnAndScalds = false;

	/**
	 * 符合給付項目
	 */
	private String isPaymentList = "";

	/**
	 * 等待期罹癌
	 */
	private boolean cancerInWaitingPeriod = false;

	/**
	 * 保單連續有效
	 */
	private Integer continuouslyOfInsurance = 0;

	/**
	 * 無理賠紀錄年度
	 */
	private Integer noClaimsRecordYear = 0;

	/**
	 * 符合保險金項目
	 */
	private boolean isInsuranceAmountList = false;

	/**
	 * 曾罹患癌症
	 */
	private boolean diagnosedWithCancer = false;

	/**
	 * 身故後罹癌
	 */
	private boolean cancerAfterDead = false;

	/**
	 * 免責期屆滿
	 */
	private boolean exemptionPeriodExpire = false;

	/**
	 * 疾病程度
	 */
	private String illnessDegree = "";

	/**
	 * 繳費狀態
	 */
	private String paymentStatus = "";

	/**
	 * 累計給付達到上限之給付項目
	 */
	private String maximumAccumulativeBenefit = "";

	/**
	 * 累計已給付之各項保險金類型A
	 */
	private boolean maximumAccumulativeBenefitForEachInsuranceItemTypeA = false;

	/**
	 * 累計已給付之各項保險金類型B
	 */
	private boolean maximumAccumulativeBenefitForEachInsuranceItemTypeB = false;

	/**
	 * 累計已給付之各項保險金類型C
	 */
	private boolean maximumAccumulativeBenefitForEachInsuranceItemTypeC = false;

	/**
	 * 累計已給付之各項保險金類型D
	 */
	private boolean maximumAccumulativeBenefitForEachInsuranceItemTypeD = false;

	/**
	 * 符合完全失能附表
	 */
	private boolean isTotallyDisability = false;

	/**
	 * 殘廢等級
	 */
	private Integer disabilityLevel = 0;

	/**
	 * 符合入院及出院期間天數
	 */
	private boolean isInAndOutHospitalDays = false;

	/**
	 * 已給付項目
	 */
	private String itemAlreadyReceive = "";

	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCauseOfAccident() {
		return causeOfAccident;
	}

	public void setCauseOfAccident(String causeOfAccident) {
		this.causeOfAccident = causeOfAccident;
	}

	public boolean isDeath() {
		return isDeath;
	}

	public void setDeath(boolean isDeath) {
		this.isDeath = isDeath;
	}

	public boolean isHospitalized() {
		return isHospitalized;
	}

	public void setHospitalized(boolean isHospitalized) {
		this.isHospitalized = isHospitalized;
	}

	public boolean isCancerInSitu() {
		return cancerInSitu;
	}

	public void setCancerInSitu(boolean cancerInSitu) {
		this.cancerInSitu = cancerInSitu;
	}

	public boolean isGeneralSurgery() {
		return generalSurgery;
	}

	public void setGeneralSurgery(boolean generalSurgery) {
		this.generalSurgery = generalSurgery;
	}

	public boolean isDeclarationOfGuardian() {
		return declarationOfGuardian;
	}

	public void setDeclarationOfGuardian(boolean declarationOfGuardian) {
		this.declarationOfGuardian = declarationOfGuardian;
	}

	public boolean isDisability() {
		return isDisability;
	}

	public void setDisability(boolean isDisability) {
		this.isDisability = isDisability;
	}

	public boolean isiCU() {
		return iCU;
	}

	public void setiCU(boolean iCU) {
		this.iCU = iCU;
	}

	public boolean isBurnWard() {
		return isBurnWard;
	}

	public void setBurnWard(boolean isBurnWard) {
		this.isBurnWard = isBurnWard;
	}

	public boolean isDischargeFromTheHospital() {
		return dischargeFromTheHospital;
	}

	public void setDischargeFromTheHospital(boolean dischargeFromTheHospital) {
		this.dischargeFromTheHospital = dischargeFromTheHospital;
	}

	public boolean isComplianceSpecialSurgery() {
		return complianceSpecialSurgery;
	}

	public void setComplianceSpecialSurgery(boolean complianceSpecialSurgery) {
		this.complianceSpecialSurgery = complianceSpecialSurgery;
	}

	public boolean isComplianceMajorSurgery() {
		return complianceMajorSurgery;
	}

	public void setComplianceMajorSurgery(boolean complianceMajorSurgery) {
		this.complianceMajorSurgery = complianceMajorSurgery;
	}

	public boolean isWithoutHealthInsurancePayment() {
		return withoutHealthInsurancePayment;
	}

	public void setWithoutHealthInsurancePayment(boolean withoutHealthInsurancePayment) {
		this.withoutHealthInsurancePayment = withoutHealthInsurancePayment;
	}

	public boolean isOutpatient() {
		return outpatient;
	}

	public void setOutpatient(boolean outpatient) {
		this.outpatient = outpatient;
	}

	public boolean isEmergency() {
		return emergency;
	}

	public void setEmergency(boolean emergency) {
		this.emergency = emergency;
	}

	public boolean isEmergencyMedicalTransfer() {
		return emergencyMedicalTransfer;
	}

	public void setEmergencyMedicalTransfer(boolean emergencyMedicalTransfer) {
		this.emergencyMedicalTransfer = emergencyMedicalTransfer;
	}

	public boolean isLongTermCare() {
		return longTermCare;
	}

	public void setLongTermCare(boolean longTermCare) {
		this.longTermCare = longTermCare;
	}

	public boolean isRegularCare() {
		return regularCare;
	}

	public void setRegularCare(boolean regularCare) {
		this.regularCare = regularCare;
	}
	
	public String getFractureStatus() {
		return fractureStatus;
	}

	public void setFractureStatus(String fractureStatus) {
		this.fractureStatus = fractureStatus;
	}

	public boolean isHaveBeenInICUAndBurnAndScalds() {
		return haveBeenInICUAndBurnAndScalds;
	}

	public void setHaveBeenInICUAndBurnAndScalds(boolean haveBeenInICUAndBurnAndScalds) {
		this.haveBeenInICUAndBurnAndScalds = haveBeenInICUAndBurnAndScalds;
	}

	public String getDuringHospitalization() {
		return duringHospitalization;
	}

	public void setDuringHospitalization(String duringHospitalization) {
		this.duringHospitalization = duringHospitalization;
	}

	public boolean isRadiationTherapy() {
		return radiationTherapy;
	}

	public void setRadiationTherapy(boolean radiationTherapy) {
		this.radiationTherapy = radiationTherapy;
	}

	public boolean isChemotherapy() {
		return chemotherapy;
	}

	public void setChemotherapy(boolean chemotherapy) {
		this.chemotherapy = chemotherapy;
	}

	public boolean isSurgery() {
		return surgery;
	}

	public void setSurgery(boolean surgery) {
		this.surgery = surgery;
	}

	public boolean isSurgicalTreatment() {
		return surgicalTreatment;
	}

	public void setSurgicalTreatment(boolean surgicalTreatment) {
		this.surgicalTreatment = surgicalTreatment;
	}

	public boolean isHospitalization() {
		return hospitalization;
	}

	public void setHospitalization(boolean hospitalization) {
		this.hospitalization = hospitalization;
	}

	public boolean isOutpatientTreatment() {
		return outpatientTreatment;
	}

	public void setOutpatientTreatment(boolean outpatientTreatment) {
		this.outpatientTreatment = outpatientTreatment;
	}

	public boolean isProstheticInstallation() {
		return prostheticInstallation;
	}

	public void setProstheticInstallation(boolean prostheticInstallation) {
		this.prostheticInstallation = prostheticInstallation;
	}

	public boolean isDentureInstallation() {
		return dentureInstallation;
	}

	public void setDentureInstallation(boolean dentureInstallation) {
		this.dentureInstallation = dentureInstallation;
	}

	public boolean isBreastReconstruction() {
		return breastReconstruction;
	}

	public void setBreastReconstruction(boolean breastReconstruction) {
		this.breastReconstruction = breastReconstruction;
	}

	public boolean isBoneMarrowTransplant() {
		return boneMarrowTransplant;
	}

	public void setBoneMarrowTransplant(boolean boneMarrowTransplant) {
		this.boneMarrowTransplant = boneMarrowTransplant;
	}

	public boolean isMajorDisease() {
		return isMajorDisease;
	}

	public void setMajorDisease(boolean isMajorDisease) {
		this.isMajorDisease = isMajorDisease;
	}

	public boolean isBurnAndScalds() {
		return isBurnAndScalds;
	}

	public void setBurnAndScalds(boolean isBurnAndScalds) {
		this.isBurnAndScalds = isBurnAndScalds;
	}

	public String getIsPaymentList() {
		return isPaymentList;
	}

	public void setIsPaymentList(String isPaymentList) {
		this.isPaymentList = isPaymentList;
	}

	public boolean isCancerInWaitingPeriod() {
		return cancerInWaitingPeriod;
	}

	public void setCancerInWaitingPeriod(boolean cancerInWaitingPeriod) {
		this.cancerInWaitingPeriod = cancerInWaitingPeriod;
	}

	public Integer getContinuouslyOfInsurance() {
		return continuouslyOfInsurance;
	}

	public void setContinuouslyOfInsurance(Integer continuouslyOfInsurance) {
		this.continuouslyOfInsurance = continuouslyOfInsurance;
	}

	public Integer getNoClaimsRecordYear() {
		return noClaimsRecordYear;
	}

	public void setNoClaimsRecordYear(Integer noClaimsRecordYear) {
		this.noClaimsRecordYear = noClaimsRecordYear;
	}

	public boolean isInsuranceAmountList() {
		return isInsuranceAmountList;
	}

	public void setInsuranceAmountList(boolean isInsuranceAmountList) {
		this.isInsuranceAmountList = isInsuranceAmountList;
	}

	public boolean isDiagnosedWithCancer() {
		return diagnosedWithCancer;
	}

	public void setDiagnosedWithCancer(boolean diagnosedWithCancer) {
		this.diagnosedWithCancer = diagnosedWithCancer;
	}

	public boolean isCancerAfterDead() {
		return cancerAfterDead;
	}

	public void setCancerAfterDead(boolean cancerAfterDead) {
		this.cancerAfterDead = cancerAfterDead;
	}

	public boolean isExemptionPeriodExpire() {
		return exemptionPeriodExpire;
	}

	public void setExemptionPeriodExpire(boolean exemptionPeriodExpire) {
		this.exemptionPeriodExpire = exemptionPeriodExpire;
	}

	public String getIllnessDegree() {
		return illnessDegree;
	}

	public void setIllnessDegree(String illnessDegree) {
		this.illnessDegree = illnessDegree;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getMaximumAccumulativeBenefit() {
		return maximumAccumulativeBenefit;
	}

	

	public boolean isMaximumAccumulativeBenefitForEachInsuranceItemTypeA() {
		return maximumAccumulativeBenefitForEachInsuranceItemTypeA;
	}

	public void setMaximumAccumulativeBenefitForEachInsuranceItemTypeA(
			boolean maximumAccumulativeBenefitForEachInsuranceItemTypeA) {
		this.maximumAccumulativeBenefitForEachInsuranceItemTypeA = maximumAccumulativeBenefitForEachInsuranceItemTypeA;
	}

	public boolean isMaximumAccumulativeBenefitForEachInsuranceItemTypeB() {
		return maximumAccumulativeBenefitForEachInsuranceItemTypeB;
	}

	public void setMaximumAccumulativeBenefitForEachInsuranceItemTypeB(
			boolean maximumAccumulativeBenefitForEachInsuranceItemTypeB) {
		this.maximumAccumulativeBenefitForEachInsuranceItemTypeB = maximumAccumulativeBenefitForEachInsuranceItemTypeB;
	}

	public boolean isMaximumAccumulativeBenefitForEachInsuranceItemTypeC() {
		return maximumAccumulativeBenefitForEachInsuranceItemTypeC;
	}

	public void setMaximumAccumulativeBenefitForEachInsuranceItemTypeC(
			boolean maximumAccumulativeBenefitForEachInsuranceItemTypeC) {
		this.maximumAccumulativeBenefitForEachInsuranceItemTypeC = maximumAccumulativeBenefitForEachInsuranceItemTypeC;
	}

	public boolean isMaximumAccumulativeBenefitForEachInsuranceItemTypeD() {
		return maximumAccumulativeBenefitForEachInsuranceItemTypeD;
	}

	public void setMaximumAccumulativeBenefitForEachInsuranceItemTypeD(
			boolean maximumAccumulativeBenefitForEachInsuranceItemTypeD) {
		this.maximumAccumulativeBenefitForEachInsuranceItemTypeD = maximumAccumulativeBenefitForEachInsuranceItemTypeD;
	}

	public void setMaximumAccumulativeBenefit(String maximumAccumulativeBenefit) {
		this.maximumAccumulativeBenefit = maximumAccumulativeBenefit;
	}

	public boolean isTotallyDisability() {
		return isTotallyDisability;
	}

	public void setTotallyDisability(boolean isTotallyDisability) {
		this.isTotallyDisability = isTotallyDisability;
	}

	public Integer getDisabilityLevel() {
		return disabilityLevel;
	}

	public void setDisabilityLevel(Integer disabilityLevel) {
		this.disabilityLevel = disabilityLevel;
	}

	public boolean isInAndOutHospitalDays() {
		return isInAndOutHospitalDays;
	}

	public void setInAndOutHospitalDays(boolean isInAndOutHospitalDays) {
		this.isInAndOutHospitalDays = isInAndOutHospitalDays;
	}

	public String getItemAlreadyReceive() {
		return itemAlreadyReceive;
	}

	public void setItemAlreadyReceive(String itemAlreadyReceive) {
		this.itemAlreadyReceive = itemAlreadyReceive;
	}

}
