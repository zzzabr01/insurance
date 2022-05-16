package main.service.lifeMethod;

import java.math.BigDecimal;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Jmethod {

	public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1, v2 = 1;
		BigDecimal finalCalculatingNum;
		if ("AJ1".equals(calculType)) { // 保額-已給付老年住院醫療提前給付保險金+未到期保費
			first = paymentAmountModel.getInsuranceAmount();
			v1 = paymentAmountModel.getReceiveAccelerationProfitHospitalizationAmt();
			v2 = paymentAmountModel.getUnearnedPremium();
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingJ(first, v1, v2);
		return finalCalculatingNum;
	}

}
