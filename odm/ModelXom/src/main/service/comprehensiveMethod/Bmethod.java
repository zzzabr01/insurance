package main.service.comprehensiveMethod;

import java.math.BigDecimal;

import main.model.payment.ComprehensivePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Bmethod {
	public static BigDecimal totalNum(ComprehensivePaymentAmountModel paymentAmountModel, String calculType) {

		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1;
		BigDecimal finalCalculatingNum;

	 if ("FB1".equals(calculType)) {
			first = paymentAmountModel.getBasicInsuranceAmount();
			v1 = paymentAmountModel.getTotalIncreaseInsuranceAmount();
		} else if ("GB".equals(calculType.subSequence(0, 2))) {
			first = paymentAmountModel.getPaidTotalPremium();
			v1 = findGBThird(paymentAmountModel, calculType.substring(2));
		} else if ("JB".equals(calculType.subSequence(0, 2))) {
			first = paymentAmountModel.getCurrentYearInsuranceAmt();
			v1 = findJBThird(paymentAmountModel,calculType.substring(2));
		}else if("KB1".equals(calculType)){
			first = paymentAmountModel.getPolicyValueAmount();
			v1 = paymentAmountModel.getUnearnedPremium();
		}else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingB(first, v1);
		return finalCalculatingNum;
	}
	
	private static double findGBThird(ComprehensivePaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": 
			result = paymentAmountModel.getInterest();
			break;

		case "2": 
			result = paymentAmountModel.getUnearnedPremium();
			break;
		
		}
		return result;
	}
	
	private static double findJBThird(ComprehensivePaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": 
			result = paymentAmountModel.getCashSurrenderValueForHealthAndInjuryInsurance();
			break;

		case "2": 
			result = paymentAmountModel.getCashSurrenderValueForInjuryInsurance();
			break;
		
		}
		return result;
	}
}
