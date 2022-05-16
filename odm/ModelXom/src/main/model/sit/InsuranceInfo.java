package main.model.sit;


public class InsuranceInfo {

			/**
			 * 保單號碼
			 */
	        private String LIPI_INSU_NO;

	        /**
			 * 出生日期
			 */
	        private String LIPI_BIRTH;

	        /**
			 * 投保日期
			 */
	        private String LIPI_INSU_BEG_DATE = "19960101";

	        /**
			 * 投保終期
			 */
	        private String LIPI_INSU_END_DATE;

	        /**
			 * 貸款註記
			 */
	        private String LIPI_LO_MK;

	        /**
			 * 契約狀況
			 */
	        private String LIPI_ST = "正常";

	        /**
			 * 契約狀況日期
			 */
	        private String LIPI_ST_DATE;

	        /**
			 * 繳費年期
			 */
	        private Integer LIPI_PREM_YEAR;

	        /**
			 * 主契約保額
			 */
	        private Integer LIPI_MAIN_AMT;

			public String getLIPI_INSU_NO() {
				return LIPI_INSU_NO;
			}

			public void setLIPI_INSU_NO(String lIPI_INSU_NO) {
				LIPI_INSU_NO = lIPI_INSU_NO;
			}

			public String getLIPI_BIRTH() {
				return LIPI_BIRTH;
			}

			public void setLIPI_BIRTH(String lIPI_BIRTH) {
				LIPI_BIRTH = lIPI_BIRTH;
			}

			public String getLIPI_INSU_BEG_DATE() {
				return LIPI_INSU_BEG_DATE;
			}

			public void setLIPI_INSU_BEG_DATE(String lIPI_INSU_BEG_DATE) {
				LIPI_INSU_BEG_DATE = lIPI_INSU_BEG_DATE;
			}

			public String getLIPI_INSU_END_DATE() {
				return LIPI_INSU_END_DATE;
			}

			public void setLIPI_INSU_END_DATE(String lIPI_INSU_END_DATE) {
				LIPI_INSU_END_DATE = lIPI_INSU_END_DATE;
			}

			public String getLIPI_LO_MK() {
				return LIPI_LO_MK;
			}

			public void setLIPI_LO_MK(String lIPI_LO_MK) {
				LIPI_LO_MK = lIPI_LO_MK;
			}

			public String getLIPI_ST() {
				return LIPI_ST;
			}

			public void setLIPI_ST(String lIPI_ST) {
				LIPI_ST = lIPI_ST;
			}

			public String getLIPI_ST_DATE() {
				return LIPI_ST_DATE;
			}

			public void setLIPI_ST_DATE(String lIPI_ST_DATE) {
				LIPI_ST_DATE = lIPI_ST_DATE;
			}

			public Integer getLIPI_PREM_YEAR() {
				return LIPI_PREM_YEAR;
			}

			public void setLIPI_PREM_YEAR(Integer lIPI_PREM_YEAR) {
				LIPI_PREM_YEAR = lIPI_PREM_YEAR;
			}

			public Integer getLIPI_MAIN_AMT() {
				return LIPI_MAIN_AMT;
			}

			public void setLIPI_MAIN_AMT(Integer lIPI_MAIN_AMT) {
				LIPI_MAIN_AMT = lIPI_MAIN_AMT;
			}

		
}
