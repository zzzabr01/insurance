package main.service.investmentMethod;

import java.math.BigDecimal;

import main.model.payment.InvestmentPaymentAmountModel;
import main.utilities.CalculateUtil;

public class Bmethod {
	public static BigDecimal totalNum(InvestmentPaymentAmountModel paymentAmountModel, String calculType) {

		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1, v1 = 1;
		BigDecimal finalCalculatingNum;

		if ("AB".equals(calculType.substring(0, 2))) { 
			first = paymentAmountModel.getInsuranceAmount();
			v1 = findABThird(paymentAmountModel, calculType.substring(2));
		}else if("BB".equals(calculType.substring(0, 2))) {
			first = paymentAmountModel.getPolicyAccountValue();
			v1 = findBBThird(paymentAmountModel, calculType.substring(2));
		}  else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingB(first, v1);
		return finalCalculatingNum;
}
	
	private static double findABThird(InvestmentPaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": // 保額 + 保單價值準備金
			result = Double.valueOf(paymentAmountModel.getPolicyValueAmount());
			break;

		case "2": // 保額 + 保單帳戶價值
			result = Double.valueOf(paymentAmountModel.getPolicyAccountValue());
			break;
		
		case "3":
			result =  Double.valueOf(paymentAmountModel.getDeductUnearnedPremiumByDays());
			break;
		case "4":
			result =  Double.valueOf(paymentAmountModel.getDeathOverflowInsuranceCost());
			break;
		case "5":
			result =  Double.valueOf(paymentAmountModel.getTotallyDisabilityOverflowInsuranceCost());
			break;
		}
		return result;
	}
	
	private static double findBBThird(InvestmentPaymentAmountModel paymentAmountModel, String thirdString) {
		Double result = 1.0;
		switch (thirdString) {
		case "1": 
			result =  Double.valueOf(paymentAmountModel.getDeductUnearnedPremiumByDays());
			break;

		case "2": 
			result =  Double.valueOf(paymentAmountModel.getDeathOverflowInsuranceCost());
			break;
		
		case "3":
			result =  Double.valueOf(paymentAmountModel.getTotallyDisabilityOverflowInsuranceCost());
			break;
		}
		return result;
	}
}	
	
