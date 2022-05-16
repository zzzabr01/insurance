package main.service.injuryMethod;

import java.math.BigDecimal;

import main.model.payment.InjuryPaymentAmountModel;
import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Lmethod {

	public static BigDecimal totalNum(InjuryPaymentAmountModel paymentAmountModel, String calculType) {
		// {每單位金額} * 約定單位投保數 * {傷害醫療保險金限額倍數} * 住院天數(非ICU病房/ICU病房)
		double first = 1.0, v1 = 1.0, v2 = 1.0, v3 = 1.0;
		BigDecimal finalCalculatingNum;
		if ("CL1".equals(calculType)) {
			first = paymentAmountModel.getAmountPerUnit();
			v1 = paymentAmountModel.getAgreementInsuredUnits();
			v2 = paymentAmountModel.getInjuryInsuranceLimitMultiple();
			v3 = paymentAmountModel.getInpatientDaysInWard();
		}else if("CL2".equals(calculType)) {
			first = paymentAmountModel.getAmountPerUnit();
			v1 = paymentAmountModel.getAgreementInsuredUnits();
			v2 = paymentAmountModel.getInjuryInsuranceLimitMultiple();
			v3 = paymentAmountModel.getInpatientDaysInICU();
		}else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingL(first, v1, v2, v3);
		return finalCalculatingNum;
	}

}
