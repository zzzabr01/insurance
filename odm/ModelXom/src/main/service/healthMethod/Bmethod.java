package main.service.healthMethod;

import java.math.BigDecimal;

import main.model.payment.HealthPaymentAmountModel;
import main.utilities.CalculateUtil;

public class Bmethod {

	public static BigDecimal totalNum(HealthPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1;
		BigDecimal finalCalculatingNum;
		if ("JB1".equals(calculType)) { 
			first = paymentAmountModel.getShouldBeExemptedInsuranceAmount();
			v1 = paymentAmountModel.getInterest();
 		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingB(first, v1);
		return finalCalculatingNum;
	}
 
}
