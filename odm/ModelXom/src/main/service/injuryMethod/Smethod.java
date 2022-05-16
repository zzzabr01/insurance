package main.service.injuryMethod;

import java.math.BigDecimal;

import main.model.payment.InjuryPaymentAmountModel;
import main.utilities.CalculateUtil;

public class Smethod {

	public static BigDecimal totalNum(InjuryPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1.0, v1 = 1.0, v2 = 1.0;
		double vArr[] = new double[2];
		BigDecimal finalCalculatingNum;
		if ("CS".equals(calculType.substring(0,2))){// {每單位金額 }*約定單位投保數* X
			first = paymentAmountModel.getAmountPerUnit();
			v1 = paymentAmountModel.getAgreementInsuredUnits();
			v2 = findCSThird(paymentAmountModel, calculType.substring(2));
		} else if ("FS".equals(calculType.substring(0, 2))) {
			first = paymentAmountModel.getInpatientDays();
			vArr = findFSThird(paymentAmountModel, calculType.substring(2));
			v1 = vArr[0];
			v2 = vArr[1];
		} else if("DS".equals(calculType.subSequence(0, 2))) {
			first = paymentAmountModel.getDisabledPaymentRatio();
			v1 = paymentAmountModel.getInsuranceAmount();
			v2 = paymentAmountModel.getMultiple();
		}
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingS(first, v1, v2);
		return finalCalculatingNum;
	}

	private static double findCSThird(InjuryPaymentAmountModel paymentAmountModel, String thirdString) {
		Double result;
		switch (thirdString) {
		case "1": // 給付比例
			result = paymentAmountModel.getDisabledPaymentRatio();
			break;

		case "2": // 保額倍數
			result = paymentAmountModel.getMultiple();
			break;

		default:
			result = 1.0;
		}

		return result;
	}

	private static double[] findFSThird(InjuryPaymentAmountModel paymentAmountModel, String thirdString) {
		double resultV1 = 1.0, resultV2 = 1.0;
		double resultArr[] = new double[] { 1.0, 1.0 };
		switch (thirdString) {
		case "1": // 住院天數*{ 傷害醫療保險金日額倍數}*傷害醫療保險金日額
			resultV1 = Double.valueOf(paymentAmountModel.getInjuryInsuranceDailyMultiple());
			resultV2 = Double.valueOf(paymentAmountModel.getAccidentHealthIndemnify());
			break;

		case "2": // 住院天數*{ 傷害醫療保險金限額倍數}* {傷害醫療保險金限額 }
			resultV1 = Double.valueOf(paymentAmountModel.getInjuryInsuranceLimitMultiple());
			resultV2 = Double.valueOf(paymentAmountModel.getMedicalReimbursement());
			break;
		}

		resultArr[0] = resultV1;
		resultArr[1] = resultV2;

		return resultArr;
	}

}
