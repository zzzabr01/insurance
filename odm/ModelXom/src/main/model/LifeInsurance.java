package main.model;

/**
 * 壽險
 * 
 * @author TPI
 *
 */
public class LifeInsurance extends CommonModel {
	/**
	 * 契況
	 */
	private String contractStatus;

	/**
	 * 符合完全失能附表
	 */
	private boolean isTotallyDisability;

	/**
	 * 繳費狀態
	 */
	private String paymentStatus;

	/**
	 * 事故原因
	 */
	private String causeOfAccident;

	/**
	 * 復效日起保險年度
	 */
	private Integer reinstatementDate;
	/**
	 * 除外責任
	 */
	private boolean exclusion;
	/**
	 * 殘廢等級
	 */
	private Integer disabilityLevel;
	/**
	 * 死亡日期-保單生效日
	 */
	private Integer policyEffectiveDay;

	/**
	 * 領取重大疾病保險金
	 */
	private boolean receiveMajorDiseasesAmt;

	/**
	 * 保單年度
	 */
	private Integer policyYear;

	/**
	 * 死亡
	 */
	private boolean isDeath;

	/**
	 * 受監護宣告尚未撤銷者
	 */
	private boolean declarationOfGuardian;

	/**
	 * 保單生效日-診斷日期
	 */
	private Integer policyEffectiveDays;

	/**
	 * 保單復效日-診斷日期
	 */
	private Integer policyReinstatementDate;

	/**
	 * 事故日期-生效日
	 */
	private Integer dateBetweenCaseAccidentAndPolicyEffect;

	/**
	 * 事故日期-復效日
	 */
	private Integer dateBetweenCaseAccidentAndPolicyReinstate;

	/**
	 * 符合失能附表
	 */
	private boolean isDisability;

	/**
	 * 符合永久半殘廢附表
	 */
	private boolean isPermanentHalfDisability;

	/**
	 * 給付方式
	 */
	private String modeOfSatisfaction;

	/**
	 * 符合重大燒燙傷定義
	 */
	private boolean isBurnsAndScalds;

	/**
	 * 領取生活扶助保險金
	 */
	private boolean isReceivedLifeSupportAmount;

	/**
	 * 契約消滅註記
	 */
	private boolean contractAnnihilation;

	/**
	 * 已給付項目
	 */
	private String itemAlreadyReceive;

	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public boolean isTotallyDisability() {
		return isTotallyDisability;
	}

	public void setTotallyDisability(boolean isTotallyDisability) {
		this.isTotallyDisability = isTotallyDisability;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getCauseOfAccident() {
		return causeOfAccident;
	}

	public void setCauseOfAccident(String causeOfAccident) {
		this.causeOfAccident = causeOfAccident;
	}

	public Integer getReinstatementDate() {
		return reinstatementDate;
	}

	public void setReinstatementDate(Integer reinstatementDate) {
		this.reinstatementDate = reinstatementDate;
	}

	public boolean isExclusion() {
		return exclusion;
	}

	public void setExclusion(boolean exclusion) {
		this.exclusion = exclusion;
	}

	public Integer getDisabilityLevel() {
		return disabilityLevel;
	}

	public void setDisabilityLevel(Integer disabilityLevel) {
		this.disabilityLevel = disabilityLevel;
	}

	public Integer getPolicyEffectiveDay() {
		return policyEffectiveDay;
	}

	public void setPolicyEffectiveDay(Integer policyEffectiveDay) {
		this.policyEffectiveDay = policyEffectiveDay;
	}

	public boolean isReceiveMajorDiseasesAmt() {
		return receiveMajorDiseasesAmt;
	}

	public void setReceiveMajorDiseasesAmt(boolean receiveMajorDiseasesAmt) {
		this.receiveMajorDiseasesAmt = receiveMajorDiseasesAmt;
	}

	public Integer getPolicyYear() {
		return policyYear;
	}

	public void setPolicyYear(Integer policyYear) {
		this.policyYear = policyYear;
	}

	public boolean isDeath() {
		return isDeath;
	}

	public void setDeath(boolean isDeath) {
		this.isDeath = isDeath;
	}

	public boolean isDeclarationOfGuardian() {
		return declarationOfGuardian;
	}

	public void setDeclarationOfGuardian(boolean declarationOfGuardian) {
		this.declarationOfGuardian = declarationOfGuardian;
	}

	public Integer getPolicyEffectiveDays() {
		return policyEffectiveDays;
	}

	public void setPolicyEffectiveDays(Integer policyEffectiveDays) {
		this.policyEffectiveDays = policyEffectiveDays;
	}

	public Integer getPolicyReinstatementDate() {
		return policyReinstatementDate;
	}

	public void setPolicyReinstatementDate(Integer policyReinstatementDate) {
		this.policyReinstatementDate = policyReinstatementDate;
	}

	public Integer getDateBetweenCaseAccidentAndPolicyEffect() {
		return dateBetweenCaseAccidentAndPolicyEffect;
	}

	public void setDateBetweenCaseAccidentAndPolicyEffect(Integer dateBetweenCaseAccidentAndPolicyEffect) {
		this.dateBetweenCaseAccidentAndPolicyEffect = dateBetweenCaseAccidentAndPolicyEffect;
	}

	public Integer getDateBetweenCaseAccidentAndPolicyReinstate() {
		return dateBetweenCaseAccidentAndPolicyReinstate;
	}

	public void setDateBetweenCaseAccidentAndPolicyReinstate(Integer dateBetweenCaseAccidentAndPolicyReinstate) {
		this.dateBetweenCaseAccidentAndPolicyReinstate = dateBetweenCaseAccidentAndPolicyReinstate;
	}

	public boolean isDisability() {
		return isDisability;
	}

	public void setDisability(boolean isDisability) {
		this.isDisability = isDisability;
	}

	public boolean isPermanentHalfDisability() {
		return isPermanentHalfDisability;
	}

	public void setPermanentHalfDisability(boolean isPermanentHalfDisability) {
		this.isPermanentHalfDisability = isPermanentHalfDisability;
	}

	public String getModeOfSatisfaction() {
		return modeOfSatisfaction;
	}

	public void setModeOfSatisfaction(String modeOfSatisfaction) {
		this.modeOfSatisfaction = modeOfSatisfaction;
	}

	public boolean isBurnsAndScalds() {
		return isBurnsAndScalds;
	}

	public void setBurnsAndScalds(boolean isBurnsAndScalds) {
		this.isBurnsAndScalds = isBurnsAndScalds;
	}

	public boolean isReceivedLifeSupportAmount() {
		return isReceivedLifeSupportAmount;
	}

	public void setReceivedLifeSupportAmount(boolean isReceivedLifeSupportAmount) {
		this.isReceivedLifeSupportAmount = isReceivedLifeSupportAmount;
	}

	public boolean isContractAnnihilation() {
		return contractAnnihilation;
	}

	public void setContractAnnihilation(boolean contractAnnihilation) {
		this.contractAnnihilation = contractAnnihilation;
	}

	public String getItemAlreadyReceive() {
		return itemAlreadyReceive;
	}

	public void setItemAlreadyReceive(String itemAlreadyReceive) {
		this.itemAlreadyReceive = itemAlreadyReceive;
	}

}
