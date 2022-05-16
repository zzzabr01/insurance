package main.service.comprehensiveMethod;

import main.model.payment.ComprehensivePaymentAmountModel;
import main.utilities.CalculateUtil;

import java.math.BigDecimal;

public class Emethod {

	public static BigDecimal totalNum(ComprehensivePaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1, v2 = 1;
		BigDecimal finalCalculatingNum;
		if ("AE".equals(calculType.substring(0, 2))) { // AE1 ~ AE5
			first = paymentAmountModel.getInsuranceAmount();
			v1 = paymentAmountModel.getMultiple();
			v2 = findAEThird(paymentAmountModel, calculType.substring(2));
		}else if("JE".equals(calculType.substring(0, 2))) {
			first = paymentAmountModel.getCurrentYearInsuranceAmt();
			v1 = paymentAmountModel.getCurrentYearInsuranceAmtMultiple();
			v2 = findJEThird(paymentAmountModel, calculType.substring(2));
		}
			else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingE(first, v1, v2);
		return finalCalculatingNum;

	}

	private static double findAEThird(ComprehensivePaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": 
			result = paymentAmountModel.getPaidTotalPremium();
			break;

		case "2": 
			result = paymentAmountModel.getPaidDisabilityInsuranceAmt();
			break;

		}

		return result;
	}

	private static double findJEThird(ComprehensivePaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": 
			result = paymentAmountModel.getCashSurrenderValueForHealthAndInjuryInsurance();
			break;

		case "2": 
			result = paymentAmountModel.getCashSurrenderValueForInjuryInsurance();
			break;

		}

		return result;
	}
}
