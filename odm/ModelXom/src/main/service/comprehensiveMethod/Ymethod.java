package main.service.comprehensiveMethod;

import java.math.BigDecimal;

import main.model.payment.ComprehensivePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Ymethod {

	public static BigDecimal totalNum(ComprehensivePaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1, v2 = 1;
		BigDecimal finalCalculatingNum;
		if ("FY1".equals(calculType)) {
			first = paymentAmountModel.getBasicInsuranceAmount();
			v1 = paymentAmountModel.getTotalIncreaseInsuranceAmount();
			v2 = paymentAmountModel.getMultiple();
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingY(first, v1, v2);
		return finalCalculatingNum;
	}

}
