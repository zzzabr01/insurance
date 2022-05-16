package main.service.investmentMethod;

import java.math.BigDecimal;

import main.model.payment.InvestmentPaymentAmountModel;
import main.utilities.CalculateUtil;

public class Mmethod {
	public static BigDecimal totalNum(InvestmentPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1, v2 = 1;
		BigDecimal finalCalculatingNum;
		if ("AM".equals(calculType.substring(0, 2))) { // 所繳保險費總額+利息+特別承保保費
			first = paymentAmountModel.getInsuranceAmount();
			v1 = paymentAmountModel.getPolicyAccountValue();
			v2 = findAMThird(paymentAmountModel, calculType.substring(2));
		}
		else;

		finalCalculatingNum = CalculateUtil.finalCalculatingM(first, v1, v2);
		return finalCalculatingNum;

	}
	
	private static double findAMThird(InvestmentPaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": 
			result = Double.valueOf(paymentAmountModel.getDeductUnearnedPremiumByDays());
			break;

		case "2": 
			result = Double.valueOf(paymentAmountModel.getDeathOverflowInsuranceCost());
			break;
		case "3":
			result = Double.valueOf(paymentAmountModel.getTotallyDisabilityOverflowInsuranceCost());
		}
		return result;
	}
}
