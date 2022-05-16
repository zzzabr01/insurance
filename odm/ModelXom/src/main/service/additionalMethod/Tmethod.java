package main.service.additionalMethod;

import java.math.BigDecimal;

import main.model.payment.AdditionalPaymentAmountModel;
import main.utilities.CalculateUtil;

public class Tmethod {

	public static BigDecimal totalNum(AdditionalPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1.0, v1 = 1.0, v2 = 1.0, v3 = 1.0, v4 = 1.0;
		BigDecimal finalCalculatingNum;
		if ("BT1".equals(calculType)) {
			first = paymentAmountModel.getNumberOfDaysSetByFracture();
			v1 = paymentAmountModel.getNumberOfDaysSetByFractureMultiple(); 
			v2 = paymentAmountModel.getInpatientDays();
			v3 = paymentAmountModel.getHospitalIncome();
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingT(first, v1, v2, v3, v4);
		return finalCalculatingNum;

	}

}
