package main.service.lifeMethod;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

import java.math.BigDecimal;

public class Emethod {

	public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1, v2 = 1;
		BigDecimal finalCalculatingNum;
		if ("AE".equals(calculType.substring(0, 2))) { // AE1 ~ AE5
			first = paymentAmountModel.getInsuranceAmount();

			if ("8".equals(calculType.substring(2)))
				v1 = paymentAmountModel.getPolicyYear(); // 身故當時之保單年度數
			else
				v1 = paymentAmountModel.getMultiple(); // 保額倍數

			v2 = findAEThird(paymentAmountModel, calculType.substring(2));
		}
			else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingE(first, v1, v2);
		return finalCalculatingNum;

	}

	private static double findAEThird(LifePaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": // 增值保額
			result = paymentAmountModel.getIncreaseValueInsuranceAmt();
			break;

		case "2": // 未到期保費 //
			result = paymentAmountModel.getUnearnedPremium();
			break;

		case "3": // 生存保險金
			result = paymentAmountModel.getSurvivalInsurance();
			break;

		case "4": // 所繳保險費總額
			result = paymentAmountModel.getPaidTotalPremiumA();
			break;

		case "5": // 實際生存日數比例之生存保險金
			result = paymentAmountModel.getSurvivalAmountOfActualSurvivalDays();
			break;

		case "6": // 已繳保費總額
			result = paymentAmountModel.getPaidTotalPremiumB();
			break;

		case "7": // 增值保額 increaseValueInsuranceAmt
			result = paymentAmountModel.getIncreaseValueInsuranceAmt();
			break;

		case "8":
			result = paymentAmountModel.getUnearnedPremium();
			break;

		}

		return result;
	}

}
