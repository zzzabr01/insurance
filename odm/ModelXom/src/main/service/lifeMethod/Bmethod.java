package main.service.lifeMethod;

import java.math.BigDecimal;

import main.model.payment.LifePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Bmethod {

	public static BigDecimal totalNum(LifePaymentAmountModel paymentAmountModel, String calculType) {

		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1;
		BigDecimal finalCalculatingNum;

		if ("AB".equals(calculType.substring(0, 2))) { // AB1 ~ AB3
			first = paymentAmountModel.getInsuranceAmount();
			v1 = findABThird(paymentAmountModel, calculType.substring(2));
		} else if ("BB1".equals(calculType)) {
			first = paymentAmountModel.getCurrentYearInsuranceAmt();
			v1 = paymentAmountModel.getUnearnedPremium();
		}else if("BB2".equals(calculType)){ 
			first = paymentAmountModel.getCurrentYearInsuranceAmt();
			v1 = paymentAmountModel.getPaidTotalPremiumA();
		}else if ("EB".equals(calculType.substring(0, 2))) { // EB1 ~ EB3
			first = paymentAmountModel.getPaidTotalPremiumA(); // 所繳保險費總額 + X
			v1 = findEBThird(paymentAmountModel, calculType.substring(2));
		} else if ("FB1".equals(calculType)) {
			first = paymentAmountModel.getPaidTotalPremiumB(); 
			v1 = paymentAmountModel.getTotalPremiumInterest();
		} else if ("JB1".equals(calculType)) {
			first = paymentAmountModel.getSinglePremium();  
			v1 = paymentAmountModel.getSinglePremiumInterest();
		} else if ("KB1".equals(calculType)) {
			double tmp1 = 0.0, tmp2 =0.0, tmpSum = 0.0;
        	tmp1 = paymentAmountModel.getInsuranceAmount();
        	tmp2 = paymentAmountModel.getIncreaseValueInsuranceAmt();
        	tmpSum = tmp1 + tmp2;
            first = tmpSum; //當年度增額保額  = 保額 + 增值保額
			v1 = paymentAmountModel.getSurvivalInsurance();
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingB(first, v1);
		return finalCalculatingNum;
	}

	private static double findABThird(LifePaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": // 保額 + 未到期保費
			result = Double.valueOf(paymentAmountModel.getUnearnedPremium());
			break;

		case "2": // 保額 + 所繳保費總額
			result = Double.valueOf(paymentAmountModel.getPaidTotalPremiumA());
			break;

		case "3": // 保額+增值保額
			result = Double.valueOf(paymentAmountModel.getIncreaseValueInsuranceAmt());
			break;
		}
		return result;
	}

	private static double findEBThird(LifePaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": // 特別承保保費
			result = Double.valueOf(paymentAmountModel.getSpecialUnderwritingPremium());
			break;

		case "2": // 所繳保險費總額利息
			result = Double.valueOf(paymentAmountModel.getTotalPremiumInterest());
			break;

		case "3": // 年繳化保險費逐年依年利率百分之三複利計算至身故時保單年度
			result = 1.0;
			break;
		}
		return result;
	}

}
