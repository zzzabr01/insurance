package main.service.lifeMethod;

import java.math.BigDecimal;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Pmethod {

	public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1, v2 = 1, v3 = 1;
		BigDecimal finalCalculatingNum;
		// 保額-已給付老年住院醫療提前給付保險金+未到期保費+生存保險金
		if ("AP1".equals(calculType)) {
			first = paymentAmountModel.getInsuranceAmount();
			v1 = paymentAmountModel.getReceiveAccelerationProfitHospitalizationAmt();
			v2 = paymentAmountModel.getUnearnedPremium();
			v3 = paymentAmountModel.getSurvivalInsurance();
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingP(first, v1, v2, v3);
		return finalCalculatingNum;

	}

}
