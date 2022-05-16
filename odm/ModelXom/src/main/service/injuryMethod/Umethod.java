package main.service.injuryMethod;

import java.math.BigDecimal;

import main.model.payment.InjuryPaymentAmountModel;
import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Umethod {

	public static BigDecimal totalNum(InjuryPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1.0, v1 = 1.0, v2 = 1.0, v3 = 1.0, v4 = 1.0, v5 = 1.0;
		BigDecimal finalCalculatingNum;
		// (骨折別所定日數*{骨折別所定日數倍數 }-住院天數)*{傷害醫療保險金限額倍數 }*{每單位金額 }*約定投保單位數
		if ("GU1".equals(calculType)) {
			first = paymentAmountModel.getDayOfFractureType();
			v1 = paymentAmountModel.getMultipleOfFractureDay();
			v2 = paymentAmountModel.getInpatientDays();
			v3 = paymentAmountModel.getInjuryInsuranceLimitMultiple();
			v4 = paymentAmountModel.getAmountPerUnit();
			v5 = paymentAmountModel.getAgreementInsuredUnits();
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingU(first, v1, v2, v3, v4, v5);
		return finalCalculatingNum;
	}

}
