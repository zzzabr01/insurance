package main.model;


/**
 * 綜合型保險
 * @author TPI
 *
 */
public class ComprehensiveInsurance extends CommonModel{
	
	/**
	 * 事故原因
	 */
	private String causeOfAccident = "";
	
	/**
	 * 手術
	 */
	private boolean surgery = false;
	
	/**
	 * 符合無理賠紀錄期間
	 */
	private boolean isNoClaimsHistoryDuringThePeriod = false;
	
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
	 * 未經健保給付
	 */
	private boolean withoutHealthInsurancePayment = false;
	
	
	/**
	 * 門診
	 */
	private boolean outpatient = false;
	
	/**
	 * 符合重大手術
	 */
	private boolean complianceMajorSurgery = false;
	
	/**
	 * 符合特定處置
	 */
	private boolean complianceSpecificTreatment = false;
	
	/**
	 * 住院
	 */
	private boolean isHospitalized = false;
	
	/**
	 * 原位癌
	 */
	private boolean cancerInSitu = false;
	
	/**
	 * 出院
	 */
	private boolean dischargeFromTheHospital = false;
	
	
	/**
	 * 緊急醫療轉送
	 */
	private boolean emergencyMedicalTransfer = false;
	
	
	/**
	 * 燒燙傷病房
	 */
	private boolean isBurnWard = false;
	
	/**
	 * 加護病房
	 */
	private boolean iCU = false;
	
	/**
	 * 精神疾病
	 */
	private boolean mentalIllness = false;
	
	/**
	 * 精神病或精神分裂
	 */
	private String mentalIllnessORschizophrenia = "";
	
	/**
	 * 骨折狀態
	 */
	private String fractureStatus = "";	
	/**
	 * 符合發生期間日數或能證明因果關係
	 */
	private boolean daysDuringTheOccurrenceOrProveCausality = false;
	
	/**
	 * 受監護宣告尚未撤銷者
	 */
	private boolean declarationOfGuardian = false;
	
	
	/**
	 * 意外事故項目
	 */
	private String accidentItem = "";
	
	/**
	 * 死亡
	 */
	private boolean isDeath = false;
	
	/**
	 * 繳費狀態
	 */
	private String paymentStatus = "";
	
	
	/**
	 * 長期照顧
	 */
	private boolean longTermCare = false;
	
	/**
	 * 殘廢等級
	 */
	private Integer disabilityLevel = 0;
	
	
	/**
	 * 符合重大燒燙傷定義
	 */
	private boolean  isBurnsAndScalds = false;
	
	/**
	 *  領取重大疾病保險金
	 */
	private boolean  receiveCriticalIllnessInsuranceAmount = false;
	
	/**
	 *  符合失能附表/符合殘廢附表
	 */
	private boolean isDisability = false;
	
	
	/**
	 * 免責期屆滿
	 */
	private boolean exemptionPeriodExpires = false;
	
	
	/**
	 * 定期申請
	 */
	private boolean regularApply = false;
	
	/**
	 * 同一事故先符合失能
	 */
	private boolean isTotalDisabilityInTheSameAccident = false;
	
	/**
	 * 保單年度
	 */
	private Integer  policyYear = 0;
	
	/**
	 * 符合全殘廢附表/符合完全失能附表
	 */
	private boolean isTotallyDisability = false;
	
	/**
	 * 繳費方式
	 */
	private String paymentMethod = "";

	
	/**
	 * 已領取生活扶助保險金
	 */
	private boolean receiveLifeSupportAmt = false;
	
	/**
	 * 符合罹癌條件
	 */
	private String isCancerRequirement = "";
	
	/**
	 * 初次罹患重大疾病
	 */
	private boolean criticalIllnessFirstTime = false;
	
	/**
	 * 符合重大疾病項目
	 */
	private boolean isCriticalIllness = false;
	
	/**
	 * 復效日起保險年度
	 */
	private Integer reinstatementDate = 0;
	
	
	 /**
	  * 死亡日期-保單生效日
	  */
	private Double daysBetweenDeathAndPolicyEffect = 0.0;
	
	
	/**
	 * 住院日數
	 */
	private Double inpatientDays = 0.0;
	
	/**
	 * 累計給付達總限額
	 */
	private boolean  accumulatedPayReachMaxAmount = false;
	
	
	/**
	 * 已給付項目
	 */
	private String itemAlreadyReceive = "";
	
	
	/**
	 * 除外責任
	 */
	private boolean exclusion = false;
	
	
	/**
	 *符合特定器官移植
	 */
	private boolean isOrganTransplant = false;
	
