package main.model;

import java.util.Date;

public class InjuryInsurance extends CommonModel{
	
	/**
	 * 死亡
	 */
	private boolean isDeath;
	
	/**
	 * 事故原因
	 */
	private String causeOfAccident;
	
	/**
	 * 意外事故項目
	 */
	private String accidentItem;
	
	/**
	 * 兵災或其他暴動
	 */
	private boolean militaryDisasterOrOtherRiot;
	
	/**
	 * 受監護宣告尚未撤銷者
	 */
	private boolean declarationOfGuardian;
	
	/**
	 * 符合失能附表
	 */
	private boolean isDisability;
	
	/**
	 * 投保身份就醫
	 */
	private String hospitalizeWithInsuredStatus;
	
	/**
	 * 骨折狀態
	 */
	private String fractureStatus;
	
	/**
	 * 住院
	 */
	private boolean isHospitalized;
	
	/**
	 * 住進加護病房或燒燙傷病房治療期間
	 */
	private boolean isInICUOrBurnWard;
	
	/**
	 * 門診
	 */
	private boolean outpatient;
	
	/**
	 * 保單幣別
	 */
	private String insurancePolicyCurrency;
	
	/**
	 * 海外發生
	 */
	private boolean isOccurredOverseas;
	
	/**
	 * 突發疾病
	 */
	private boolean isSuddenIllness;
	
	/**
	 * 失能給付金額(累計)
	 */
	private String amountOfDisability;
	
	/**
	 * 已給付項目
	 */
	private String itemAlreadyReceive;
	
	/**
	 * 符合重大燒燙傷定義
	 */
	private boolean isBurnsAndScalds;
	
	/**
	 * 集體食物中毒
	 */
	private boolean isMassPoisoning;
	
	/**
	 * 緊急醫療處理
	 */
	private boolean isEmergencyMedicalTreatment;
	
	/**
	 * 契約消滅註記
	 */
	private boolean contractAnnihilation;

	

	public InjuryInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InjuryInsurance(String productNo, Date productEffectiveDate, Integer insuranceAge, Integer actualAge,
			Date policyEffectiveDate, Date policySuspensionDate, Date caseAccidentDate) {
		super(productNo, productEffectiveDate, insuranceAge, actualAge, policyEffectiveDate, policySuspensionDate,
				caseAccidentDate);
		// TODO Auto-generated constructor stub
	}

	public boolean isDeath() {
		return isDeath;
	}

	public void setDeath(boolean isDeath) {
		this.isDeath = isDeath;
	}

	public String getCauseOfAccident() {
		return causeOfAccident;
	}

	public void setCauseOfAccident(String causeOfAccident) {
		this.causeOfAccident = causeOfAccident;
	}

	public String getAccidentItem() {
		return accidentItem;
	}

	public void setAccidentItem(String accidentItem) {
		this.accidentItem = accidentItem;
	}

	public boolean isMilitaryDisasterOrOtherRiot() {
		return militaryDisasterOrOtherRiot;
	}

	public void setMilitaryDisasterOrOtherRiot(boolean militaryDisasterOrOtherRiot) {
		this.militaryDisasterOrOtherRiot = militaryDisasterOrOtherRiot;
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

	public String getHospitalizeWithInsuredStatus() {
		return hospitalizeWithInsuredStatus;
	}

	public void setHospitalizeWithInsuredStatus(String hospitalizeWithInsuredStatus) {
		this.hospitalizeWithInsuredStatus = hospitalizeWithInsuredStatus;
	}

	public String getFractureStatus() {
		return fractureStatus;
	}

	public void setFractureStatus(String fractureStatus) {
		this.fractureStatus = fractureStatus;
	}

	public boolean isHospitalized() {
		return isHospitalized;
	}

	public void setHospitalized(boolean isHospitalized) {
		this.isHospitalized = isHospitalized;
	}

	public boolean isInICUOrBurnWard() {
		return isInICUOrBurnWard;
	}

	public void setInICUOrBurnWard(boolean isInICUOrBurnWard) {
		this.isInICUOrBurnWard = isInICUOrBurnWard;
	}

	public boolean isOutpatient() {
		return outpatient;
	}

	public void setOutpatient(boolean outpatient) {
		this.outpatient = outpatient;
	}

	public String getInsurancePolicyCurrency() {
		return insurancePolicyCurrency;
	}

	public void setInsurancePolicyCurrency(String insurancePolicyCurrency) {
		this.insurancePolicyCurrency = insurancePolicyCurrency;
	}

	public boolean isOccurredOverseas() {
		return isOccurredOverseas;
	}

	public void setOccurredOverseas(boolean isOccurredOverseas) {
		this.isOccurredOverseas = isOccurredOverseas;
	}

	public boolean isSuddenIllness() {
		return isSuddenIllness;
	}

	public void setSuddenIllness(boolean isSuddenIllness) {
		this.isSuddenIllness = isSuddenIllness;
	}

	public String getAmountOfDisability() {
		return amountOfDisability;
	}

	public void setAmountOfDisability(String amountOfDisability) {
		this.amountOfDisability = amountOfDisability;
	}

	public String getItemAlreadyReceive() {
		return itemAlreadyReceive;
	}

	public void setItemAlreadyReceive(String itemAlreadyReceive) {
		this.itemAlreadyReceive = itemAlreadyReceive;
	}

	public boolean isBurnsAndScalds() {
		return isBurnsAndScalds;
	}

	public void setBurnsAndScalds(boolean isBurnsAndScalds) {
		this.isBurnsAndScalds = isBurnsAndScalds;
	}

	public boolean isMassPoisoning() {
		return isMassPoisoning;
	}

	public void setMassPoisoning(boolean isMassPoisoning) {
		this.isMassPoisoning = isMassPoisoning;
	}

	public boolean isEmergencyMedicalTreatment() {
		return isEmergencyMedicalTreatment;
	}

	public void setEmergencyMedicalTreatment(boolean isEmergencyMedicalTreatment) {
		this.isEmergencyMedicalTreatment = isEmergencyMedicalTreatment;
	}

	public boolean isContractAnnihilation() {
		return contractAnnihilation;
	}

	public void setContractAnnihilation(boolean contractAnnihilation) {
		this.contractAnnihilation = contractAnnihilation;
	}
	
	
	
	
}
