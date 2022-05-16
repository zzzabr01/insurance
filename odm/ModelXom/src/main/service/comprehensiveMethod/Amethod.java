package main.service.comprehensiveMethod;

import java.math.BigDecimal;

import main.model.payment.ComprehensivePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Amethod {
	
	public static BigDecimal totalNum(ComprehensivePaymentAmountModel paymentAmountModel, String calculType) {
		double first = 1.0, v1 = 1.0;
		BigDecimal finalCalculatingNum;

		if ("AA".equals(calculType.substring(0, 2))) {
			first = paymentAmountModel.getInsuranceAmount();
			v1 = findAAThird(paymentAmountModel, calculType.substring(2));
		} else if ("BA1".equals(calculType)){
			first = paymentAmountModel.getHospitalIncome();
			v1 = paymentAmountModel.getHospitalIncomeMultiple();
		} else if ("CA1".equals(calculType)) {// CA1 ~ CA2
			first = paymentAmountModel.getTotalAmountEachInsuranceAmount();
			v1 = paymentAmountModel.getIncrementRatioOfNoClaimRecord();
		} else if ("DA1".equals(calculType)) {
			first = paymentAmountModel.getPaymentAmountOfApplyThisTime();
			v1 = paymentAmountModel.getIncrementRatioOfNoClaimRecord();
		} else if ("GA1".equals(calculType)) {
			first = paymentAmountModel.getPaidTotalPremium();
			v1 = 1.0;
		} else if ("IA1".equals(calculType)) {
			first = paymentAmountModel.getAnnualTotalInsurancePremium();
			v1 = paymentAmountModel.getAnnualTotalPremiumPaidMultiple();
		}else if ("JA1".equals(calculType)) {
			first = paymentAmountModel.getCurrentYearInsuranceAmt();
			v1 = paymentAmountModel.getCurrentYearInsuranceAmtMultiple();
		} else if ("KA1".equals(calculType)) {
			first = paymentAmountModel.getPolicyValueAmount();
			v1 = 1.0;
		} 
		else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingA(first, v1);
		return finalCalculatingNum;
	}
	
	
	private static double findAAThird(ComprehensivePaymentAmountModel paymentAmountModel, String thirdString) {
		Double result;
		switch (thirdString) {
		case "1": 
			result = paymentAmountModel.getMultiple();
			break;

		case "2": 
			result = paymentAmountModel.getSpecificTreatmentMultiple();
			break;
		case "3": 
			result = paymentAmountModel.getDisabledPayRatio();
			break;

		default:
			result = 1.0;
		}

		return result;
	}

}
