package main.controller;

import main.model.sit.AddUpForProductNo10;

public class AddUpEntrance {

	public static Integer addUpAllValues(Integer currentPaymentAmount, AddUpForProductNo10 addUpObject) {
		Integer sum = currentPaymentAmount + addUpObject.getCAS1_BONF_AMT() + addUpObject.getCAS1_DTPE_AMT()
		 + addUpObject.getCAS1_RIPD_AMT() + addUpObject.getCAS2_4_OVER_PREM() + addUpObject.getCAS2_4_OVER_INT()
		 + addUpObject.getCAS2_4_DELA_INT() + addUpObject.getCAS1_LI12_AMT_2() + addUpObject.getTML_TAX()
		 + addUpObject.getTML_2_HI() + addUpObject.getCAS1_INVE_PREM() + addUpObject.getCAS1_DELA_PREM()
		 + addUpObject.getCAS1_DELA_INT() + addUpObject.getCAS1_PAIN_INT_AMT() + addUpObject.getCAS1_LOMS_AMT()
		 + addUpObject.getCAS1_CHECK_AMT() + addUpObject.getCAS1_PREM_DISCOUNT() + addUpObject.getCAS1_LI_LO_BAL();
		return sum;
	}
}