	/**
	 * 安寧病房
	 */
	private boolean hospice = false;
	
	/**
	 * 符合急診就醫
	 */
	private boolean isEmergencyMedicalTreatment = false;
	
	/**
	 * 同一事故原因
	 */
	private boolean isSameAccident = false;
	
	/**
	 * 符合入院及出院期間天數
	 */
	private boolean isMatchDaysDuringHospitalizedAndDischarged = false;
	
	/**
	 * 曾入住加護或燒燙傷病房
	 */
	private boolean haveBeenInICUAndBurnAndScalds = false;
	
	/**
	 * 累計總額A
	 * 累計總額(
		 住院醫療保險金＋
		 加護病房保險金＋
		 燒燙傷病房保險金＋
		 急診保險金＋
		 緊急醫療轉送保險金＋
		 住院前後門診保險金＋
		 出院療養保險＋
		 住院手術醫療保險金＋
		 門診手術醫療保險金＋
		 健康增值保險金
		 )>=住院日額*{2500}
	 */
	private boolean accumulativeTotalA = false;
	
	/**
	 * 累計總額B
	 * 累計總額(
		 住院醫療保險金＋
		 加護病房保險金＋
		 燒燙傷病房保險金＋
		 住院前後門診保險金＋
		 出院療養保險＋
		 住院手術醫療保險金＋
		 門診手術醫療保險金＋
		 健康增值保險金
		 )>=住院日額*{2500}
	 */
	private boolean accumulativeTotalB = false;
	
	/**
	 * 累計總額C
	 * 累計總額(
		 住院醫療保險金+
		 加護病房保險金+
		 燒燙傷病房保險金+
		 安寧病房保險金+
		 住院前後門診保險金+
		 住院療養保險金+
		 住院手術醫療保險金+
		 門診手術醫療保險金+
		 特定器官移植手術醫療保險金+
		 健康增值保險金
		 )>=年繳保險費總和*1.15
	 */
	private boolean accumulativeTotalC = false;
	
	/**
	 * 累計總額D
	 * 累計總額(
		 手術醫療保險金＋
		 重大手術慰問保險金＋
		 特定處置保險金＋
		 健康增值保險金
		 )>=年繳保險費總和*1.15
	 */
	private boolean accumulativeTotalD = false;
	
	/**
	 * 累計給付達到上限之給付項目
	 */
	private String maximumAccumulativeBenefit = "";
	
	
	public ComprehensiveInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getCauseOfAccident() {
		return causeOfAccident;
	}


	public void setCauseOfAccident(String causeOfAccident) {
		this.causeOfAccident = causeOfAccident;
	}


	public boolean isSurgery() {
		return surgery;
	}


	public void setSurgery(boolean surgery) {
		this.surgery = surgery;
	}


	public boolean isNoClaimsHistoryDuringThePeriod() {
		return isNoClaimsHistoryDuringThePeriod;
	}


