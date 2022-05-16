package main.service.healthMethod;

import java.math.BigDecimal;

import main.model.payment.HealthPaymentAmountModel;
import main.utilities.CalculateUtil;

public class Smethod {

	public static BigDecimal totalNum(HealthPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1.0, v1 = 1.0, v2 = 1.0;
		BigDecimal finalCalculatingNum;
		if ("AS".equals(calculType.substring(0, 2))) {
			first = paymentAmountModel.getInsuranceAmount();
			v1 = paymentAmountModel.getMultiple();
			v2 = findASThird(paymentAmountModel, calculType.substring(2));
		} else if ("BS".equals(calculType.substring(0, 2))) {
			first = paymentAmountModel.getAgreementInsuredUnits();
			v1 = paymentAmountModel.getAmountPerUnit();
			v2 = findBSThird(paymentAmountModel, calculType.substring(2));
		} else if ("CS1".equals(calculType)) {
			first = paymentAmountModel.getMultiple();
			v1 = paymentAmountModel.getAgreementInsuredUnits();
			v2 = paymentAmountModel.getTotalAmountEachInsuranceAmount();
		} else if ("ES".equals(calculType.substring(0, 2))) {
			first = paymentAmountModel.getHospitalIncome();
			v1 = paymentAmountModel.getHospitalIncomeMultiple();
			v2 = findESThird(paymentAmountModel, calculType.substring(2));
		}

		finalCalculatingNum = CalculateUtil.finalCalculatingS(first, v1, v2);
		return finalCalculatingNum;
	}
	
	private static double findASThird(HealthPaymentAmountModel paymentAmountModel, String thirdString) {
		Double result;
		switch (thirdString) {
		case "1":
			result = paymentAmountModel.getPaymentRatio();
			break;

		case "2":
			result = paymentAmountModel.getAgreementInsuredUnits();
			break;
			
		case "3":
			result = paymentAmountModel.getNumberOfOutpatient();
			break;

		case "4":
			result = paymentAmountModel.getNumberOfTreatmentInHospital();
			break;
			
		case "5":
			result = paymentAmountModel.getDaysOfRecuperationAtHome();
			break;
		case "6":
			result = paymentAmountModel.getInpatientDays();
			break;

		default:
			result = 1.0;
		}

		return result;
	}
	
	private static double findBSThird(HealthPaymentAmountModel paymentAmountModel, String thirdString) {
		double result;
		switch (thirdString) {
		case "1":
			result = paymentAmountModel.getNumberOfInHospital();
			break;

		case "2":
			result = paymentAmountModel.getOutpatientDays();
			break;
			
		case "3":
			result = paymentAmountModel.getNumberOfOutpatientSurgery();
			break;
			
		case "4":
			result = paymentAmountModel.getNumberOfOutpatientChemotherapy();
			break;
			
		case "5":
			result = paymentAmountModel.getNumberOfOutpatient();
			break;
		case "6":
			result = paymentAmountModel.getNumberOfOutpatientRadiation();
			break;
		case "7":
			result = paymentAmountModel.getNumberOfSurgicalOperations();
			break;
		case "8":
			result = paymentAmountModel.getInpatientDays();
			break;
		default:
			result = 1.0;
		}

		return result;
	}

	private static double findESThird(HealthPaymentAmountModel paymentAmountModel, String thirdString) {
		Double result;
		switch (thirdString) {
		case "1":
			result = paymentAmountModel.getHeathInsuranceBenefitsMultiple();
			break;

		case "2":
			result = paymentAmountModel.getBurnWardDays();
			break;
		case "3":
			result = paymentAmountModel.getiCUDays();
			break;
		case "4":
			result = paymentAmountModel.getOutpatientDays();
			break;
		case "5":
			result = paymentAmountModel.getInpatientDays();
			break;

		default:
			result = 1.0;
		}

		return result;
	}
	
}
