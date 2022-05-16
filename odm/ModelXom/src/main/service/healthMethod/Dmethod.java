package main.service.healthMethod;

import java.math.BigDecimal;

import main.model.payment.HealthPaymentAmountModel;
import main.utilities.CalculateUtil;

public class Dmethod {

	public static BigDecimal totalNum(HealthPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1, v2 = 1;
		BigDecimal finalCalculatingNum;
		if ("AD".equals(calculType.substring(0, 2))) { // AD1 ~ AD2
			first = paymentAmountModel.getInsuranceAmount();
			v1 = paymentAmountModel.getMultiple();
			v2 = findADThird(paymentAmountModel, calculType.substring(2));
		} else if ("BD1".equals(calculType)) { // 投保單位數*{150000}-罹患癌症保險金（原位癌）
			first = paymentAmountModel.getAgreementInsuredUnits();
			v1 = paymentAmountModel.getAmountPerUnit();
			v2 = paymentAmountModel.getHaveCancerInsuranceAmount();
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingD(first, v1, v2);
		return finalCalculatingNum;
	}

	private static double findADThird(HealthPaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1":
			result = paymentAmountModel.getCumulativelyPaidInsuranceAmount();
			;
			break;

		case "2":
			result = paymentAmountModel.getPaidMildCriticalIllnessInsuranceAmount();
			break;
		}

		return result;
	}
}
