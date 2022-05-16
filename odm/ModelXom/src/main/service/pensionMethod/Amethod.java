package main.service.pensionMethod;

import java.math.BigDecimal;

import main.model.payment.PensionPaymentAmountModel;
import main.utilities.CalculateUtil;

public class Amethod {

	public static BigDecimal totalNum(PensionPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1.0, v1 = 1.0;
		BigDecimal finalCalculatingNum;

		if   ("AA1".equals(calculType)) {
			first = paymentAmountModel.getTotalPremiumsPaid();
			v1 =1.0;	
		} else if ("DA1".equals(calculType)) {
			first = paymentAmountModel.getPolicyValueAmount();
			v1 =1.0;	
		}  else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingA(first, v1);
		return finalCalculatingNum;
	}

	 

	

}
