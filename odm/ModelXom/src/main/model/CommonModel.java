package main.model;

import java.util.Date;

public class CommonModel {
	/**
	 * 商品代號
	 */
	private String productNo;
	
	/**
	 * 保單投保日
	 */
	private Date productEffectiveDate;
	
	/**
	 * 保險年齡
	 */
	private Integer insuranceAge = 0;
	
	/**
	 * 實際年齡
	 */
	private Integer actualAge = 0;
	
	/**
	 * 保單生效日
	 */
	private Date policyEffectiveDate;
	
	/**
	 * 保單停效日
	 */
	private Date policySuspensionDate;
	
	/**
	 * 案件事故日
	 */
	private Date caseAccidentDate;

	public CommonModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommonModel(String productNo, Date productEffectiveDate, Integer insuranceAge, Integer actualAge,
			Date policyEffectiveDate, Date policySuspensionDate, Date caseAccidentDate) {
		super();
		this.productNo = productNo;
		this.productEffectiveDate = productEffectiveDate;
		this.insuranceAge = insuranceAge;
		this.actualAge = actualAge;
		this.policyEffectiveDate = policyEffectiveDate;
		this.policySuspensionDate = policySuspensionDate;
		this.caseAccidentDate = caseAccidentDate;
	}

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public Date getProductEffectiveDate() {
		return productEffectiveDate;
	}

	public void setProductEffectiveDate(Date productEffectiveDate) {
		this.productEffectiveDate = productEffectiveDate;
	}

	public Integer getInsuranceAge() {
		return insuranceAge;
	}

	public void setInsuranceAge(Integer insuranceAge) {
		this.insuranceAge = insuranceAge;
	}

	public Integer getActualAge() {
		return actualAge;
	}

	public void setActualAge(Integer actualAge) {
		this.actualAge = actualAge;
	}

	public Date getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}

	public void setPolicyEffectiveDate(Date policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}

	public Date getPolicySuspensionDate() {
		return policySuspensionDate;
	}

	public void setPolicySuspensionDate(Date policySuspensionDate) {
		this.policySuspensionDate = policySuspensionDate;
	}

	public Date getCaseAccidentDate() {
		return caseAccidentDate;
	}

	public void setCaseAccidentDate(Date caseAccidentDate) {
		this.caseAccidentDate = caseAccidentDate;
	}

	@Override
	public String toString() {
		return "CommonModel [productNo=" + productNo + ", productEffectiveDate=" + productEffectiveDate
				+ ", insuranceAge=" + insuranceAge + ", actualAge=" + actualAge + ", policyEffectiveDate="
				+ policyEffectiveDate + ", policySuspensionDate=" + policySuspensionDate + ", caseAccidentDate="
				+ caseAccidentDate + "]";
	}
	
	
	
}
