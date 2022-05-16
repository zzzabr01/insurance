package main.service.investmentMethod;

import java.math.BigDecimal;

import main.model.payment.InvestmentPaymentAmountModel;
import main.utilities.CalculateUtil;

public class Amethod {
	public static BigDecimal totalNum(InvestmentPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1.0, v1 = 1.0;
		BigDecimal finalCalculatingNum;

		if ("AA1".equals(calculType)) {
			first = paymentAmountModel.getInsuranceAmount();
			v1 = 1.0;
		}else if("BA1".equals(calculType)){
			first = paymentAmountModel.getPolicyAccountValue();
			v1 = 1.0;
		}else if("CA1".equals(calculType)) {
			first = paymentAmountModel.getUnpaidPensionBalance();
			v1 = 1.0;
		}else if("CA2".equals(calculType)) {
			return BigDecimal.ZERO;
		}
			else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingA(first, v1);
		return finalCalculatingNum;
	}
}