	public void setNoClaimsHistoryDuringThePeriod(boolean isNoClaimsHistoryDuringThePeriod) {
		this.isNoClaimsHistoryDuringThePeriod = isNoClaimsHistoryDuringThePeriod;
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


	public boolean isComplianceMajorSurgery() {
		return complianceMajorSurgery;
	}


	public void setComplianceMajorSurgery(boolean complianceMajorSurgery) {
		this.complianceMajorSurgery = complianceMajorSurgery;
	}


	public boolean isComplianceSpecificTreatment() {
		return complianceSpecificTreatment;
	}


	public void setComplianceSpecificTreatment(boolean complianceSpecificTreatment) {
		this.complianceSpecificTreatment = complianceSpecificTreatment;
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


	public boolean isDischargeFromTheHospital() {
		return dischargeFromTheHospital;
	}


	public void setDischargeFromTheHospital(boolean dischargeFromTheHospital) {
		this.dischargeFromTheHospital = dischargeFromTheHospital;
	}


	public boolean isEmergencyMedicalTransfer() {
		return emergencyMedicalTransfer;
	}


	public void setEmergencyMedicalTransfer(boolean emergencyMedicalTransfer) {
		this.emergencyMedicalTransfer = emergencyMedicalTransfer;
	}


	public boolean isBurnWard() {
		return isBurnWard;
	}


	public void setBurnWard(boolean isBurnWard) {
		this.isBurnWard = isBurnWard;
	}


	public boolean isiCU() {
		return iCU;
	}


	public void setiCU(boolean iCU) {
		this.iCU = iCU;
	}


	public boolean isMentalIllness() {
		return mentalIllness;
	}


	public void setMentalIllness(boolean mentalIllness) {
		this.mentalIllness = mentalIllness;
	}


	public String getMentalIllnessORschizophrenia() {
		return mentalIllnessORschizophrenia;
	}


	public void setMentalIllnessORschizophrenia(String mentalIllnessORschizophrenia) {
		this.mentalIllnessORschizophrenia = mentalIllnessORschizophrenia;
	}


	public String getFractureStatus() {
		return fractureStatus;
	}


	public void setFractureStatus(String fractureStatus) {
		this.fractureStatus = fractureStatus;
	}


	public boolean isDaysDuringTheOccurrenceOrProveCausality() {
		return daysDuringTheOccurrenceOrProveCausality;
	}


	public void setDaysDuringTheOccurrenceOrProveCausality(boolean daysDuringTheOccurrenceOrProveCausality) {
		this.daysDuringTheOccurrenceOrProveCausality = daysDuringTheOccurrenceOrProveCausality;
	}


	public boolean isDeclarationOfGuardian() {
		return declarationOfGuardian;
	}


	public void setDeclarationOfGuardian(boolean declarationOfGuardian) {
		this.declarationOfGuardian = declarationOfGuardian;
	}


	public String getAccidentItem() {
		return accidentItem;
	}


	public void setAccidentItem(String accidentItem) {
		this.accidentItem = accidentItem;
	}


	public boolean isDeath() {
		return isDeath;
	}


	public void setDeath(boolean isDeath) {
		this.isDeath = isDeath;
	}


	public String getPaymentStatus() {
		return paymentStatus;
	}


	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}



	public boolean isLongTermCare() {
		return longTermCare;
	}


	public void setLongTermCare(boolean longTermCare) {
		this.longTermCare = longTermCare;
	}


	public Integer getDisabilityLevel() {
		return disabilityLevel;
	}


	public void setDisabilityLevel(Integer disabilityLevel) {
		this.disabilityLevel = disabilityLevel;
	}


	public boolean isBurnsAndScalds() {
		return isBurnsAndScalds;
	}


	public void setBurnsAndScalds(boolean isBurnsAndScalds) {
		this.isBurnsAndScalds = isBurnsAndScalds;
	}


	public boolean isReceiveCriticalIllnessInsuranceAmount() {
		return receiveCriticalIllnessInsuranceAmount;
	}


	public void setReceiveCriticalIllnessInsuranceAmount(boolean receiveCriticalIllnessInsuranceAmount) {
		this.receiveCriticalIllnessInsuranceAmount = receiveCriticalIllnessInsuranceAmount;
	}


	public boolean isDisability() {
		return isDisability;
	}


	public void setDisability(boolean isDisability) {
		this.isDisability = isDisability;
	}


	public boolean isExemptionPeriodExpires() {
		return exemptionPeriodExpires;
	}


	public void setExemptionPeriodExpires(boolean exemptionPeriodExpires) {
		this.exemptionPeriodExpires = exemptionPeriodExpires;
	}


	public boolean isRegularApply() {
		return regularApply;
	}


	public void setRegularApply(boolean regularApply) {
		this.regularApply = regularApply;
	}


	public boolean isTotalDisabilityInTheSameAccident() {
		return isTotalDisabilityInTheSameAccident;
	}


	public void setTotalDisabilityInTheSameAccident(boolean isTotalDisabilityInTheSameAccident) {
		this.isTotalDisabilityInTheSameAccident = isTotalDisabilityInTheSameAccident;
	}


	public Integer getPolicyYear() {
		return policyYear;
	}


	public void setPolicyYear(Integer policyYear) {
		this.policyYear = policyYear;
	}


	public boolean isTotallyDisability() {
		return isTotallyDisability;
	}


	public void setTotallyDisability(boolean isTotallyDisability) {
		this.isTotallyDisability = isTotallyDisability;
	}


	public String getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public boolean isReceiveLifeSupportAmt() {
		return receiveLifeSupportAmt;
	}


	public void setReceiveLifeSupportAmt(boolean receiveLifeSupportAmt) {
		this.receiveLifeSupportAmt = receiveLifeSupportAmt;
	}


	public String getIsCancerRequirement() {
		return isCancerRequirement;
	}


	public void setIsCancerRequirement(String isCancerRequirement) {
		this.isCancerRequirement = isCancerRequirement;
	}


	public boolean isCriticalIllnessFirstTime() {
		return criticalIllnessFirstTime;
	}


	public void setCriticalIllnessFirstTime(boolean criticalIllnessFirstTime) {
		this.criticalIllnessFirstTime = criticalIllnessFirstTime;
	}


	public boolean isCriticalIllness() {
		return isCriticalIllness;
	}


	public void setCriticalIllness(boolean isCriticalIllness) {
		this.isCriticalIllness = isCriticalIllness;
	}


	public Integer getReinstatementDate() {
		return reinstatementDate;
	}


	public void setReinstatementDate(Integer reinstatementDate) {
		this.reinstatementDate = reinstatementDate;
	}


	public Double getDaysBetweenDeathAndPolicyEffect() {
		return daysBetweenDeathAndPolicyEffect;
	}


	public void setDaysBetweenDeathAndPolicyEffect(Double daysBetweenDeathAndPolicyEffect) {
		this.daysBetweenDeathAndPolicyEffect = daysBetweenDeathAndPolicyEffect;
	}



	public Double getInpatientDays() {
		return inpatientDays;
	}


	public void setInpatientDays(Double inpatientDays) {
		this.inpatientDays = inpatientDays;
	}


	public boolean isAccumulatedPayReachMaxAmount() {
		return accumulatedPayReachMaxAmount;
	}


	public void setAccumulatedPayReachMaxAmount(boolean accumulatedPayReachMaxAmount) {
		this.accumulatedPayReachMaxAmount = accumulatedPayReachMaxAmount;
	}



	public boolean isAccumulativeTotalA() {
		return accumulativeTotalA;
	}


	public boolean isAccumulativeTotalB() {
		return accumulativeTotalB;
	}


	public boolean isAccumulativeTotalC() {
		return accumulativeTotalC;
	}


	public boolean isAccumulativeTotalD() {
		return accumulativeTotalD;
	}


	public String getMaximumAccumulativeBenefit() {
		return maximumAccumulativeBenefit;
	}


	public void setAccumulativeTotalA(boolean accumulativeTotalA) {
		this.accumulativeTotalA = accumulativeTotalA;
	}


	public void setAccumulativeTotalB(boolean accumulativeTotalB) {
		this.accumulativeTotalB = accumulativeTotalB;
	}


	public void setAccumulativeTotalC(boolean accumulativeTotalC) {
		this.accumulativeTotalC = accumulativeTotalC;
	}


	public void setAccumulativeTotalD(boolean accumulativeTotalD) {
		this.accumulativeTotalD = accumulativeTotalD;
	}


	public void setMaximumAccumulativeBenefit(String maximumAccumulativeBenefit) {
		this.maximumAccumulativeBenefit = maximumAccumulativeBenefit;
	}


	public String getItemAlreadyReceive() {
		return itemAlreadyReceive;
	}


	public void setItemAlreadyReceive(String itemAlreadyReceive) {
		this.itemAlreadyReceive = itemAlreadyReceive;
	}


	public boolean isExclusion() {
		return exclusion;
	}


	public void setExclusion(boolean exclusion) {
		this.exclusion = exclusion;
	}


	public boolean isOrganTransplant() {
		return isOrganTransplant;
	}


	public void setOrganTransplant(boolean isOrganTransplant) {
		this.isOrganTransplant = isOrganTransplant;
	}


	public boolean isHospice() {
		return hospice;
	}


	public void setHospice(boolean hospice) {
		this.hospice = hospice;
	}


	public boolean isEmergencyMedicalTreatment() {
		return isEmergencyMedicalTreatment;
	}


	public void setEmergencyMedicalTreatment(boolean isEmergencyMedicalTreatment) {
		this.isEmergencyMedicalTreatment = isEmergencyMedicalTreatment;
	}


	public boolean isSameAccident() {
		return isSameAccident;
	}


	public void setSameAccident(boolean isSameAccident) {
		this.isSameAccident = isSameAccident;
	}


	public boolean isMatchDaysDuringHospitalizedAndDischarged() {
		return isMatchDaysDuringHospitalizedAndDischarged;
	}


	public void setMatchDaysDuringHospitalizedAndDischarged(boolean isMatchDaysDuringHospitalizedAndDischarged) {
		this.isMatchDaysDuringHospitalizedAndDischarged = isMatchDaysDuringHospitalizedAndDischarged;
	}


	public boolean isHaveBeenInICUAndBurnAndScalds() {
		return haveBeenInICUAndBurnAndScalds;
	}


	public void setHaveBeenInICUAndBurnAndScalds(boolean haveBeenInICUAndBurnAndScalds) {
		this.haveBeenInICUAndBurnAndScalds = haveBeenInICUAndBurnAndScalds;
	}

	

	
}
