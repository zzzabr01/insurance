package main.service.comprehensiveMethod;

import java.math.BigDecimal;

import main.model.payment.ComprehensivePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Mmethod {

	public static BigDecimal totalNum(ComprehensivePaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1, v2 = 1;
		BigDecimal finalCalculatingNum;
		if ("GM1".equals(calculType)) { // 所繳保險費總額+利息+特別承保保費
			first = paymentAmountModel.getPaidTotalPremium();
			v1 = paymentAmountModel.getInterest();
			v2 = paymentAmountModel.getCashSurrenderValueForInjuryInsurance();

		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingM(first, v1, v2);
		return finalCalculatingNum;

	}

}
