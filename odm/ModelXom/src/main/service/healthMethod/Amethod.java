package main.service.healthMethod;

import java.math.BigDecimal;

import main.model.payment.HealthPaymentAmountModel;
import main.utilities.CalculateUtil;

public class Amethod {

	public static BigDecimal totalNum(HealthPaymentAmountModel paymentAmountModel, String calculType) {
		// 取 calculType AB1 BB1 CB1...公式中所需要的值
		double first = 1.0, v1 = 1.0;
		BigDecimal finalCalculatingNum;

		if ("AA1".equals(calculType)) {
			first = paymentAmountModel.getInsuranceAmount();
			v1 = paymentAmountModel.getMultiple();
		} else if ("BA1".equals(calculType)) {
			first = paymentAmountModel.getAgreementInsuredUnits();
			v1 = paymentAmountModel.getAmountPerUnit();
		}else if ("CA".equals(calculType.substring(0, 2))) {
			first = paymentAmountModel.getMultiple();
			v1 = findCAThird(paymentAmountModel, calculType.substring(2));
		}else if ("DA1".equals(calculType)) {
			first = paymentAmountModel.getActualEmergencyCost();
			v1 = paymentAmountModel.getHeathInsuranceBenefitsMultiple();
		} else if ("EA1".equals(calculType)) {
			first = paymentAmountModel.getHospitalIncome();
			v1 = paymentAmountModel.getHospitalIncomeMultiple();
		}else if ("FA1".equals(calculType)) {
			first = paymentAmountModel.getCurrentUnexpiredPremiums();
			v1 = 1.0;
		}else if ("GA1".equals(calculType)) {
			first = paymentAmountModel.getInsuranceAmountOfmainAndAccessoryContractBeforeExempted();
			v1 = 1.0;
		} else if ("HA1".equals(calculType)) {
			first = paymentAmountModel.getActualEmergencyTransportAmount(); 
			v1 = 1.0;
		} 
		else if ("IA1".equals(calculType)) {
			first = paymentAmountModel.getReceivedInsuranceAmount();
			v1 = 1.0;
		} else
			;

		finalCalculatingNum = CalculateUtil.finalCalculatingA(first, v1);
		return finalCalculatingNum;
	}
	
	private static double findCAThird(HealthPaymentAmountModel paymentAmountModel, String thirdString) {
		Double result;
		switch (thirdString) {
		case "1":
			result = paymentAmountModel.getDisabilityEquipmentPurchaseInsurance();
			break;

		case "2":
			result =paymentAmountModel.getInsuranceLevelOfSurgicalCostLimitRatio();
			break;

		case "3":
			result = paymentAmountModel.getTotalAmountEachInsuranceAmount();
			break;
		case "4":
			result = paymentAmountModel.getAgreementInsuredUnitsOfSpecialSurgeryAmount();
			break;

		default:
			result = 1.0;
		}

		return result;
	}

}
