package main.service.injuryMethod;

import java.math.BigDecimal;

import main.model.payment.InjuryPaymentAmountModel;
import main.utilities.CalculateUtil;

public class Amethod {

	public static BigDecimal totalNum(InjuryPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1.0, v1 = 1.0;
		BigDecimal finalCalculatingNum;

		if ("AA1".equals(calculType)) {
			first = paymentAmountModel.getInsuranceAmount();
			v1 = paymentAmountModel.getMultiple();
		} else if ("BA".equals(calculType.substring(0, 2))) {
			first = paymentAmountModel.getExpenseLoading();
			v1 = findBAThird(paymentAmountModel, calculType.substring(2));
		} else if ("CA".equals(calculType.substring(0, 2))) {// CA1 ~ CA2
			first = paymentAmountModel.getAmountPerUnit();
			v1 = findCAThird(paymentAmountModel, calculType.substring(2));
		} else if ("EA1".equals(calculType)) {
			first = paymentAmountModel.getActualMedicalExpense();
			v1 = paymentAmountModel.getActualMedicalExpenseMultiple();
		} else if ("IA1".equals(calculType)) {
			first = paymentAmountModel.getActualHospitalBenefit();
			v1 = 1.0;
		} else if ("JA1".equals(calculType)) {
			first = paymentAmountModel.getActualEmergencyTransportAmount();
			v1 = 1.0;
		} else if ("KA1".equals(calculType)) {
			first = paymentAmountModel.getActualOutpatientBenefit();
			v1 = 1.0;
		}else if("FA1".equals(calculType)) {
			first = paymentAmountModel.getInpatientDays();
			v1 = paymentAmountModel.getDailyHospitalBenefit();
		}
		else if("HA1".equals(calculType)) {
			first = paymentAmountModel.getOutpatientDays();
			v1 = paymentAmountModel.getDailyOutpatientBenefit();
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingA(first, v1);
		return finalCalculatingNum;
	}

	private static double findBAThird(InjuryPaymentAmountModel paymentAmountModel, String thirdString) {
		Double result;
		switch (thirdString) {
		case "1": // 附加保額*{附加保額倍數}
			result = paymentAmountModel.getAdditionInsAmtMultiple();
			break;

		case "2": // 附加保額*給付比例
			result = Double.valueOf(paymentAmountModel.getDisabledPaymentRatio());
			break;

		default:
			result = 1.0;
		}

		return result;
	}

	private static double findCAThird(InjuryPaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": // {每單位金額 }*約定單位投保數
			result = Double.valueOf(paymentAmountModel.getAgreementInsuredUnits());
			break;

		case "2": // "{每單位金額 }*住院天數
			result = Double.valueOf(paymentAmountModel.getInpatientDays());
			break;

		}
		return result;
	}

}
