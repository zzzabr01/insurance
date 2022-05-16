package main.service.comprehensiveMethod;

import java.math.BigDecimal;

import main.model.payment.ComprehensivePaymentAmountModel;
import main.utilities.CalculateUtil;

public class Smethod {

	public static BigDecimal totalNum(ComprehensivePaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1.0, v1 = 1.0, v2 = 1.0;
		BigDecimal finalCalculatingNum;
		if ("AS".equals(calculType.substring(0, 2))) {
			first = paymentAmountModel.getInsuranceAmount();
			v1 = paymentAmountModel.getMultiple();
			v2 = findASThird(paymentAmountModel, calculType.substring(2));
		} else if ("BS".equals(calculType.substring(0, 2))) {
			first = paymentAmountModel.getHospitalIncome();
			v1 = paymentAmountModel.getHospitalIncomeMultiple();
			v2 = findBSThird(paymentAmountModel, calculType.substring(2));
		} else if ("ES1".equals(calculType)) {
			first = paymentAmountModel.getDailyUnitIncome();
			v1 = paymentAmountModel.getDailyUnitMultiple();
			v2 = paymentAmountModel.getInpatientDays();
		}  else if ("JS1".equals(calculType)) {
			first = paymentAmountModel.getCurrentYearInsuranceAmt();
			v1 = paymentAmountModel.getCurrentYearInsuranceAmtMultiple();
			v2 = paymentAmountModel.getTotallyDisabilitySupportMultiple();
		}

		finalCalculatingNum = CalculateUtil.finalCalculatingS(first, v1, v2);
		return finalCalculatingNum;
	}
	
	private static double findASThird(ComprehensivePaymentAmountModel paymentAmountModel, String thirdString) {
		Double result;
		switch (thirdString) {
		case "1":
			result = paymentAmountModel.getSurgeryPaymentMultiple();
			break;

		case "2":
			result = paymentAmountModel.getDisabledPayRatio();
			break;
		default:
			result = 1.0;
		}
		
		return result;
	}
	
	private static double findBSThird(ComprehensivePaymentAmountModel paymentAmountModel, String thirdString) {
		double result;
		switch (thirdString) {
		case "1":
			result = paymentAmountModel.getInpatientDays();
			break;

		case "2":
			result = paymentAmountModel.getOutpatientDays();
			break;
			
		case "3":
			result = paymentAmountModel.getHospiceDays();
			break;
			
		case "4":
			result = paymentAmountModel.getBurnWardDays();
			break;
			
		case "5":
			result = paymentAmountModel.getIcuDays();
			break;
		default:
			result = 1.0;
		}

		return result;
	}

}
