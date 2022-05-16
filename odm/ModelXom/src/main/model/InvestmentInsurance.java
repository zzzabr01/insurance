package main.model;

/**
 * 投資型保險
 * 
 * @author TPI
 *
 */
public class InvestmentInsurance extends CommonModel {

	/**
	 * 死亡
	 */
	private boolean isDeath;

	/**
	 * 保單型態
	 */
	private String policyType;

	/**
	 * 符合全殘廢附表
	 */
	private boolean isTotallyDisability;

	/**
	 * 保證期間
	 */
	private String guaranteePeriod;

	/**
	 * 已給付項目
	 */
	private String itemAlreadyReceive;

	/**
	 * 投資起始日
	 */
	private String investmentDateType;

	/**
	 * 年金給付開始日
	 */
	private String pensionEffectiveDate;

	/**
	 * 契約消滅註記
	 */
	private boolean contractAnnihilation;

	public InvestmentInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isDeath() {
		return isDeath;
	}

	public void setDeath(boolean isDeath) {
		this.isDeath = isDeath;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public boolean isTotallyDisability() {
		return isTotallyDisability;
	}

	public void setTotallyDisability(boolean isTotallyDisability) {
		this.isTotallyDisability = isTotallyDisability;
	}

	public String getGuaranteePeriod() {
		return guaranteePeriod;
	}

	public void setGuaranteePeriod(String guaranteePeriod) {
		this.guaranteePeriod = guaranteePeriod;
	}

	public String getItemAlreadyReceive() {
		return itemAlreadyReceive;
	}

	public void setItemAlreadyReceive(String itemAlreadyReceive) {
		this.itemAlreadyReceive = itemAlreadyReceive;
	}

	public String getInvestmentDateType() {
		return investmentDateType;
	}

	public void setInvestmentDateType(String investmentDateType) {
		this.investmentDateType = investmentDateType;
	}

	public String getPensionEffectiveDate() {
		return pensionEffectiveDate;
	}

	public void setPensionEffectiveDate(String pensionEffectiveDate) {
		this.pensionEffectiveDate = pensionEffectiveDate;
	}

	public boolean isContractAnnihilation() {
		return contractAnnihilation;
	}

	public void setContractAnnihilation(boolean contractAnnihilation) {
		this.contractAnnihilation = contractAnnihilation;
	}

}
