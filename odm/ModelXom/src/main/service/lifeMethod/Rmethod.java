package main.service.lifeMethod;

import java.math.BigDecimal;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Rmethod {

	public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1, v2 = 1, v3 = 1, v4 = 1, v5 = 1, v6 = 1;
		BigDecimal finalCalculatingNum;
		// 主約保額*{0.01}*({100}-已領取月數)*(1+{預定利率}/12)
		if ("AR1".equals(calculType)) {
			first = paymentAmountModel.getInsuranceAmount();
			v1 = 0.01;
			v2 = 100.0;
			v3 = paymentAmountModel.getReceivedMonth();
			v4 = 1.0;
			v5 = paymentAmountModel.getAssumedInterestRate();
			v6 = 12.0;
		}else if ("SR1".equals(calculType)) {
			first = paymentAmountModel.getMainInsuranceAmount();
			v1 = 0.01;
			v2 = 100.0;
			v3 = paymentAmountModel.getReceivedMonth();
			v4 = 1.0;
			v5 = paymentAmountModel.getAssumedInterestRate();
			v6 = 12.0;
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingR(first, v1, v2, v3, v4, v5, v6);
		return finalCalculatingNum;

	}

}
