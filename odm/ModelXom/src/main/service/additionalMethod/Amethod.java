package main.service.additionalMethod;

import java.math.BigDecimal;

import main.model.payment.AdditionalPaymentAmountModel;
import main.utilities.CalculateUtil;

public class Amethod {

	public static BigDecimal totalNum(AdditionalPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1.0, v1 = 1.0;
		BigDecimal finalCalculatingNum;

		if ("AA".equals(calculType.substring(0, 2))) { 
			first = paymentAmountModel.getInsuranceAmount();
			v1 = findAAThird(paymentAmountModel, calculType.substring(2));
		} else if ("CA1".equals(calculType)) {
			first = paymentAmountModel.getDailyAmountOfICU();
			v1 = paymentAmountModel.getInpatientDaysForICU();	
		} else if ("DA1".equals(calculType)) {
			first = paymentAmountModel.getDailyAmountOfBurnAndScaldWard();
			v1 = Double.valueOf(paymentAmountModel.getInpatientDaysForBurnAndScald());	
		} else if ("EA1".equals(calculType)) {
			first = paymentAmountModel.getMedicalExpensesOfOutpatientSurgery();
			v1 = paymentAmountModel.getActualMedicalExpenseMultiple();
		} else if ("FA1".equals(calculType)) {
			first = paymentAmountModel.getInsuredAmountForOutpatientBeforeAndAfterTheHospitalization();
			v1 = paymentAmountModel.getOutpatientDays();
		} else if ("GA1".equals(calculType)) {
			first = paymentAmountModel.getExactMedicalExpensesOfEmergency();
			v1 = paymentAmountModel.getActualMedicalExpenseMultiple();
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingA(first, v1);
		return finalCalculatingNum;
	}

	private static double findAAThird(AdditionalPaymentAmountModel paymentAmountModel, String thirdString) {
		Double result;
		switch (thirdString) {
		case "1": // 保額*保額倍數
			result = paymentAmountModel.getMultiple();
			break;

		case "2": // 保額*給付比例
			result = paymentAmountModel.getPaymentRatio();
			break;

		default:
			result = 1.0;
		}

		return result;
	}

	

}
