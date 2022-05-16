package main.service.lifeMethod;

import java.math.BigDecimal;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

/**
 * 已與 RA 合併
 * 
 * @author RickHsu
 *
 */
public class Qmethod {

	public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType) {

		double first = 1, v1 = 1, v2 = 1, v3 = 1;
		BigDecimal finalCalculatingNum;
		//
		if ("RQ1".equals(calculType)) {
			first = 0.0;
			v1 = 0.0;
			v2 = 0.0;

		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingQ(first, v1, v2);
		return finalCalculatingNum;

	}

}
