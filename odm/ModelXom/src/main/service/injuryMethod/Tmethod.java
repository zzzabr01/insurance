package main.service.injuryMethod;

import java.math.BigDecimal;

import main.model.payment.InjuryPaymentAmountModel;
import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Tmethod {

	public static BigDecimal totalNum(InjuryPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1.0, v1 = 1.0, v2 = 1.0, v3 = 1.0, v4 = 1.0;
		double vArr[] = new double[2];
		BigDecimal finalCalculatingNum;
		if ("GT".equals(calculType.substring(0, 2))) {
			first = paymentAmountModel.getDayOfFractureType();
			v1 = paymentAmountModel.getMultipleOfFractureDay();
			v2 = paymentAmountModel.getInpatientDays();
			vArr = findGTThird(paymentAmountModel, calculType.substring(2));
			v3 = vArr[0];
			v4 = vArr[1];
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingT(first, v1, v2, v3, v4);
		return finalCalculatingNum;
	}

	private static double[] findGTThird(InjuryPaymentAmountModel paymentAmountModel, String thirdString) {
		double resultV1 = 1.0, resultV2 = 1.0;
		double resultArr[] = new double[] { 1.0, 1.0 };
		switch (thirdString) {
		case "1": // (骨折別所定日數*{ 骨折別所定日數倍數}-住院天數)*{傷害醫療保險金日額倍數 }*傷害醫療保險金日額
			resultV1 = Double.valueOf(paymentAmountModel.getInjuryInsuranceDailyMultiple());
			resultV2 = Double.valueOf(paymentAmountModel.getAccidentHealthIndemnify());
			break;

		case "2": // (骨折別所定日數*{ 骨折別所定日數倍數}-住院天數)*{傷害醫療保險金限額倍數 }*傷害醫療保險金限額
			resultV1 = Double.valueOf(paymentAmountModel.getInjuryInsuranceLimitMultiple());
			resultV2 = Double.valueOf(paymentAmountModel.getMedicalReimbursement());
			break;
		}

		resultArr[0] = resultV1;
		resultArr[1] = resultV2;

		return resultArr;
	}

}
