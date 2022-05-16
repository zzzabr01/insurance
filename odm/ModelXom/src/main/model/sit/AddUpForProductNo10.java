package main.model.sit;

/**
 * 實際理賠金額需要保險金額與此class下的property做加總得到
 * @author TPI
 *
 */
public class AddUpForProductNo10 {

		/**
		 * 理賠保險金
		 */
	    private Integer PAY_AMT_RTN;

	    /**
	     * 紅利
	     */
	    private Integer CAS1_BONF_AMT;

	    /**
	     * 暫收款
	     */
	    private Integer CAS1_DTPE_AMT;

	    /**
	     * 附1245暫收款
	     */
	    private Integer CAS1_RIPD_AMT;

	    /**
	     * 溢繳保費(團體)或 溢繳保費(個人)
	     */
	    private Integer CAS2_4_OVER_PREM;

	    /**
	     * 溢繳利息(團體)或溢繳利息(個人)
	     */
	    private Integer CAS2_4_OVER_INT;

	    /**
	     * 遲延利息
	     */
	    private Integer CAS2_4_DELA_INT;

	    /**
	     * 累積不足抵扣餘額
	     */
	    private Integer CAS1_LI12_AMT_2;

	    /**
	     * 代扣稅
	     */
	    private Integer TML_TAX;

	    /**
	     * 二代健保
	     */
	    private Integer TML_2_HI;

	    /**
	     * 投資型保費收入
	     */
	    private Integer CAS1_INVE_PREM;

	    /**
	     * 欠繳保費
	     */
	    private Integer CAS1_DELA_PREM;

	    /**
	     * 滯繳息
	     */
	    private Integer CAS1_DELA_INT;

	    /**
	     * 久保貸利息
	     */
	    private Integer CAS1_PAIN_INT_AMT;

	    /**
	     * 貸款
	     */
	    private Integer CAS1_LOMS_AMT;

	    /**
	     * 未兌現支票
	     */
	    private Integer CAS1_CHECK_AMT;

	    /**
	     * 溢付紅利
	     */
	    private Integer CAS1_PREM_DISCOUNT;

	    /**
	     * 溢付生存保險金
	     */
	    private Integer CAS1_LI_LO_BAL;

		public Integer getPAY_AMT_RTN() {
			return PAY_AMT_RTN;
		}

		public void setPAY_AMT_RTN(Integer pAY_AMT_RTN) {
			PAY_AMT_RTN = pAY_AMT_RTN;
		}

		public Integer getCAS1_BONF_AMT() {
			return CAS1_BONF_AMT;
		}

		public void setCAS1_BONF_AMT(Integer cAS1_BONF_AMT) {
			CAS1_BONF_AMT = cAS1_BONF_AMT;
		}

		public Integer getCAS1_DTPE_AMT() {
			return CAS1_DTPE_AMT;
		}

		public void setCAS1_DTPE_AMT(Integer cAS1_DTPE_AMT) {
			CAS1_DTPE_AMT = cAS1_DTPE_AMT;
		}

		public Integer getCAS1_RIPD_AMT() {
			return CAS1_RIPD_AMT;
		}

		public void setCAS1_RIPD_AMT(Integer cAS1_RIPD_AMT) {
			CAS1_RIPD_AMT = cAS1_RIPD_AMT;
		}

		public Integer getCAS2_4_OVER_PREM() {
			return CAS2_4_OVER_PREM;
		}

		public void setCAS2_4_OVER_PREM(Integer cAS2_4_OVER_PREM) {
			CAS2_4_OVER_PREM = cAS2_4_OVER_PREM;
		}

		public Integer getCAS2_4_OVER_INT() {
			return CAS2_4_OVER_INT;
		}

		public void setCAS2_4_OVER_INT(Integer cAS2_4_OVER_INT) {
			CAS2_4_OVER_INT = cAS2_4_OVER_INT;
		}

		public Integer getCAS2_4_DELA_INT() {
			return CAS2_4_DELA_INT;
		}

		public void setCAS2_4_DELA_INT(Integer cAS2_4_DELA_INT) {
			CAS2_4_DELA_INT = cAS2_4_DELA_INT;
		}

		public Integer getCAS1_LI12_AMT_2() {
			return CAS1_LI12_AMT_2;
		}

		public void setCAS1_LI12_AMT_2(Integer cAS1_LI12_AMT_2) {
			CAS1_LI12_AMT_2 = cAS1_LI12_AMT_2;
		}

		public Integer getTML_TAX() {
			return TML_TAX;
		}

		public void setTML_TAX(Integer tML_TAX) {
			TML_TAX = tML_TAX;
		}

		public Integer getTML_2_HI() {
			return TML_2_HI;
		}

		public void setTML_2_HI(Integer tML_2_HI) {
			TML_2_HI = tML_2_HI;
		}

		public Integer getCAS1_INVE_PREM() {
			return CAS1_INVE_PREM;
		}

		public void setCAS1_INVE_PREM(Integer cAS1_INVE_PREM) {
			CAS1_INVE_PREM = cAS1_INVE_PREM;
		}

		public Integer getCAS1_DELA_PREM() {
			return CAS1_DELA_PREM;
		}

		public void setCAS1_DELA_PREM(Integer cAS1_DELA_PREM) {
			CAS1_DELA_PREM = cAS1_DELA_PREM;
		}

		public Integer getCAS1_DELA_INT() {
			return CAS1_DELA_INT;
		}

		public void setCAS1_DELA_INT(Integer cAS1_DELA_INT) {
			CAS1_DELA_INT = cAS1_DELA_INT;
		}

		public Integer getCAS1_PAIN_INT_AMT() {
			return CAS1_PAIN_INT_AMT;
		}

		public void setCAS1_PAIN_INT_AMT(Integer cAS1_PAIN_INT_AMT) {
			CAS1_PAIN_INT_AMT = cAS1_PAIN_INT_AMT;
		}

		public Integer getCAS1_LOMS_AMT() {
			return CAS1_LOMS_AMT;
		}

		public void setCAS1_LOMS_AMT(Integer cAS1_LOMS_AMT) {
			CAS1_LOMS_AMT = cAS1_LOMS_AMT;
		}

		public Integer getCAS1_CHECK_AMT() {
			return CAS1_CHECK_AMT;
		}

		public void setCAS1_CHECK_AMT(Integer cAS1_CHECK_AMT) {
			CAS1_CHECK_AMT = cAS1_CHECK_AMT;
		}

		public Integer getCAS1_PREM_DISCOUNT() {
			return CAS1_PREM_DISCOUNT;
		}

		public void setCAS1_PREM_DISCOUNT(Integer cAS1_PREM_DISCOUNT) {
			CAS1_PREM_DISCOUNT = cAS1_PREM_DISCOUNT;
		}

		public Integer getCAS1_LI_LO_BAL() {
			return CAS1_LI_LO_BAL;
		}

		public void setCAS1_LI_LO_BAL(Integer cAS1_LI_LO_BAL) {
			CAS1_LI_LO_BAL = cAS1_LI_LO_BAL;
		}
	
}
