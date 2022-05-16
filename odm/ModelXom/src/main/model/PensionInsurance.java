package main.model;

/**
 * 年金險
 * 
 * @author TPI
 *
 */
public class PensionInsurance extends CommonModel {

	/**
	 * 年金開始給付日
	 */
	private String pensionEffectiveDate;

	/**
	 * 死亡
	 */
	private boolean isDeath;

	/**
	 * 保證期間
	 */
	private String guaranteePeriod ;

	/**
	 * 已給付項目
	 */
	private String itemAlreadyReceive ;


	/**
	 * 給付幣別
	 */
	private String paymentCurrency;


	public PensionInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public PensionInsurance(String pensionEffectiveDate, boolean isDeath, String guaranteePeriod,
			String itemAlreadyReceive, String paymentCurrency) {
		super();
		this.pensionEffectiveDate = pensionEffectiveDate;
		this.isDeath = isDeath;
		this.guaranteePeriod = guaranteePeriod;
		this.itemAlreadyReceive = itemAlreadyReceive;
		this.paymentCurrency = paymentCurrency;
	}



	public String getPensionEffectiveDate() {
		return pensionEffectiveDate;
	}

	public void setPensionEffectiveDate(String pensionEffectiveDate) {
		this.pensionEffectiveDate = pensionEffectiveDate;
	}

	public boolean isDeath() {
		return isDeath;
	}

	public void setDeath(boolean isDeath) {
		this.isDeath = isDeath;
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

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}


}
