package main.service.lifeMethod;

import java.math.BigDecimal;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Imethod {

	public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1, v2 = 1, v3 = 1;
		BigDecimal finalCalculatingNum;
		first = paymentAmountModel.getInsuranceAmount();
		v1 = paymentAmountModel.getMultiple();

		if ("AI1".equals(calculType)) { // 實際生存日數比例之生存保險金+年繳保險費總額
			v2 = paymentAmountModel.getSurvivalAmountOfActualSurvivalDays();
			v3 = paymentAmountModel.getAnnualTotalInsurancePremium();
		} else if ("AI2".equals(calculType)) { // 未到期保費+生存保險金
			v2 = paymentAmountModel.getUnearnedPremium();
			v3 = paymentAmountModel.getSurvivalInsurance();
		} else if ("AI3".equals(calculType)) { // 所繳保費總額+生存保險金
			v2 = paymentAmountModel.getPaidTotalPremiumA();
			v3 = paymentAmountModel.getSurvivalInsurance();
		}

		finalCalculatingNum = CalculateUtil.finalCalculatingI(first, v1, v2, v3);
		return finalCalculatingNum;

	}

}
