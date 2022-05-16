package main.model;

/**
 * 附加條件
 * 
 * @author TPI
 *
 */
public class AdditionalConditions extends CommonModel {

	/**
	 * 事故原因
	 */
	private String causeOfAccident = "";

	/**
	 * 符合重大燒燙傷定義
	 */
	private boolean isBurnsAndScalds = false;

	/**
	 * 符合重大燒燙傷程度表
	 */
	private boolean isBurnAndScaldsDegreeTable = false;

	/**
	 * 死亡
	 */
	private boolean isDeath = false;

	/**
	 * 特定傷害事故
	 */
	private boolean isSpecificInjury = false;

	/**
	 * 受監護宣告尚未撤銷者
	 */
	private boolean declarationOfGuardian = false;

	/**
	 * 符合發生期間日數或能證明因果關係
	 */
	private boolean daysDuringTheOccurrenceOrProveCausality = false;

	/**
	 * 符合完全失能附表
	 */
	private boolean isTotallyDisability = false;

	/**
	 * 意外事故項目
	 */
	private String accidentItem = "";

	/**
	 * 符合失能附表
	 */
	private boolean isDisability = false;

	/**
	 * 住院
	 */
	private boolean isHospitalized = false;

	/**
	 * 住燒燙傷病房
	 */
	private boolean isBurnWard = false;

	/**
	 * 骨折狀態
	 */
	private String fractureStatus = "";

	/**
	 * 住加護病房
	 */
	private boolean isICU = false;

	/**
	 * 投保身分就醫
	 */
	private String hospitalizeWithInsuredStatus = "";

	/**
	 * 門診手術
	 */
	private boolean isOutpatientSurgery = false;

	/**
	 * 門診
	 */
	private boolean outpatient = false;

	/**
	 * 符合入院及出院期間天數
	 */
	private boolean isMatchDaysDuringHospitalizedAndDischarged = false;

	/**
	 * 同一事故原因
	 */
	private boolean isSameAccident = false;

	/**
	 * 符合急診就醫定義
	 */
	private boolean isEmergencyMedicalTreatment = false;

	/**
	 * 已給付項目
	 */
	private String itemAlreadyReceive = "";

	/**
	 * 契約消滅註記
	 */
	private boolean contractAnnihilation = false;

	public AdditionalConditions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCauseOfAccident() {
		return causeOfAccident;
	}

	public void setCauseOfAccident(String causeOfAccident) {
		this.causeOfAccident = causeOfAccident;
	}

	public boolean isBurnsAndScalds() {
		return isBurnsAndScalds;
	}

	public void setBurnsAndScalds(boolean isBurnsAndScalds) {
		this.isBurnsAndScalds = isBurnsAndScalds;
	}

	public boolean isBurnAndScaldsDegreeTable() {
		return isBurnAndScaldsDegreeTable;
	}

	public void setBurnAndScaldsDegreeTable(boolean isBurnAndScaldsDegreeTable) {
		this.isBurnAndScaldsDegreeTable = isBurnAndScaldsDegreeTable;
	}

	public boolean isDeath() {
		return isDeath;
	}

	public void setDeath(boolean isDeath) {
		this.isDeath = isDeath;
	}

	public boolean isSpecificInjury() {
		return isSpecificInjury;
	}

	public void setSpecificInjury(boolean isSpecificInjury) {
		this.isSpecificInjury = isSpecificInjury;
	}

	public boolean isDeclarationOfGuardian() {
		return declarationOfGuardian;
	}

	public void setDeclarationOfGuardian(boolean declarationOfGuardian) {
		this.declarationOfGuardian = declarationOfGuardian;
	}

	public boolean isDaysDuringTheOccurrenceOrProveCausality() {
		return daysDuringTheOccurrenceOrProveCausality;
	}

	public void setDaysDuringTheOccurrenceOrProveCausality(boolean daysDuringTheOccurrenceOrProveCausality) {
		this.daysDuringTheOccurrenceOrProveCausality = daysDuringTheOccurrenceOrProveCausality;
	}

	public boolean isTotallyDisability() {
		return isTotallyDisability;
	}

	public void setTotallyDisability(boolean isTotallyDisability) {
		this.isTotallyDisability = isTotallyDisability;
	}

	public String getAccidentItem() {
		return accidentItem;
	}

	public void setAccidentItem(String accidentItem) {
		this.accidentItem = accidentItem;
	}

	public boolean isDisability() {
		return isDisability;
	}

	public void setDisability(boolean isDisability) {
		this.isDisability = isDisability;
	}

	public boolean isHospitalized() {
		return isHospitalized;
	}

	public void setHospitalized(boolean isHospitalized) {
		this.isHospitalized = isHospitalized;
	}

	public boolean isBurnWard() {
		return isBurnWard;
	}

	public void setBurnWard(boolean isBurnWard) {
		this.isBurnWard = isBurnWard;
	}

	public String getFractureStatus() {
		return fractureStatus;
	}

	public void setFractureStatus(String fractureStatus) {
		this.fractureStatus = fractureStatus;
	}

	public boolean isICU() {
		return isICU;
	}

	public void setICU(boolean isICU) {
		this.isICU = isICU;
	}

	public String getHospitalizeWithInsuredStatus() {
		return hospitalizeWithInsuredStatus;
	}

	public void setHospitalizeWithInsuredStatus(String hospitalizeWithInsuredStatus) {
		this.hospitalizeWithInsuredStatus = hospitalizeWithInsuredStatus;
	}

	public boolean isOutpatientSurgery() {
		return isOutpatientSurgery;
	}

	public void setOutpatientSurgery(boolean isOutpatientSurgery) {
		this.isOutpatientSurgery = isOutpatientSurgery;
	}

	public boolean isOutpatient() {
		return outpatient;
	}

	public void setOutpatient(boolean outpatient) {
		this.outpatient = outpatient;
	}

	public boolean isMatchDaysDuringHospitalizedAndDischarged() {
		return isMatchDaysDuringHospitalizedAndDischarged;
	}

	public void setMatchDaysDuringHospitalizedAndDischarged(boolean isMatchDaysDuringHospitalizedAndDischarged) {
		this.isMatchDaysDuringHospitalizedAndDischarged = isMatchDaysDuringHospitalizedAndDischarged;
	}

	public boolean isSameAccident() {
		return isSameAccident;
	}

	public void setSameAccident(boolean isSameAccident) {
		this.isSameAccident = isSameAccident;
	}

	public boolean isEmergencyMedicalTreatment() {
		return isEmergencyMedicalTreatment;
	}

	public void setEmergencyMedicalTreatment(boolean isEmergencyMedicalTreatment) {
		this.isEmergencyMedicalTreatment = isEmergencyMedicalTreatment;
	}

	public String getItemAlreadyReceive() {
		return itemAlreadyReceive;
	}

	public void setItemAlreadyReceive(String itemAlreadyReceive) {
		this.itemAlreadyReceive = itemAlreadyReceive;
	}

	public boolean isContractAnnihilation() {
		return contractAnnihilation;
	}

	public void setContractAnnihilation(boolean contractAnnihilation) {
		this.contractAnnihilation = contractAnnihilation;
	}

}
